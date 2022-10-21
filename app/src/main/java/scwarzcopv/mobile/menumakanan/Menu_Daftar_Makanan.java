package scwarzcopv.mobile.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);


        Gambar		= new int[]{
                R.drawable.burger,
                R.drawable.chumpfries,
                R.drawable.chumphotdog,
                R.drawable.chumpshake,
                R.drawable.snack,};

        NamaItem 	= new String[]{
                "Chump Burger",
                "Chump French Fries",
                "Chump Hotdog",
                "Chump Keld Shake",
                "Chump Kelpo"};

        HargaItem 	= new String[]{
                "Rp 15.000,-",
                "Rp 10.000,-",
                "Rp 15.000,-",
                "Rp 12.000,-",
                "Rp 20.000,-"};

        Deskripsi 	= new String[]{
                "Chump Burger, adalah sejenis roti berbentuk bundar yang diiris dua, dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, hamburger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal, serta moster. Beberapa varian hamburger juga dilengkapi dengan keju dan asinan.",

                "Chump French Fries, adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas.",

                "Chump Hotdog, adalah suatu jenis sosis yang dimasak atau diasapi dan memiliki tekstur yang lebih halus serta rasa yang lebih lembut dan basah daripada kebanyakan sosis. Hot dog sering dimakan dengan tangan (fingerfood), biasanya dimakan bersama roti lunak (bun) yang berbentuk sama dengan sosis, kadang disertai bumbu dan topping.",

                "Chump Keld Shake, adalah jenis minuman yang ditujukan untuk menambah energi seseorang yang meminumnya. Bagi beberapa kalangan, minuman energi diminum dengan tujuan untuk mencegah kantuk.",

                "Chump Kelpo, adalah makanan yang umumnya dimakan sebagai sarapan. Makanan ini umumnya dimakan dingin, dan dimakan bersama susu, air atau yoghurt, atau dimakan langsung."};
				
				
		//Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+6281391550325",
                "+6281391550325",
                "+6281391550325",
                "+6281391550325",
                "+6281391550325"
        };

        Lat  = new String[]{
                "-10.1760821",
                "-10.1768035",
                "-10.171799",
                "-10.1748536",
                "-10.1747994"
        };

        Long  = new String[]{
                "123.6235399",
                "123.6229451",
                "123.6285576",
                "123.6262513",
                "123.6261514"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
