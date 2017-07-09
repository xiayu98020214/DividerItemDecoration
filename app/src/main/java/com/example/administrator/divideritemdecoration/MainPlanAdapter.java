package com.example.administrator.divideritemdecoration;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Zhiqiang on 2016/7/25 0025.
 */
public class MainPlanAdapter extends RecyclerView.Adapter<MainPlanAdapter.Myholder> {

    private static final String TAG = "MainPlanAdapter";
    private Context mContext;




    public MainPlanAdapter(Context context) {
        mContext = context;

    }



    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Myholder(LayoutInflater.from(mContext).inflate(R.layout.item, parent, false));

    }

    @Override
    public void onBindViewHolder(Myholder holder, int position) {
        holder.text.setText(""+position);


    }

    @Override
    public int getItemCount() {
        return 8;
    }



    class Myholder extends RecyclerView.ViewHolder {

        private TextView text;
        public Myholder(View itemView) {
            super(itemView);
            text = (TextView)itemView.findViewById(R.id.num);
        }
    }
}
