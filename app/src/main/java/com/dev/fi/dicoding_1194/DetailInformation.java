package com.dev.fi.dicoding_1194;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailInformation extends AppCompatActivity {
    private CircleImageView img_item_photo;
    private TextView tv_name, tv_remarks, tv_descr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        img_item_photo = findViewById(R.id.img_item_photo);
        tv_name = findViewById(R.id.detail_name);
        tv_remarks = findViewById(R.id.detail_remarks);
        tv_descr = findViewById(R.id.detail_desc);

        int name = getIntent().getIntExtra("name",0);

        Animal animal = AnimalData.getListData().get(name);

        GlideApp.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .placeholder(R.drawable.ic_image_black_24dp)
                .into(img_item_photo);
        tv_name.setText(animal.getName());
        tv_remarks.setText(animal.getRemarks());
        tv_descr.setText(animal.getDescr());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}
