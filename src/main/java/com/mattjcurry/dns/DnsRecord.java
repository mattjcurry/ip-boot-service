package com.mattjcurry.dns;

/**
 * Created by mcurx on 11/11/16.
 */
public class DnsRecord {
    private String as;
    private String isp;
    private String org;
    private String query;

    public DnsRecord() {
    }

    public DnsRecord(String as, String isp, String org, String query) {
        this.as = as;
        this.isp = isp;
        this.org = org;
        this.query = query;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
