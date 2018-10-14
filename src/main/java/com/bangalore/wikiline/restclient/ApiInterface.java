package com.bangalore.wikiline.restclient;


import com.bangalore.wikiline.activity.MainActivity;
import com.bangalore.wikiline.model.WikiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("w/api.php?action=query&format=json&prop=pageimages%7Cpageterms&generator=prefixsearch&redirects=1&formatversion=2&piprop=thumbnail&pithumbsize=50&pilimit=10&wbptterms=description&gpssearch=")
    Call<WikiResponse> getWikiSearchList(@Query("gpssearch") String emailID);

}
