package com.kashmiriguruji.panditji.modules.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kashmiriguruji.panditji.R;
import com.kashmiriguruji.panditji.modules.deatils.view.DetailsActivity;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    private String[] data1;

    public CategoriesAdapter(String[] data1) {
        this.data1 = data1;

    }

    @NonNull
    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_categories, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.ViewHolder holder, int position) {
        String Name = data1[position];
        holder.CatName.setText(Name);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView CatName;
        Context context;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            context = itemView.getContext();

            CatName = itemView.findViewById(R.id.catname);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, DetailsActivity.class);
                    i.putExtra("text", data1[getAdapterPosition()]); // put image data in Intent

                    context.startActivity(i);

                }
            });
        }
    }
}
