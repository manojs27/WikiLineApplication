package com.bangalore.wikiline.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WikiResponse {
    @SerializedName("batchcomplete")
    private boolean batchcomplete;

    @SerializedName("continue")
    private Continue aContinue;

    @SerializedName("query")
    private Query query;

    public WikiResponse(boolean batchcomplete,Continue aContinue,Query query){
        this.batchcomplete=batchcomplete;
        this.aContinue=aContinue;
        this.query=query;
    }

    public List<Pages> getResults() {
        return query.getPages();
    }

}
