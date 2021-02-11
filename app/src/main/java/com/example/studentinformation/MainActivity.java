package com.example.studentinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usern, pass;
    Button btn;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         usern=findViewById(R.id.username);
         pass=findViewById(R.id.password);
         btn=findViewById(R.id.btn_login);

         imageView=findViewById(R.id.ivtool);
         textView=findViewById(R.id.tvtool);

        imageView.setVisibility(View.GONE);
        textView.setText("LogIn");
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String us=usern.getText().toString();
                 String pss=pass.getText().toString();

                 Bundle bundle=new Bundle();
                 bundle.putString("username",us);
                 bundle.putString("password",pss);

                 Intent intent=new Intent(MainActivity.this,Home.class);
                 intent.putExtras(bundle);
                 startActivity(intent);

             }
         });

    }
}