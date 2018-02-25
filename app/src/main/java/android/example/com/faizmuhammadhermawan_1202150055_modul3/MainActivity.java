package android.example.com.faizmuhammadhermawan_1202150055_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel reyclerview
    private RecyclerView recyclerView;
    private RecycleAdapter mAdapter;

    //variabel arraylist
    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);  //menampilkan reyclerview yang ada pada file layout dengan id RecycleList1
        mAdapter = new RecycleAdapter(DATAS);  //membuat adapter baru untuk reyclerview
        recyclerView.setAdapter(mAdapter);   //menset nilai dari adapter

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count); //

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));    //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk Gridlayoutmanager pada class saat ini
    }

    public ArrayList<MinumanItem> isi(){    //mendeklarasikan array yang kita buat
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new MinumanItem("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new MinumanItem("Evian","Ini adalah AMDK merk EVIAN","",R.drawable.evian));
        data.add(new MinumanItem("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new MinumanItem("Vit","Ini adalah AMDK merk VIT","",R.drawable.vit));
        return data;
        //diatas merupakan data data yang akan ditampilkan dalam recycle view
    }
}