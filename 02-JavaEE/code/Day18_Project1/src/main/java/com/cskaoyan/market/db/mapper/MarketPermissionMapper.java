package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketPermission;
import com.cskaoyan.market.db.domain.MarketPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    long countByExample(MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int deleteByExample(MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int insert(MarketPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int insertSelective(MarketPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    MarketPermission selectOneByExample(MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    MarketPermission selectOneByExampleSelective(@Param("example") MarketPermissionExample example, @Param("selective") MarketPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    List<MarketPermission> selectByExampleSelective(@Param("example") MarketPermissionExample example, @Param("selective") MarketPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    List<MarketPermission> selectByExample(MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    MarketPermission selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    MarketPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    MarketPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketPermission record, @Param("example") MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketPermission record, @Param("example") MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}