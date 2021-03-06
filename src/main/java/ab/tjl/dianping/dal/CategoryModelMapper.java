package ab.tjl.dianping.dal;

import ab.tjl.dianping.model.CategoryModel;

import java.util.List;

public interface CategoryModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 查询所有品类
     * @return
     */
    List<CategoryModel> selectAll();

    /**
     * 统计所有品类
     * @return
     */
    Integer countAllCategory();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    int insert(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    int insertSelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    CategoryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    int updateByPrimaryKeySelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Fri Feb 07 15:57:47 CST 2020
     */
    int updateByPrimaryKey(CategoryModel record);
}