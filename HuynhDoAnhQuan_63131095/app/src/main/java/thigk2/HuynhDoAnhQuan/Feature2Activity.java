package thigk2.HuynhDoAnhQuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Feature2Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature2);

        EditText editMonth = findViewById(R.id.editMonth);
        EditText editYear = findViewById(R.id.editYear);
        Button btnCheck = findViewById(R.id.btnCheck);
        TextView textCheck = findViewById(R.id.textCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String monthStr = editMonth.getText().toString();
                String yearStr = editYear.getText().toString();

                // Kiểm tra dữ liệu nhập vào
                if (monthStr.isEmpty() || yearStr.isEmpty()) {
                    textCheck.setText("Vui lòng nhập đủ tháng và năm!");
                    return;
                }

                int month = Integer.parseInt(monthStr);
                int year = Integer.parseInt(yearStr);

                // So sánh với tháng 4 năm 1975
                if (month == 4 && year == 1975) {
                    textCheck.setText("Kết quả: ĐÚNG (Tháng 4 năm 1975)");
                    textCheck.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
                } else {
                    textCheck.setText("Kết quả: SAI (Không phải tháng 4 năm 1975)");
                    textCheck.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                }
            }
        });
    }
}
