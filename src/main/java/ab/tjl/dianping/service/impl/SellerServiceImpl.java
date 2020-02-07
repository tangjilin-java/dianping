package ab.tjl.dianping.service.impl;


import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.common.EmBusinessError;
import ab.tjl.dianping.dal.SellerModelMapper;
import ab.tjl.dianping.model.SellerModel;
import ab.tjl.dianping.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * @Author:TangJiLin
 * @Description:商家业务层接口实现类
 * @Date: Created in 2020/2/7 14:06
 * @Modified By:
 */
@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerModelMapper sellerModelMapper;

    /**
     * 创建商户
     * @param sellerModel
     * @return
     */
    @Override
    public SellerModel create(SellerModel sellerModel) {
        sellerModel.setCreatedAt(new Date());
        sellerModel.setUodatedAt(new Date());
        sellerModel.setRemarkScore(new BigDecimal(0));
        sellerModel.setDisabledFlag(0);
        sellerModelMapper.insertSelective(sellerModel);
        return get(sellerModel.getId());//返回改商户
    }

    /**
     * 根据id查找商户信息
     * @param id
     * @return
     */
    @Override
    public SellerModel get(Integer id) {
        return sellerModelMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有的商家信息
     * @return
     */
    @Override
    public List<SellerModel> selectAll() {
        return sellerModelMapper.selectAll();
    }

    /**
     * 更新商户状态
     * @param id
     * @param disabledFlag
     * @return
     * @throws BusinessException
     */
    @Override
    public SellerModel changeStatus(Integer id, Integer disabledFlag) throws BusinessException {
        SellerModel sellerModel = get(id);
        if (sellerModel == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        sellerModel.setDisabledFlag(disabledFlag);
        sellerModelMapper.updateByPrimaryKeySelective(sellerModel);
        return sellerModel;
    }

    /**
     * 统计所有商户
     * @return
     */
    @Override
    public Integer countAllSeller() {
        return sellerModelMapper.countAllSeller();
    }
}
