package com.gok.selin.haberuygulamasi;

/**
 * Created by selin on 6/11/17.
 */

public class HaberModel {

    private String siteAdi;
    private String link;
    private int logoId;

    public HaberModel(String siteAdi, String link, int logoId) {
        this.siteAdi = siteAdi;
        this.link = link;
        this.logoId = logoId;
    }

    public String getSiteAdi() {
        return siteAdi;
    }

    public void setSiteAdi(String siteAdi) {
        this.siteAdi = siteAdi;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }
}
