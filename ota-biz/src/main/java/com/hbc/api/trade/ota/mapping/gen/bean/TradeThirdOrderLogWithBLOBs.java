package com.hbc.api.trade.ota.mapping.gen.bean;

public class TradeThirdOrderLogWithBLOBs extends TradeThirdOrderLog {
    /**
     *  请求数据
     *  所属表字段为`trade_third_order_log`.request_data
     */
    private String requestData;

    /**
     *  响应数据
     *  所属表字段为`trade_third_order_log`.response_data
     */
    private String responseData;

    /**
     *请求数据
     *`trade_third_order_log`.request_data
     *
     * @return the value of `trade_third_order_log`.request_data
     *
     * @mbggenerated
     */
    public String getRequestData() {
        return requestData;
    }

    /**
     *请求数据
     *`trade_third_order_log`.request_data
     *
     * @param requestData the value for `trade_third_order_log`.request_data
     *
     * @mbggenerated
     */
    public void setRequestData(String requestData) {
        this.requestData = requestData == null ? null : requestData.trim();
    }

    /**
     *响应数据
     *`trade_third_order_log`.response_data
     *
     * @return the value of `trade_third_order_log`.response_data
     *
     * @mbggenerated
     */
    public String getResponseData() {
        return responseData;
    }

    /**
     *响应数据
     *`trade_third_order_log`.response_data
     *
     * @param responseData the value for `trade_third_order_log`.response_data
     *
     * @mbggenerated
     */
    public void setResponseData(String responseData) {
        this.responseData = responseData == null ? null : responseData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_third_order_log`
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", requestData=").append(requestData);
        sb.append(", responseData=").append(responseData);
        sb.append("]");
        return sb.toString();
    }
}