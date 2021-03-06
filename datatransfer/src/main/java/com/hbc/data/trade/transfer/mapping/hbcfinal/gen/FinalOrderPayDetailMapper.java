package com.hbc.data.trade.transfer.mapping.hbcfinal.gen;

import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderPayDetail;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderPayDetailCriteria;
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

public interface FinalOrderPayDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPayDetailSqlProvider.class, method="countByExample")
    int countByExample(FinalOrderPayDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalOrderPayDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalOrderPayDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `orderpaydetail`",
        "where orderPayDetailId = #{orderpaydetailid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String orderpaydetailid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `orderpaydetail` (orderPayDetailId, orderId, ",
        "orderPayType, clientType, ",
        "clientId, clientName, ",
        "channel, gateway, ",
        "plat, consumeAmount, ",
        "rechargeAmount, refundAmount, ",
        "payConsumeId, payRechargeId, ",
        "payRefundId, status, ",
        "rawData, updated_at, ",
        "created_at)",
        "values (#{orderpaydetailid,jdbcType=VARCHAR}, #{orderid,jdbcType=VARCHAR}, ",
        "#{orderpaytype,jdbcType=INTEGER}, #{clienttype,jdbcType=VARCHAR}, ",
        "#{clientid,jdbcType=VARCHAR}, #{clientname,jdbcType=VARCHAR}, ",
        "#{channel,jdbcType=VARCHAR}, #{gateway,jdbcType=INTEGER}, ",
        "#{plat,jdbcType=INTEGER}, #{consumeamount,jdbcType=INTEGER}, ",
        "#{rechargeamount,jdbcType=INTEGER}, #{refundamount,jdbcType=INTEGER}, ",
        "#{payconsumeid,jdbcType=VARCHAR}, #{payrechargeid,jdbcType=VARCHAR}, ",
        "#{payrefundid,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{rawdata,jdbcType=VARCHAR}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalOrderPayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalOrderPayDetailSqlProvider.class, method="insertSelective")
    int insertSelective(FinalOrderPayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPayDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderPayDetailId", property="orderpaydetailid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderPayType", property="orderpaytype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientName", property="clientname", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateway", property="gateway", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="consumeAmount", property="consumeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="rechargeAmount", property="rechargeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="refundAmount", property="refundamount", jdbcType=JdbcType.INTEGER),
        @Result(column="payConsumeId", property="payconsumeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRechargeId", property="payrechargeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRefundId", property="payrefundid", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="rawData", property="rawdata", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderPayDetail> selectByExampleWithRowbounds(FinalOrderPayDetailCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPayDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderPayDetailId", property="orderpaydetailid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderPayType", property="orderpaytype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientName", property="clientname", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateway", property="gateway", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="consumeAmount", property="consumeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="rechargeAmount", property="rechargeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="refundAmount", property="refundamount", jdbcType=JdbcType.INTEGER),
        @Result(column="payConsumeId", property="payconsumeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRechargeId", property="payrechargeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRefundId", property="payrefundid", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="rawData", property="rawdata", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderPayDetail> selectByExample(FinalOrderPayDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "orderPayDetailId, orderId, orderPayType, clientType, clientId, clientName, channel, ",
        "gateway, plat, consumeAmount, rechargeAmount, refundAmount, payConsumeId, payRechargeId, ",
        "payRefundId, status, rawData, updated_at, created_at",
        "from `orderpaydetail`",
        "where orderPayDetailId = #{orderpaydetailid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="orderPayDetailId", property="orderpaydetailid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderPayType", property="orderpaytype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="clientName", property="clientname", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateway", property="gateway", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="consumeAmount", property="consumeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="rechargeAmount", property="rechargeamount", jdbcType=JdbcType.INTEGER),
        @Result(column="refundAmount", property="refundamount", jdbcType=JdbcType.INTEGER),
        @Result(column="payConsumeId", property="payconsumeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRechargeId", property="payrechargeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="payRefundId", property="payrefundid", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="rawData", property="rawdata", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalOrderPayDetail selectByPrimaryKey(String orderpaydetailid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPayDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalOrderPayDetail record, @Param("example") FinalOrderPayDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPayDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalOrderPayDetail record, @Param("example") FinalOrderPayDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPayDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalOrderPayDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderpaydetail`
     *
     * @mbggenerated
     */
    @Update({
        "update `orderpaydetail`",
        "set orderId = #{orderid,jdbcType=VARCHAR},",
          "orderPayType = #{orderpaytype,jdbcType=INTEGER},",
          "clientType = #{clienttype,jdbcType=VARCHAR},",
          "clientId = #{clientid,jdbcType=VARCHAR},",
          "clientName = #{clientname,jdbcType=VARCHAR},",
          "channel = #{channel,jdbcType=VARCHAR},",
          "gateway = #{gateway,jdbcType=INTEGER},",
          "plat = #{plat,jdbcType=INTEGER},",
          "consumeAmount = #{consumeamount,jdbcType=INTEGER},",
          "rechargeAmount = #{rechargeamount,jdbcType=INTEGER},",
          "refundAmount = #{refundamount,jdbcType=INTEGER},",
          "payConsumeId = #{payconsumeid,jdbcType=VARCHAR},",
          "payRechargeId = #{payrechargeid,jdbcType=VARCHAR},",
          "payRefundId = #{payrefundid,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "rawData = #{rawdata,jdbcType=VARCHAR},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where orderPayDetailId = #{orderpaydetailid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(FinalOrderPayDetail record);
}