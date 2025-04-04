package thigk2.HuynhDoAnhQuan;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Feature3Activity extends AppCompatActivity {
    ListView Test;
    ArrayList<String> listMusicTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feature3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_feature3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Test = findViewById(R.id.listMusic);

        listMusicTest = new ArrayList<String>();
        listMusicTest.add("Tiến về Sài Gòn");
        listMusicTest.add("Giải phóng miền Nam");
        listMusicTest.add("Đất nước trọn niềm vui");
        listMusicTest.add("Bài ca thống nhất");
        listMusicTest.add("Mùa xuân trên TP Hồ Chí Minh");


        ArrayAdapter<String> adapterLang;
        adapterLang = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMusicTest);
        Test.setAdapter(adapterLang);
    }

}
