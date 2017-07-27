package com.vo;

/**
 * Created by Administrator on 2017/7/25.
 */
public class ConditionVo {
    private String Header;
    private String cookie;
    private String userAgent;
    //是否是图片
    private boolean isImage;
    //是否是文本
    private boolean isText;
    //深度
    private int deep;
    /*private String
    private String
    private String*/

    public String getHeader() {
        return Header;
    }

    public void setHeader(String header) {
        Header = header;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
