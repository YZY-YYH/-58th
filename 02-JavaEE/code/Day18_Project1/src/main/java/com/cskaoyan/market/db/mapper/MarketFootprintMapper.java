package com.cskaoyan.market.db.mapper;

import com.cskaoyan.market.db.domain.MarketFootprint;
import com.cskaoyan.market.db.domain.MarketFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    long countByExample(MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int insert(MarketFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int insertSelective(MarketFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    MarketFootprint selectOneByExample(MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    MarketFootprint selectOneByExampleSelective(@Param("example") MarketFootprintExample example, @Param("selective") MarketFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    List<MarketFootprint> selectByExampleSelective(@Param("example") MarketFootprintExample example, @Param("selective") MarketFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    List<MarketFootprint> selectByExample(MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    MarketFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MarketFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    MarketFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    MarketFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MarketFootprint record, @Param("example") MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MarketFootprint record, @Param("example") MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MarketFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MarketFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MarketFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}