package com.mzh.financial.back.admin.accountmng.dao;

import com.mzh.financial.back.admin.accountmng.domain.TDataAccount;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDataAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    long countByExample(TDataAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int deleteByExample(TDataAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int insert(TDataAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int insertSelective(TDataAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    List<TDataAccount> selectByExample(TDataAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    TDataAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int updateByExampleSelective(@Param("record") TDataAccount record, @Param("example") TDataAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int updateByExample(@Param("record") TDataAccount record, @Param("example") TDataAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int updateByPrimaryKeySelective(TDataAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    int updateByPrimaryKey(TDataAccount record);
}