package com.hbc.data.trade.transfer.mapping.hbcfinal.gen;

import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderPeruse;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalOrderPeruseCriteria;
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

public interface FinalOrderPeruseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPeruseSqlProvider.class, method="countByExample")
    int countByExample(FinalOrderPeruseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalOrderPeruseSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalOrderPeruseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `orderperuse`",
        "where orderId = #{orderid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `orderperuse` (orderId, orderSN, ",
        "placeId, placeCityId, ",
        "cityName, serviceDate, ",
        "serviceTime, departure, ",
        "deptLocation, deptDetailAddress, ",
        "deptEnAddress, destination, ",
        "destLocation, destDetailAddress, ",
        "destEnAddress, distance, ",
        "duration, seatCategory, ",
        "type, price, clientPrice, ",
        "guidePrice, adultNum, ",
        "childNum, childSeat, ",
        "username, areaCode, ",
        "usermobile, usermobile1, ",
        "usermobile2, useremail, ",
        "usercomment, usercontact, ",
        "guideId, clientType, ",
        "clientId, userpassportId, ",
        "adminId, status, ",
        "guideCommentStatus, userCommentStatus, ",
        "dealOrderTime, updated_at, ",
        "deleted_at, created_at)",
        "values (#{orderid,jdbcType=VARCHAR}, #{ordersn,jdbcType=VARCHAR}, ",
        "#{placeid,jdbcType=INTEGER}, #{placecityid,jdbcType=INTEGER}, ",
        "#{cityname,jdbcType=VARCHAR}, #{servicedate,jdbcType=DATE}, ",
        "#{servicetime,jdbcType=TIME}, #{departure,jdbcType=VARCHAR}, ",
        "#{deptlocation,jdbcType=VARCHAR}, #{deptdetailaddress,jdbcType=VARCHAR}, ",
        "#{deptenaddress,jdbcType=VARCHAR}, #{destination,jdbcType=VARCHAR}, ",
        "#{destlocation,jdbcType=VARCHAR}, #{destdetailaddress,jdbcType=VARCHAR}, ",
        "#{destenaddress,jdbcType=VARCHAR}, #{distance,jdbcType=DECIMAL}, ",
        "#{duration,jdbcType=INTEGER}, #{seatcategory,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER}, #{price,jdbcType=INTEGER}, #{clientprice,jdbcType=INTEGER}, ",
        "#{guideprice,jdbcType=INTEGER}, #{adultnum,jdbcType=INTEGER}, ",
        "#{childnum,jdbcType=INTEGER}, #{childseat,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{areacode,jdbcType=VARCHAR}, ",
        "#{usermobile,jdbcType=VARCHAR}, #{usermobile1,jdbcType=VARCHAR}, ",
        "#{usermobile2,jdbcType=VARCHAR}, #{useremail,jdbcType=VARCHAR}, ",
        "#{usercomment,jdbcType=VARCHAR}, #{usercontact,jdbcType=VARCHAR}, ",
        "#{guideid,jdbcType=INTEGER}, #{clienttype,jdbcType=INTEGER}, ",
        "#{clientid,jdbcType=VARCHAR}, #{userpassportid,jdbcType=VARCHAR}, ",
        "#{adminid,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{guidecommentstatus,jdbcType=INTEGER}, #{usercommentstatus,jdbcType=INTEGER}, ",
        "#{dealordertime,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{deletedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalOrderPeruse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalOrderPeruseSqlProvider.class, method="insertSelective")
    int insertSelective(FinalOrderPeruse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPeruseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderSN", property="ordersn", jdbcType=JdbcType.VARCHAR),
        @Result(column="placeId", property="placeid", jdbcType=JdbcType.INTEGER),
        @Result(column="placeCityId", property="placecityid", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="serviceDate", property="servicedate", jdbcType=JdbcType.DATE),
        @Result(column="serviceTime", property="servicetime", jdbcType=JdbcType.TIME),
        @Result(column="departure", property="departure", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptLocation", property="deptlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptDetailAddress", property="deptdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptEnAddress", property="deptenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destination", property="destination", jdbcType=JdbcType.VARCHAR),
        @Result(column="destLocation", property="destlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="destDetailAddress", property="destdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destEnAddress", property="destenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="distance", property="distance", jdbcType=JdbcType.DECIMAL),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="seatCategory", property="seatcategory", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="clientPrice", property="clientprice", jdbcType=JdbcType.INTEGER),
        @Result(column="guidePrice", property="guideprice", jdbcType=JdbcType.INTEGER),
        @Result(column="adultNum", property="adultnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childNum", property="childnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childSeat", property="childseat", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="areaCode", property="areacode", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile", property="usermobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile1", property="usermobile1", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile2", property="usermobile2", jdbcType=JdbcType.VARCHAR),
        @Result(column="useremail", property="useremail", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercomment", property="usercomment", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercontact", property="usercontact", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpassportId", property="userpassportid", jdbcType=JdbcType.VARCHAR),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="guideCommentStatus", property="guidecommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="userCommentStatus", property="usercommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="dealOrderTime", property="dealordertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderPeruse> selectByExampleWithRowbounds(FinalOrderPeruseCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalOrderPeruseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderSN", property="ordersn", jdbcType=JdbcType.VARCHAR),
        @Result(column="placeId", property="placeid", jdbcType=JdbcType.INTEGER),
        @Result(column="placeCityId", property="placecityid", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="serviceDate", property="servicedate", jdbcType=JdbcType.DATE),
        @Result(column="serviceTime", property="servicetime", jdbcType=JdbcType.TIME),
        @Result(column="departure", property="departure", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptLocation", property="deptlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptDetailAddress", property="deptdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptEnAddress", property="deptenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destination", property="destination", jdbcType=JdbcType.VARCHAR),
        @Result(column="destLocation", property="destlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="destDetailAddress", property="destdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destEnAddress", property="destenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="distance", property="distance", jdbcType=JdbcType.DECIMAL),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="seatCategory", property="seatcategory", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="clientPrice", property="clientprice", jdbcType=JdbcType.INTEGER),
        @Result(column="guidePrice", property="guideprice", jdbcType=JdbcType.INTEGER),
        @Result(column="adultNum", property="adultnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childNum", property="childnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childSeat", property="childseat", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="areaCode", property="areacode", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile", property="usermobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile1", property="usermobile1", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile2", property="usermobile2", jdbcType=JdbcType.VARCHAR),
        @Result(column="useremail", property="useremail", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercomment", property="usercomment", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercontact", property="usercontact", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpassportId", property="userpassportid", jdbcType=JdbcType.VARCHAR),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="guideCommentStatus", property="guidecommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="userCommentStatus", property="usercommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="dealOrderTime", property="dealordertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalOrderPeruse> selectByExample(FinalOrderPeruseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "orderId, orderSN, placeId, placeCityId, cityName, serviceDate, serviceTime, ",
        "departure, deptLocation, deptDetailAddress, deptEnAddress, destination, destLocation, ",
        "destDetailAddress, destEnAddress, distance, duration, seatCategory, type, price, ",
        "clientPrice, guidePrice, adultNum, childNum, childSeat, username, areaCode, ",
        "usermobile, usermobile1, usermobile2, useremail, usercomment, usercontact, guideId, ",
        "clientType, clientId, userpassportId, adminId, status, guideCommentStatus, userCommentStatus, ",
        "dealOrderTime, updated_at, deleted_at, created_at",
        "from `orderperuse`",
        "where orderId = #{orderid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="orderSN", property="ordersn", jdbcType=JdbcType.VARCHAR),
        @Result(column="placeId", property="placeid", jdbcType=JdbcType.INTEGER),
        @Result(column="placeCityId", property="placecityid", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="serviceDate", property="servicedate", jdbcType=JdbcType.DATE),
        @Result(column="serviceTime", property="servicetime", jdbcType=JdbcType.TIME),
        @Result(column="departure", property="departure", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptLocation", property="deptlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptDetailAddress", property="deptdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="deptEnAddress", property="deptenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destination", property="destination", jdbcType=JdbcType.VARCHAR),
        @Result(column="destLocation", property="destlocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="destDetailAddress", property="destdetailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="destEnAddress", property="destenaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="distance", property="distance", jdbcType=JdbcType.DECIMAL),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="seatCategory", property="seatcategory", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="clientPrice", property="clientprice", jdbcType=JdbcType.INTEGER),
        @Result(column="guidePrice", property="guideprice", jdbcType=JdbcType.INTEGER),
        @Result(column="adultNum", property="adultnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childNum", property="childnum", jdbcType=JdbcType.INTEGER),
        @Result(column="childSeat", property="childseat", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="areaCode", property="areacode", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile", property="usermobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile1", property="usermobile1", jdbcType=JdbcType.VARCHAR),
        @Result(column="usermobile2", property="usermobile2", jdbcType=JdbcType.VARCHAR),
        @Result(column="useremail", property="useremail", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercomment", property="usercomment", jdbcType=JdbcType.VARCHAR),
        @Result(column="usercontact", property="usercontact", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="clientType", property="clienttype", jdbcType=JdbcType.INTEGER),
        @Result(column="clientId", property="clientid", jdbcType=JdbcType.VARCHAR),
        @Result(column="userpassportId", property="userpassportid", jdbcType=JdbcType.VARCHAR),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="guideCommentStatus", property="guidecommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="userCommentStatus", property="usercommentstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="dealOrderTime", property="dealordertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalOrderPeruse selectByPrimaryKey(String orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPeruseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalOrderPeruse record, @Param("example") FinalOrderPeruseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPeruseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalOrderPeruse record, @Param("example") FinalOrderPeruseCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalOrderPeruseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalOrderPeruse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderperuse`
     *
     * @mbggenerated
     */
    @Update({
        "update `orderperuse`",
        "set orderSN = #{ordersn,jdbcType=VARCHAR},",
          "placeId = #{placeid,jdbcType=INTEGER},",
          "placeCityId = #{placecityid,jdbcType=INTEGER},",
          "cityName = #{cityname,jdbcType=VARCHAR},",
          "serviceDate = #{servicedate,jdbcType=DATE},",
          "serviceTime = #{servicetime,jdbcType=TIME},",
          "departure = #{departure,jdbcType=VARCHAR},",
          "deptLocation = #{deptlocation,jdbcType=VARCHAR},",
          "deptDetailAddress = #{deptdetailaddress,jdbcType=VARCHAR},",
          "deptEnAddress = #{deptenaddress,jdbcType=VARCHAR},",
          "destination = #{destination,jdbcType=VARCHAR},",
          "destLocation = #{destlocation,jdbcType=VARCHAR},",
          "destDetailAddress = #{destdetailaddress,jdbcType=VARCHAR},",
          "destEnAddress = #{destenaddress,jdbcType=VARCHAR},",
          "distance = #{distance,jdbcType=DECIMAL},",
          "duration = #{duration,jdbcType=INTEGER},",
          "seatCategory = #{seatcategory,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "price = #{price,jdbcType=INTEGER},",
          "clientPrice = #{clientprice,jdbcType=INTEGER},",
          "guidePrice = #{guideprice,jdbcType=INTEGER},",
          "adultNum = #{adultnum,jdbcType=INTEGER},",
          "childNum = #{childnum,jdbcType=INTEGER},",
          "childSeat = #{childseat,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "areaCode = #{areacode,jdbcType=VARCHAR},",
          "usermobile = #{usermobile,jdbcType=VARCHAR},",
          "usermobile1 = #{usermobile1,jdbcType=VARCHAR},",
          "usermobile2 = #{usermobile2,jdbcType=VARCHAR},",
          "useremail = #{useremail,jdbcType=VARCHAR},",
          "usercomment = #{usercomment,jdbcType=VARCHAR},",
          "usercontact = #{usercontact,jdbcType=VARCHAR},",
          "guideId = #{guideid,jdbcType=INTEGER},",
          "clientType = #{clienttype,jdbcType=INTEGER},",
          "clientId = #{clientid,jdbcType=VARCHAR},",
          "userpassportId = #{userpassportid,jdbcType=VARCHAR},",
          "adminId = #{adminid,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "guideCommentStatus = #{guidecommentstatus,jdbcType=INTEGER},",
          "userCommentStatus = #{usercommentstatus,jdbcType=INTEGER},",
          "dealOrderTime = #{dealordertime,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where orderId = #{orderid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(FinalOrderPeruse record);
}