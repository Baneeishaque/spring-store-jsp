package ndk.banee.spring_jstore.mapper;


import ndk.banee.spring_jstore.domain.ShoppingCart;
import ndk.banee.spring_jstore.domain.ShoppingCartExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

public interface ShoppingCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    long countByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int deleteByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int deleteByPrimaryKey(Long cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int insert(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int insertSelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    ShoppingCart selectByPrimaryKey(Long cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    int updateByPrimaryKey(ShoppingCart record);

    @Select("Select * from ShoppingCart sc LEFT JOIN product p ON p.productid = sc.productid WHERE customeriid = #{customeriid} AND price = #{price}")
    List<ShoppingCart> productInfo(@Param("customeriid") Integer id, @Param("productid") Integer pid, @Param("price") BigDecimal price);

    ShoppingCart getShoppingCartById(@Param("customeriid") Integer id);

    @Select("SELECT SUM(price) AS TotalPrice FROM ShoppingCart WHERE customeriid = #{customeriid}")
    BigDecimal totalPrice(@Param("customeriid") Integer customeriid);
}