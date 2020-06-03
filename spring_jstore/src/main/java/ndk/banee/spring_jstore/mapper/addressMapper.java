package ndk.banee.spring_jstore.mapper;

import ndk.banee.spring_jstore.domain.address;
import ndk.banee.spring_jstore.domain.addressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface addressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    long countByExample(addressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByExample(addressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insert(address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insertSelective(address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    List<address> selectByExample(addressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    address selectByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") address record, @Param("example") addressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExample(@Param("record") address record, @Param("example") addressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKeySelective(address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKey(address record);
}
