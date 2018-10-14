package com.bangalore.wikiline.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Terms {

    @SerializedName("description")
    private List<String> mDescription;

    public List<String> getmDescription() {
        return mDescription;
    }

    public void setmDescription(List<String> mDescription) {
        this.mDescription = mDescription;
    }

}
