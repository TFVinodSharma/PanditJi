package com.kashmiriguruji.panditji.modules.book.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kashmiriguruji.panditji.R;
import com.kashmiriguruji.panditji.modules.deatils.view.DetailsActivity;

public class BookActivity extends AppCompatActivity {
    EditText Name, Phone, Email, Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Name = findViewById(R.id.editname);
        Phone = findViewById(R.id.editnumber);
        Email = findViewById(R.id.editemail);
        Date = findViewById(R.id.editdate);

        Button BookButton = findViewById(R.id.confirmbooking);
        BookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String TxtName = Name.getText().toString().trim();
                String TxtPhone = Phone.getText().toString().trim();
                String TxtEmail = Email.getText().toString().trim();
                String TxtDate = Date.getText().toString().trim();

                if (TextUtils.isEmpty(Name.getText().toString().trim()) && TextUtils.isEmpty(TxtEmail) && TextUtils.isEmpty(TxtPhone) && TextUtils.isEmpty(TxtDate)) {

                    Toast.makeText(BookActivity.this, "All Filleds are mandatory", Toast.LENGTH_SHORT).show();
                } else {
                    Dialog dialog = new Dialog(BookActivity.this);
                    dialog.setContentView(R.layout.dialogbox);
                    dialog.setTitle("Hello");
                    TextView textViewUser = (TextView) dialog.findViewById(R.id.dailogtextview);
                    textViewUser.setText("Success");
                    dialog.show();
                }
            /*{
                Name.setError("This Field is required");
            }
            else if (TextUtils.isEmpty(TxtEmail)) {
                Email.setError("This Field is required");

            }

            else if (TextUtils.isEmpty(TxtPhone)) {
                Phone.setError("This Field is required");

            }
            else if (TextUtils.isEmpty(TxtDate)) {
                Date.setError("This Field is required");

            }
*/
/*
                Intent i=new Intent(BookActivity.this,DetailsActivity.class);
            startActivity(i);
*/
/*
            else {
                Toast.makeText(BookActivity.this, "All Filleds are Mandotory", Toast.LENGTH_SHORT).show();
            }
*/


            }
        });


    }
}
