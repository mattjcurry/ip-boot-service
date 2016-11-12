package com.mattjcurry.dns;

/**
 * Created by mcurx on 11/11/16.
 */
public class IpAddress {

    private String ip;

    public IpAddress() {
    }

    public IpAddress(String ip) {

        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
