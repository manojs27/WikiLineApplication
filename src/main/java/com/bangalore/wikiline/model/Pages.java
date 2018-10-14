package com.bangalore.wikiline.model;


import com.google.gson.annotations.SerializedName;

public class Pages {

    @SerializedName("pageid")
    private int pageid;
    @SerializedName("ns")
    private int ns;
    @SerializedName("title")
    private String title;
    @SerializedName("index")
    private String index;
    @SerializedName("thumbnail")
    private Thumbnail thumbnail;
    @SerializedName("terms")
    private Terms terms;


    public Pages(int pageid, int ns, String title, String index, Thumbnail thumbnail, Terms terms) {
        this.pageid = pageid;
        this.ns = ns;
        this.title = title;
        this.index = index;
        this.thumbnail = thumbnail;
        this.terms = terms;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }
}
