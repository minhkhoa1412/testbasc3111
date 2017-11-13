package com.mhkhoa.testbasc3111;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by thaim on 13/11/2017.
 */

public class Adapter extends BaseAdapter
{
    Context context;
    ArrayList<SinhVien> sinhVienArrayList;
    LayoutInflater inflater;

    public Adapter(Context context, ArrayList<SinhVien> sinhVienArrayList)
    {
        this.context = context;
        this.sinhVienArrayList = sinhVienArrayList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount()
    {
        return sinhVienArrayList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return sinhVienArrayList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
//        view = inflater.inflate(R.layout.item_sample_sinhvien, null);
//        LinearLayout lln = view.findViewById(R.id.lln);
//        TextView txtMaso = view.findViewById(R.id.textviewmaso);
//        TextView txtTenSV = view.findViewById(R.id.textviewtensv);
        if (i % 2 == 0)
        {
            view = inflater.inflate(R.layout.item_sample_sinhvien, null);
            LinearLayout lln = view.findViewById(R.id.lln);
            TextView txtMaso = view.findViewById(R.id.textviewmaso);
            TextView txtTenSV = view.findViewById(R.id.textviewtensv);
            txtMaso.setText(sinhVienArrayList.get(i).getMasosv());
            txtTenSV.setText(sinhVienArrayList.get(i).getHotensv());
        }
        else
        {
            view = inflater.inflate(R.layout.item_sample_sinhvien2, null);
            LinearLayout lln = view.findViewById(R.id.lln);
            TextView txtMaso = view.findViewById(R.id.textviewmaso);
            TextView txtTenSV = view.findViewById(R.id.textviewtensv);
            txtMaso.setText(sinhVienArrayList.get(i).getMasosv());
            txtTenSV.setText(sinhVienArrayList.get(i).getHotensv());
        }
        return view;
    }
}
