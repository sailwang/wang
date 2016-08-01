package com.example.administrator.retrofit.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.administrator.retrofit.Adapter.MyAdapter;
import com.example.administrator.retrofit.Data;
import com.example.administrator.retrofit.MyInterfence.MyInterface;
import com.example.administrator.retrofit.MyInterfence.MyInterfenceOne;
import com.example.administrator.retrofit.R;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(manager);

//        getByRespond();

        getByArtical();
    }


    public void getByArtical(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://mrobot.pcauto.com.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       MyInterface myInterface= retrofit.create(MyInterface.class);
        Call<Data> call=myInterface.getData();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Data data=response.body();
                recyclerView.setAdapter(new MyAdapter(data.getData(),MainActivity.this));
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });
    }

    public void getByRespond(){
        Retrofit  retrofit=new Retrofit.Builder()
                .baseUrl("http://mrobot.pcauto.com.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MyInterfenceOne myInterfenceOne=retrofit.create(MyInterfenceOne.class);
      Call<ResponseBody> call=myInterfenceOne.getData();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.e("1608",response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
