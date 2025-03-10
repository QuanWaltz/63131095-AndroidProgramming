package ntu.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editA, editB, editResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void calcSum(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double add = a + b;
        editResult.setText(String.valueOf(add));
    }
    public void calcSub(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double diff = a - b;
        editResult.setText(String.valueOf(diff));
    }
    public void calcMul(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double prod = a * b;
        editResult.setText(String.valueOf(prod));
    }
    public void calcDiv(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double quotient = a / b;
        editResult.setText(String.valueOf(quotient));
    }
}