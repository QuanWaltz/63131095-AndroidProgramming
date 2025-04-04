package ntu.edu.ex_listview;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView Test;
    ArrayList<String> listLangTest;
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
        Test = findViewById(R.id.listViewTest);

        listLangTest = new ArrayList<String>();
        listLangTest.add("Python");
        listLangTest.add("JS");
        listLangTest.add("Ruby");

        ArrayAdapter<String> adapterLang;
        adapterLang = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listLangTest);
        Test.setAdapter(adapterLang);
    }
}