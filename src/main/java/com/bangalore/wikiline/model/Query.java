package com.bangalore.wikiline.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Query {

    @SerializedName("redirects")
    private List<Redirects> redirects;

    @SerializedName("pages")
    private List<Pages> pages;

    public Query(List<Redirects> redirects, List<Pages> pages) {
        this.pages = pages;
        this.redirects = redirects;
    }

    public List<Pages> getPages() {
        return pages;
    }

    public void setResults(List<Pages> pages) {
        this.pages = pages;
    }

}
