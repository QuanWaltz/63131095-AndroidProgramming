package ntu.edu.ex3_simplesumapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSum(View view){
        EditText editNumA = findViewById(R.id.editNumA);
        EditText editNumB = findViewById(R.id.editNumB);
        EditText editSum = findViewById(R.id.editSum);

        double a = Double.parseDouble(editNumA.getText().toString());
        double b = Double.parseDouble(editNumB.getText().toString());

        double sum = a + b;

        editSum.setText(String.valueOf(sum));

    }

    public void doProduct(View view){
        EditText editNumA = findViewById(R.id.editNumA);
        EditText editNumB = findViewById(R.id.editNumB);
        EditText editSum = findViewById(R.id.editSum);

        double a = Double.parseDouble(editNumA.getText().toString());
        double b = Double.parseDouble(editNumB.getText().toString());

        double product = a * b;

        editSum.setText(String.valueOf(product));

    }

    public void doDiff(View view){
        EditText editNumA = findViewById(R.id.editNumA);
        EditText editNumB = findViewById(R.id.editNumB);
        EditText editSum = findViewById(R.id.editSum);

        double a = Double.parseDouble(editNumA.getText().toString());
        double b = Double.parseDouble(editNumB.getText().toString());

        double diff = a - b;

        editSum.setText(String.valueOf(diff));

    }

    public void doQuotient(View view){
        EditText editNumA = findViewById(R.id.editNumA);
        EditText editNumB = findViewById(R.id.editNumB);
        EditText editSum = findViewById(R.id.editSum);

        double a = Double.parseDouble(editNumA.getText().toString());
        double b = Double.parseDouble(editNumB.getText().toString());

        double quotient = a / b;

        editSum.setText(String.valueOf(quotient));

    }
}