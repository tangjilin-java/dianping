package ab.tjl.dianping.service;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author:TangJiLin
 * @Description:门店业务接口
 * @Date: Created in 2020/2/7 19:12
 * @Modified By:
 */
public interface ShopService {
    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

    Integer countAllShop();

   /* List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);

    List<Map<String,Object>> searchGroupByTags(String keyword, Integer categoryId, String tags);

    Integer countAllShop();

    List<ShopModel> search(BigDecimal longitude,BigDecimal latitude,
                           String keyword,Integer orderby,Integer categoryId,String tags);*/

}
