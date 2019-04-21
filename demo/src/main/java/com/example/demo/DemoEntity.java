package com.example.demo;

import java.util.Date;

public class DemoEntity {

    private String version;
    private String info;
    private Date date;

    public String getVersion() {
        return version;
    }

    public String getInfo() {
        return info;
    }

    public Date getDate() {
        return date;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
