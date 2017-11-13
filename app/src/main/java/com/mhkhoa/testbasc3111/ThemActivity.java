package com.mhkhoa.testbasc3111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThemActivity extends AppCompatActivity
{
    EditText edtMaSo , edtHoTen;
    Button btnThem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);

        anhxa();

        btnThem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                SinhVien a = new SinhVien();
                a.setMasosv(edtMaSo.getText().toString());
                a.setHotensv(edtHoTen.getText().toString());
                Intent intent = new Intent();
                intent.putExtra("SinhVien",a);
                setResult(123,intent);
                finish();
            }
        });
    }

    private void anhxa()
    {
        edtHoTen = findViewById(R.id.edittextmaso);
        edtMaSo = findViewById(R.id.edittexttensv);
        btnThem = findViewById(R.id.buttonthem);
    }
}
