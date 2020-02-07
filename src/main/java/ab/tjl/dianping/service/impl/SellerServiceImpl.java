package ab.tjl.dianping.service.impl;


import ab.tjl.dianping.common.BusinessException;
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

    @Override
    public SellerModel create(SellerModel sellerModel) {
        return null;
    }

    @Override
    public SellerModel get(Integer id) {
        return null;
    }

    @Override
    public List<SellerModel> selectAll() {
        return sellerModelMapper.selectAll();
    }

    @Override
    public SellerModel changeStatus(Integer id, Integer disabledFlag) throws BusinessException {
        return null;
    }
}
