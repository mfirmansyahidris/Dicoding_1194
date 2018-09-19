package com.dev.fi.dicoding_1194;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAnimalAdapter extends RecyclerView.Adapter<CardViewAnimalAdapter.CardViewViewHolder> {
    private ArrayList<Animal> listAnimal;
    private Context context;

    public CardViewAnimalAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    }

    public Animal getAnimal(int position){
        return listAnimal.get(position);
    }

    public void setListAnimal(ArrayList<Animal> listAnimal) {
        this.listAnimal= listAnimal;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_animal, viewGroup, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Animal a = getListAnimal().get(i);

        GlideApp.with(context)
                .load(a.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .placeholder(R.drawable.ic_image_black_24dp)
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(a.getName());
        cardViewViewHolder.tvRemarks.setText(a.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Intent i = new Intent(context, DetailInformation.class);
                i.putExtra("name", position);
                context.startActivity(i);
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListAnimal().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListAnimal().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
        }
    }
}
