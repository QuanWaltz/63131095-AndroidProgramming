public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCau1 = findViewById(R.id.btnCau1);
        Button btnCau2 = findViewById(R.id.btnCau2);
        Button btnCau3 = findViewById(R.id.btnCau3);
        Button btnCau4 = findViewById(R.id.btnCau4);

        btnCau1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cau1Activity.class);
            startActivity(intent);
        });

        btnCau2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cau2Activity.class);
            startActivity(intent);
        });

        btnCau3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cau3Activity.class);
            startActivity(intent);
        });

        btnCau4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cau4Activity.class);
            startActivity(intent);
        });
    }
}