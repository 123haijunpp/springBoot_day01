package com.qiuzq.model;

import java.util.Date;

public class LoggerModel {
    private Integer id;

    private String clientIp;

    private String uri;

    private String type;

    private String method;

    private String sessionId;

    private Date time;

    private String returnTime;

    private String httpStatusCode;

    private Integer timeConsuming;

    public LoggerModel(Integer id, String clientIp, String uri, String type, String method, String sessionId, Date time, String returnTime, String httpStatusCode, Integer timeConsuming) {
        this.id = id;
        this.clientIp = clientIp;
        this.uri = uri;
        this.type = type;
        this.method = method;
        this.sessionId = sessionId;
        this.time = time;
        this.returnTime = returnTime;
        this.httpStatusCode = httpStatusCode;
        this.timeConsuming = timeConsuming;
    }

    public LoggerModel() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public Integer getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(Integer timeConsuming) {
        this.timeConsuming = timeConsuming;
    }
}