package com.ecommerce.one.ecommerce.mapper;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.productExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    long countByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insert(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insertSelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    List<product> selectByExampleWithBLOBs(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    List<product> selectByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    product selectByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExample(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKeySelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKey(product record);
}