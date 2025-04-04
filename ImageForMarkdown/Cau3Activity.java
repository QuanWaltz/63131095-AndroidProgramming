public class Cau3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MyItem> items = new ArrayList<>();
        items.add(new MyItem("Item 1", R.drawable.image1));
        items.add(new MyItem("Item 2", R.drawable.image2));
        items.add(new MyItem("Item 3", R.drawable.image3));

        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}

// Adapter class
class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MyItem> items;

    public MyAdapter(List<MyItem> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyItem item = items.get(position);
        holder.textView.setText(item.getName());
        holder.imageView.setImageResource(item.getImageRes());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Bạn chọn: " + item.getName(), Toast.LENGTH_SHORT).show();
            
            // Hoặc chuyển sang CustomItemActivity
            // Intent intent = new Intent(v.getContext(), CustomItemActivity.class);
            // intent.putExtra("itemName", item.getName());
            // intent.putExtra("itemImage", item.getImageRes());
            // v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImage);
            textView = itemView.findViewById(R.id.itemName);
        }
    }
}

// Model class
class MyItem {
    private String name;
    private int imageRes;

    public MyItem(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public int getImageRes() {
        return imageRes;
    }
}