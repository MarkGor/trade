package com.hbc.data.trade.transfer.mapping.hbcfinal.gen;

import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderJourney;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderJourneyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface FinalOrderJourneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderJourneySqlProvider.class, method="countByExample")
    int countByExample(FinalOrderJourneyCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalOrderJourneySqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalOrderJourneyCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `orderjourney`",
        "where orderJourneyId = #{orderjourneyid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer orderjourneyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `orderjourney` (orderJourneyId, orderId, ",
        "content, value, ",
        "type, status, isRead, ",
        "updated_at, created_at)",
        "values (#{orderjourneyid,jdbcType=INTEGER}, #{orderid,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, #{isread,jdbcType=INTEGER}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalOrderJourney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalOrderJourneySqlProvider.class, method="insertSelective")
    int insertSelective(FinalOrderJourney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderJourneySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderJourneyId", property="orderjourneyid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="isRead", property="isread", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderJourney> selectByExampleWithRowbounds(FinalOrderJourneyCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderJourneySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderJourneyId", property="orderjourneyid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="isRead", property="isread", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderJourney> selectByExample(FinalOrderJourneyCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "orderJourneyId, orderId, content, value, type, status, isRead, updated_at, created_at",
        "from `orderjourney`",
        "where orderJourneyId = #{orderjourneyid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="orderJourneyId", property="orderjourneyid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="isRead", property="isread", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalOrderJourney selectByPrimaryKey(Integer orderjourneyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderJourneySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalOrderJourney record, @Param("example") FinalOrderJourneyCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderJourneySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalOrderJourney record, @Param("example") FinalOrderJourneyCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderJourneySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalOrderJourney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderjourney`
     *
     * @mbggenerated
     */
    @Update({
        "update `orderjourney`",
        "set orderId = #{orderid,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "isRead = #{isread,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where orderJourneyId = #{orderjourneyid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinalOrderJourney record);
}