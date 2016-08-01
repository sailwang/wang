package com.example.administrator.retrofit.MyInterfence;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Administrator on 2016/7/19.
 */
public interface MyHeaderInterface {
    @Headers({"User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)","Connection: Keep-Alive"})
    @GET("index.php?_p=api&_a=carousel")
    public Call<ResponseBody> getData();
}
