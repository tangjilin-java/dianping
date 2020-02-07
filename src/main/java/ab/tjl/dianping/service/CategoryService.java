package ab.tjl.dianping.service;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.model.CategoryModel;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description:品类业务接口
 * @Date: Created in 2020/2/7 15:30
 * @Modified By:
 */
public interface CategoryService {
    CategoryModel create(CategoryModel categoryModel) throws BusinessException;

    CategoryModel get(Integer id);

    List<CategoryModel> selectAll();
}
