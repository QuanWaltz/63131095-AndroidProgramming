package thigk2.HuynhDoAnhQuan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivity2 = findViewById(R.id.btnActivity2);
        Button btnActivity3 = findViewById(R.id.btnActivity3);
        Button btnActivity4 = findViewById(R.id.btnActivity4);
        Button btnActivityAboutMe = findViewById(R.id.btnActivityAboutMe);

        btnActivity2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Feature2Activity.class);
            startActivity(intent);
        });

        btnActivity3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Feature3Activity.class);
            startActivity(intent);
        });

        btnActivity4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Feature4Activity.class);
            startActivity(intent);
        });

        btnActivityAboutMe.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
            startActivity(intent);
        });
    }
}