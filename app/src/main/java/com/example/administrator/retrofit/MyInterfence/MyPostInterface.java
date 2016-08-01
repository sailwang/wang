package com.example.administrator.retrofit.MyInterfence;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/7/19.
 */

/**
 * Created by bluesky on 16/7/19.
 * String baseUrl = http://mrobot.pcauto.com.cn/v2/cms/channels/1?
 * post提交的字段：pageNo=1&pageSize=20&serialIds=2143,3404&v=4.0.0
 */
public interface MyPostInterface {

    @POST("comment/list")
    public Call<ResponseBody> getData(
            @Query("seasonId")int pageNo,
            @Query("page")int pageSize,
            @Query("rows")int serialIds
    );
}
