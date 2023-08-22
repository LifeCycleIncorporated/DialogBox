package com.example.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private AlertDialog.Builder alertDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button find or linked xml file
        button = findViewById(R.id.exitVButtonId);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        
        // Alert Dialog Create
        alertDialog = new AlertDialog.Builder(MainActivity.this);
        
        // Alert Dialog Set Title
        alertDialog.setTitle("Alert");
        
        // Alert Dialog set Message
        alertDialog.setMessage("Are you want to exit");

        // Alert Dialog set Message
        alertDialog.setIcon(R.drawable.icon);

        // Alert Dialog set Out click not hide
        alertDialog.setCancelable(false);

        // Alert Dialog set Positive Button
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Exit or Closed
                finish();
            }
        });

        // Alert Dialog set Negative Button
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Negative Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Alert Dialog set Neutral Button
        alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Cancel Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();
    }
}