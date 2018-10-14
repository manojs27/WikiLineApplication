package com.bangalore.wikiline.model;


public class Redirects {

    private int index;
    private String to;
    private String from;


    public Redirects(int index, String to, String from) {
        this.index = index;
        this.to = to;
        this.from = from;
    }
}
