package com.example.viewpagertest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Page1Adapter extends RecyclerView.Adapter<Page1Adapter.ViewHolder> {
    private ArrayList<Coin> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page1,parent,false);
        return new ViewHolder(view);
    }

    public void setList(ArrayList<Coin> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView currency , label;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.icon_label);
            currency = itemView.findViewById(R.id.tv_currency);
            label = itemView.findViewById(R.id.tv_label);
        }

        public void onBind(Coin coin) {
            imageView.setImageResource(coin.getImage());
            currency.setText(coin.getCurrency());
            label.setText(coin.getLabel());
        }
    }
}
