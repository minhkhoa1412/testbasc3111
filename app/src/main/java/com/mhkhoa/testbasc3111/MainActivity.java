package com.mhkhoa.testbasc3111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
    Adapter adapter;
    Button btnThem;
    int REQUEST_CODE_THEM = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SinhVien a = new SinhVien("123","Hoàng Sơn");
        SinhVien b = new SinhVien("234","Quốc Trọng");
        SinhVien c = new SinhVien("345","Vũ Duy Phúc");
        sinhVienArrayList.add(a);
        sinhVienArrayList.add(b);
        sinhVienArrayList.add(c);

//        Log.d("AAA", String.valueOf(sinhVienArrayList.size()));
        adapter = new Adapter(MainActivity.this,sinhVienArrayList);
        ListView lstSinhVien = findViewById(R.id.listviewtaolao);
        lstSinhVien.setAdapter(adapter);

        btnThem = findViewById(R.id.buttonthem);
        btnThem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,ThemActivity.class);
                startActivityForResult(intent,REQUEST_CODE_THEM);
            }
        });

        lstSinhVien.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                SinhVien a = new SinhVien();
                a.setMasosv(sinhVienArrayList.get(i).getMasosv());
                a.setHotensv(sinhVienArrayList.get(i).getHotensv());
                Intent intent = new Intent(MainActivity.this,ThemActivity.class);
                intent.putExtra("aaa",a);
                startActivityForResult(intent,234);
            }
        });

        lstSinhVien.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                sinhVienArrayList.remove(i);
                adapter.notifyDataSetChanged();
                return false;
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == REQUEST_CODE_THEM && data != null)
        {
            SinhVien a = (SinhVien) data.getSerializableExtra("SinhVien");
            Log.d("AAA",String.valueOf(a.getHotensv()));
            sinhVienArrayList.add(a);
            adapter.notifyDataSetChanged();

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
