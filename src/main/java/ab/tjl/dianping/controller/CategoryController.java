package ab.tjl.dianping.controller;

import ab.tjl.dianping.common.CommonRes;
import ab.tjl.dianping.model.CategoryModel;
import ab.tjl.dianping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description:前台品类控制层
 * @Date: Created in 2020/2/7 16:33
 * @Modified By:
 */
@Controller("/category")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 品类列表
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public CommonRes list(){
        List<CategoryModel> categoryModelList = categoryService.selectAll();
        return CommonRes.create(categoryModelList);
    }

}
