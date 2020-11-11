package org.o7planning.listview_xemthem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView_vc, lview, listView_gopy, listView_chinhsach;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_vc, arr_bean, arr_been_gopy, array_bean_chinhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView_vc = (ListView)findViewById(R.id.list);
        lview = (ListView) findViewById(R.id.list1);
        listView_gopy = (ListView) findViewById(R.id.list2);
        listView_chinhsach = (ListView) findViewById(R.id.list3);

        arr_bean_vc = new ArrayList<ListViewBean>();
        arr_bean_vc.add(new ListViewBean(R.drawable.vi, "Voucher"));
        adapter = new ListViewBaseAdapter(arr_bean_vc, this);
        listView_vc.setAdapter(adapter);

        arr_bean = new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.payment, "Payment"));
        arr_bean.add(new ListViewBean(R.drawable.lichsu, "Lịch sử đơn hàng"));
        arr_bean.add(new ListViewBean(R.drawable.bill, "Hóa đơn"));
        arr_bean.add(new ListViewBean(R.drawable.credit, "Reward Credits"));
        arr_bean.add(new ListViewBean(R.drawable.ungdung, "Ứng dụng cho chủ quán"));
        adapter = new ListViewBaseAdapter(arr_bean, this);
        lview.setAdapter(adapter);

        arr_been_gopy = new ArrayList<ListViewBean>();
        arr_been_gopy.add(new ListViewBean(R.drawable.moibanbe, "Mời bạn bè"));
        arr_been_gopy.add(new ListViewBean(R.drawable.gopy, "Góp ý"));
        adapter = new ListViewBaseAdapter(arr_been_gopy, this);
        listView_gopy.setAdapter(adapter);

        array_bean_chinhsach = new ArrayList<ListViewBean>();
        array_bean_chinhsach.add(new ListViewBean(R.drawable.chinhsach, "Chính sách quy định"));
        array_bean_chinhsach.add(new ListViewBean(R.drawable.caidat, "Cài đặt"));
        adapter = new ListViewBaseAdapter(array_bean_chinhsach, this);
        listView_chinhsach.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            Toast.makeText(this, "Bạn không có Ví Voucher", Toast.LENGTH_SHORT).show();
        }
        else if (position==1)
        {
            Toast.makeText(this, "Bạn không có Payment", Toast.LENGTH_SHORT).show();
        }
        else if (position==2)
        {
            Toast.makeText(this, "Bạn chưa có lịch sử thanh toán nào", Toast.LENGTH_SHORT).show();
        }
        else if (position==3)
        {
            Toast.makeText(this, "Bạn chưa có hóa đơn", Toast.LENGTH_SHORT).show();
        }
        else if (position==4)
        {
            Toast.makeText(this, "Hehe", Toast.LENGTH_SHORT).show();
        }
        else if (position==5)
        {
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        }


    }
}