package com.bangalore.wikiline.model;


import com.google.gson.annotations.SerializedName;

public class Continue {

    @SerializedName("gpsoffset")
    private int gpsoffset;

    @SerializedName("continue")
    private String aContinue;

    public Continue(int gpsoffset, String aContinue) {
        this.gpsoffset = gpsoffset;
        this.aContinue = aContinue;
    }
}
