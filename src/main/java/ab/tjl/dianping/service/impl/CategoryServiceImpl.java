package ab.tjl.dianping.service.impl;

import ab.tjl.dianping.common.BusinessException;
import ab.tjl.dianping.common.EmBusinessError;
import ab.tjl.dianping.dal.CategoryModelMapper;
import ab.tjl.dianping.model.CategoryModel;
import ab.tjl.dianping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.BufferOverflowException;
import java.util.Date;
import java.util.List;

/**
 * @Author:TangJiLin
 * @Description:品类业务层接口实现类
 * @Date: Created in 2020/2/7 15:32
 * @Modified By:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryModelMapper categoryModelMapper;

    /**
     * 创建品类
     * @param categoryModel
     * @return
     * @throws BusinessException
     */
    @Override
    @Transactional
    public CategoryModel create(CategoryModel categoryModel) throws BusinessException {
        categoryModel.setCreatedAt(new Date());
        categoryModel.setUpdatedAt(new Date());

        try{
            categoryModelMapper.insertSelective(categoryModel);
        }catch (DuplicateKeyException ex){
            throw new BusinessException(EmBusinessError.CATEGORY_NAME_DUPLICATED);
        }
        return get(categoryModel.getId());
    }

    /**
     * 通过id查找品类
     * @param id
     * @return
     */
    @Override
    public CategoryModel get(Integer id) {
        return categoryModelMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找所有的品类
     * @return
     */
    @Override
    public List<CategoryModel> selectAll() {
        return categoryModelMapper.selectAll();
    }
}
