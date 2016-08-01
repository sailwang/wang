package com.example.administrator.retrofit.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.retrofit.Data;
import com.example.administrator.retrofit.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2016/7/19.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

private List<Data.DataBean> dataBeanList;
    Context context;
    private LayoutInflater inflater;

    public MyAdapter(List<Data.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.context = context;
        inflater=LayoutInflater.from(context);
        Fresco.initialize(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(dataBeanList.get(position).getTitle());
        holder.imageView.setImageURI(dataBeanList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        SimpleDraweeView imageView;
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView= (SimpleDraweeView) itemView.findViewById(R.id.imageView);
            textView= (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
