package com.example.administrator.retrofit.MyInterfence;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2016/7/19.
 */
public interface MyInterfenceOne {

    @GET(value="v2/cms/channels/1?pageNo=1&pageSize=20&serialIds=2143,3404&v=4.0.0")
    public Call<ResponseBody> getData();
}
