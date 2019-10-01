package com.example.hiddenhouston;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Option1(View view)
    {
    Intent intent = new Intent(this,Option1.class);
    startActivity(intent);
    }

    public void Option2(View view)
    {
        Intent intent = new Intent(this,Option2.class);
        startActivity(intent);
    }

    public void Option3(View view)
    {
        Intent intent = new Intent(this,Option3.class);
        startActivity(intent);
    }

    public void Option4(View view)
    {
        Intent intent = new Intent(this,Option4.class);
        startActivity(intent);
    }

    public void Option5(View view)
    {
        Intent intent = new Intent(this,Option5.class);
        startActivity(intent);
    }
}
