package ndk.banee.spring_jstore.mapper;

import ndk.banee.spring_jstore.domain.shipping;
import ndk.banee.spring_jstore.domain.shippingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface shippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    long countByExample(shippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByExample(shippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByPrimaryKey(Integer shippingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insert(shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insertSelective(shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    List<shipping> selectByExample(shippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    shipping selectByPrimaryKey(Integer shippingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") shipping record, @Param("example") shippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExample(@Param("record") shipping record, @Param("example") shippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKeySelective(shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKey(shipping record);
}
