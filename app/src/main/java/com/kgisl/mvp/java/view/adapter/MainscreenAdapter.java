package com.kgisl.mvp.java.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.kgisl.mvp.R;
import com.kgisl.mvp.java.model.User;
import java.util.ArrayList;

public class MainscreenAdapter extends RecyclerView.Adapter<MainscreenAdapter.ViewHolder> {

    Context context;
    ArrayList<User> data;

    public MainscreenAdapter(Context context, ArrayList<User> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.adapter_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        if(holder instanceof ViewHolder){
            holder.nameTV.setText(data.get(position).getName());
            holder.cityTV.setText(data.get(position).getCity());

            holder.nameTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(context, ""+data.get(position).getName(), Toast.LENGTH_SHORT).show();

                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV,cityTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV=itemView.findViewById(R.id.nameTV);
            cityTV=itemView.findViewById(R.id.cityTV);
        }
    }
}
