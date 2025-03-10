package ntu.edu.ex6_simpeintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    public void backToMain(View view){
        Intent mainScreen = new Intent(SubActivityOne.this, MainActivity.class);
        startActivity(mainScreen);
    }
}