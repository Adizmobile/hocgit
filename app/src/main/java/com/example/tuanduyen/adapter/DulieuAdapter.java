package com.example.tuanduyen.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tuanduyen.model.Dulieu;

import java.util.List;

/**
 * Created by TUANDUYEN on 11/14/2017.
 */
// kế thừa
    // Activity : màn hình hiện tại
public class DulieuAdapter extends ArrayAdapter<Dulieu> {

    Activity context; // màn hình sử dụng
    int resource; // layout từng hiển thị (làm theo khách hàng) chính là itemmanhinh1
    List<Dulieu> objects; // Danh sách nguồn dữ liêu muốn hiển thụu

    public DulieuAdapter( Activity context, @LayoutRes int resource, @NonNull List<Dulieu> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    // Quyết định xấu hay đẹp
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = this.context.getLayoutInflater(); // Dùng để buil từ 1 textfile bình thuowgf trở thành 1 file hệ thông java
        View row = layoutInflater.inflate(this.resource,null); // this.resource chính l itemmanhinh1

        TextView txtTile = row.findViewById(R.id.txt)


        return row;
    }
}
