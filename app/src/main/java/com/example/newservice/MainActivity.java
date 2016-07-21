package com.example.newservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // System.out.println("We are on create of the Activity");
        Log.d("TAG_", "We're in the onCreate of the Activity");

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //System.out.println("We are on create of the Activity");
        Log.d("TAG_", "We're in the onStart of the Activity");
    }
    @Override
    protected void onResume() {
        super.onResume();
       // System.out.println("We're in the onResume of the Activity");
        Log.d("TAG_", "We're in the onResume of the Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //System.out.println("We're in the onPause of the Activity");
        Log.d("TAG_", "We're in the onPause of the Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //System.out.println("We're in the onStop of the Activity");
        Log.d("TAG_", "We're in the onStop of the Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //System.out.println("We're in the onDestroy of the Activity");
        Log.d("TAG_", "We're in the onDestory of the Activity");
    }

    public void doMagic(View view) {

        EditText editText = (EditText) findViewById(R.id.a_main_et);
        TextView textView = (TextView) findViewById(R.id.a_main_txt);

        textView.setText(editText.getText());

    }
}