public class Cau1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);

        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        Button btnTinh = findViewById(R.id.btnTinh);
        TextView txtResult = findViewById(R.id.txtResult);

        btnTinh.setOnClickListener(v -> {
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            int sum = a + b;
            txtResult.setText("Kết quả: " + sum);
        });
    }
}