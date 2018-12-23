package com.qiuzq.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class LoggerModelWithBLOBs extends LoggerModel {
    private String paramData;

    private String returnData;

    public LoggerModelWithBLOBs(Integer id, String clientIp, String uri, String type, String method, String sessionId, Date time, String returnTime, String httpStatusCode, Integer timeConsuming, String paramData, String returnData) {
        super(id, clientIp, uri, type, method, sessionId, time, returnTime, httpStatusCode, timeConsuming);
        this.paramData = paramData;
        this.returnData = returnData;
    }

    public LoggerModelWithBLOBs() {
        super();
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }
}