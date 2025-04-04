public class Cau2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);

        ListView listView = findViewById(R.id.listView);
        String[] items = {"Bài hát 1", "Bài hát 2", "Bài hát 3", "Bài hát 4", "Bài hát 5"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, 
                android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Xử lý click item (Toast)
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Bạn chọn: " + items[position], Toast.LENGTH_SHORT).show();
            
            // Hoặc chuyển sang ItemActivity
            // Intent intent = new Intent(this, ItemActivity.class);
            // intent.putExtra("item", items[position]);
            // startActivity(intent);
        });
    }
}