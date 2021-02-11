package com.example.studentinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Home extends AppCompatActivity {
     TextView textView;
     ImageView imageView;
    TextView textView1;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView=findViewById(R.id.t_info);
        imageView=findViewById(R.id.ivtool);
        textView1=findViewById(R.id.tvtool);

        toolbar=findViewById(R.id.tlb);
        setSupportActionBar(toolbar);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,MainActivity.class);
                startActivity(intent);
            }
        });
//        imageView.setVisibility(View.GONE);
        textView1.setText("Home");
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String name= bundle.getString("username");
        String password= bundle.getString("password");

        textView.setText("Welcome To "+name);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.my_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case R.id.about:
                 Intent intent=new Intent(Home.this,About.class);
                 startActivity(intent);
                break;

            case R.id.edit:
                Intent intn=new Intent(Home.this,Edit.class);
                startActivity(intn);
                break;

            case R.id.setting:
                Intent in=new Intent(Home.this,Setting.class);
                startActivity(in);
                break;
        }
        return true;
    }
}