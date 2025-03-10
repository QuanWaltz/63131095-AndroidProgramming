package ntu.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editA, editB, editResult;
    void findControl(){
        editA = (EditText) findViewById(R.id.editA);
        editB = (EditText) findViewById(R.id.editB);
        editResult = (EditText) findViewById(R.id.editResult);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControl();
    }
    public void calcAdd(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double sum = a + b;
        editResult.setText(String.valueOf(sum));
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