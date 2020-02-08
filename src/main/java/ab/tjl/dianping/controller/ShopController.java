package ab.tjl.dianping.controller;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.common.CommonRes;
import ab.tjl.dianping.common.EmBusinessError;
import ab.tjl.dianping.model.CategoryModel;
import ab.tjl.dianping.model.ShopModel;
import ab.tjl.dianping.service.CategoryService;
import ab.tjl.dianping.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:TangJiLin
 * @Description:前台门店控制层
 * @Date: Created in 2020/2/8 9:32
 * @Modified By:
 */
@Controller("/shop")
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 推荐服务V1.0
     * @param longitude
     * @param latitude
     * @return
     * @throws BusinessException
     */
    @RequestMapping("/recommend")
    @ResponseBody
    public CommonRes recommend(@RequestParam(name="longitude")BigDecimal longitude,
                               @RequestParam(name="latitude")BigDecimal latitude) throws BusinessException {
        if(longitude == null || latitude == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModelList = shopService.recommend(longitude,latitude);
        return CommonRes.create(shopModelList);
    }

    /**
     * 搜索服务V1.0
     * @param longitude
     * @param latitude
     * @param keyword
     * @param orderby
     * @param categoryId
     * @param tags
     * @return
     * @throws BusinessException
     */
    @RequestMapping("/search")
    @ResponseBody
    public CommonRes search(@RequestParam(name="longitude")BigDecimal longitude,
                            @RequestParam(name="latitude")BigDecimal latitude,
                            @RequestParam(name="keyword")String keyword,
                            @RequestParam(name="orderby",required = false)Integer orderby,
                            @RequestParam(name="categoryId",required = false)Integer categoryId,
                            @RequestParam(name="tags",required = false)String tags) throws BusinessException {
        if(StringUtils.isEmpty(keyword) || longitude == null || latitude == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModelList = shopService.search(longitude,latitude,keyword,orderby,categoryId,tags);
        List<CategoryModel> categoryModelList = categoryService.selectAll();
        List<Map<String,Object>> tagsAggregation = shopService.searchGroupByTags(keyword,categoryId,tags);
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("shop",shopModelList);
        resMap.put("category",categoryModelList);
        resMap.put("tags",tagsAggregation);
        return CommonRes.create(resMap);

    }
}
