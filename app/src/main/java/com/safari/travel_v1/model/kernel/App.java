package com.safari.travel_v1.model.kernel;

import android.content.Context;

public class App {

    private String ip_address = "http://192.168.8.100/";
    private String module = "mobile";
    private String page;
    private String App_name = "Bi";
    private String url = "http://172.20.10.5/projects/sfi/module/mobile/";

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getApp_name() {
        return App_name;
    }

    public void setApp_name(String app_name) {
        App_name = app_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
