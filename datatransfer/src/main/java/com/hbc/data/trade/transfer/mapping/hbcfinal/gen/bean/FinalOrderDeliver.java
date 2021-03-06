package com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean;

import java.util.Date;

public class FinalOrderDeliver {
    /**
     *  
     *  所属表字段为`orderdeliver`.orderDeliverId
     */
    private String orderdeliverid;

    /**
     *  
     *  所属表字段为`orderdeliver`.orderId
     */
    private String orderid;

    /**
     *  
     *  所属表字段为`orderdeliver`.noticeType
     */
    private String noticetype;

    /**
     *  
     *  所属表字段为`orderdeliver`.type
     */
    private Integer type;

    /**
     *  
     *  所属表字段为`orderdeliver`.flag
     */
    private Integer flag;

    /**
     *  
     *  所属表字段为`orderdeliver`.updated_at
     */
    private Date updatedAt;

    /**
     *  
     *  所属表字段为`orderdeliver`.created_at
     */
    private Date createdAt;

    /**
     *
     *`orderdeliver`.orderDeliverId
     *
     * @return the value of `orderdeliver`.orderDeliverId
     *
     * @mbggenerated
     */
    public String getOrderdeliverid() {
        return orderdeliverid;
    }

    /**
     *
     *`orderdeliver`.orderDeliverId
     *
     * @param orderdeliverid the value for `orderdeliver`.orderDeliverId
     *
     * @mbggenerated
     */
    public void setOrderdeliverid(String orderdeliverid) {
        this.orderdeliverid = orderdeliverid == null ? null : orderdeliverid.trim();
    }

    /**
     *
     *`orderdeliver`.orderId
     *
     * @return the value of `orderdeliver`.orderId
     *
     * @mbggenerated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     *
     *`orderdeliver`.orderId
     *
     * @param orderid the value for `orderdeliver`.orderId
     *
     * @mbggenerated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     *
     *`orderdeliver`.noticeType
     *
     * @return the value of `orderdeliver`.noticeType
     *
     * @mbggenerated
     */
    public String getNoticetype() {
        return noticetype;
    }

    /**
     *
     *`orderdeliver`.noticeType
     *
     * @param noticetype the value for `orderdeliver`.noticeType
     *
     * @mbggenerated
     */
    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    /**
     *
     *`orderdeliver`.type
     *
     * @return the value of `orderdeliver`.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     *
     *`orderdeliver`.type
     *
     * @param type the value for `orderdeliver`.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     *
     *`orderdeliver`.flag
     *
     * @return the value of `orderdeliver`.flag
     *
     * @mbggenerated
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     *
     *`orderdeliver`.flag
     *
     * @param flag the value for `orderdeliver`.flag
     *
     * @mbggenerated
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     *
     *`orderdeliver`.updated_at
     *
     * @return the value of `orderdeliver`.updated_at
     *
     * @mbggenerated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     *`orderdeliver`.updated_at
     *
     * @param updatedAt the value for `orderdeliver`.updated_at
     *
     * @mbggenerated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     *`orderdeliver`.created_at
     *
     * @return the value of `orderdeliver`.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     *
     *`orderdeliver`.created_at
     *
     * @param createdAt the value for `orderdeliver`.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderdeliver`
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderdeliverid=").append(orderdeliverid);
        sb.append(", orderid=").append(orderid);
        sb.append(", noticetype=").append(noticetype);
        sb.append(", type=").append(type);
        sb.append(", flag=").append(flag);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}