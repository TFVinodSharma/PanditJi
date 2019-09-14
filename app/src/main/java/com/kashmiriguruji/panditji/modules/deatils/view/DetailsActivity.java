package com.kashmiriguruji.panditji.modules.deatils.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kashmiriguruji.panditji.R;
import com.kashmiriguruji.panditji.modules.book.view.BookActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView TitleTextView = findViewById(R.id.titlecategory);
        Button BookPanditJi = findViewById(R.id.bookpanditji);


        Bundle bundle = this.getIntent().getExtras();
        String name = bundle.getString("text");
        TitleTextView.setText(name);

        BookPanditJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailsActivity.this, BookActivity.class);
                startActivity(i);

            }
        });

    }
}
