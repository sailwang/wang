package com.example.administrator.retrofit.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.retrofit.MyInterfence.MyHeaderInterface;
import com.example.administrator.retrofit.MyInterfence.MyPostInterface;
import com.example.administrator.retrofit.R;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HeaderParmentActivity extends AppCompatActivity {

    private Button btn ,btn1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_parment);

        btn= (Button) findViewById(R.id.button01);
        btn1= (Button) findViewById(R.id.button02);
        textView= (TextView) findViewById(R.id.text_view);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("http://interfaces.ziroom.com/")
                        .build();
                MyHeaderInterface myHeaderInterface=retrofit.create(MyHeaderInterface.class);
                Call<ResponseBody> call= myHeaderInterface.getData();

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.e("1608", response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });


        /**
         * Created by bluesky on 16/7/19.
         * String baseUrl = http://mrobot.pcauto.com.cn/v2/cms/channels/1?
         * post提交的字段：pageNo=1&pageSize=20&serialIds=2143,3404&v=4.0.0
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("http://api.rrmj.tv/")
                        .build();

               MyPostInterface myPostInterface= retrofit.create(MyPostInterface.class);

                Call<ResponseBody> call=myPostInterface.getData(1759,1,10);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            textView.setText(response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });

    }
}
