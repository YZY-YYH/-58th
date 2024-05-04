package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketGrouponRules;
import com.cskaoyan.market.db.domain.MarketGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int insert(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    MarketGrouponRules selectOneByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    MarketGrouponRules selectOneByExampleSelective(@Param("example") MarketGrouponRulesExample example, @Param("selective") MarketGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    List<MarketGrouponRules> selectByExampleSelective(@Param("example") MarketGrouponRulesExample example, @Param("selective") MarketGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    List<MarketGrouponRules> selectByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    MarketGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    MarketGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    MarketGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketGrouponRules record, @Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketGrouponRules record, @Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}