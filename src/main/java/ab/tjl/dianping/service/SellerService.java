package ab.tjl.dianping.service;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.model.SellerModel;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description:商家业务接口
 * @Date: Created in 2020/2/7 14:04
 * @Modified By:
 */
public interface SellerService {

    SellerModel create(SellerModel sellerModel);
    SellerModel get(Integer id);
    List<SellerModel> selectAll();
    SellerModel changeStatus(Integer id,Integer disabledFlag) throws BusinessException;

}
