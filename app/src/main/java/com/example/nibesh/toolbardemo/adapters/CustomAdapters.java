package com.example.nibesh.toolbardemo.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.text.StaticLayout;
import android.widget.ArrayAdapter;

import com.example.nibesh.toolbardemo.R;
import com.example.nibesh.toolbardemo.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nibesh on 9/23/17.
 */

public class CustomAdapters extends ArrayAdapter<Student>{
    private List<Student>students;
    private Context ctx;

    public CustomAdapters(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);


    }

    public CustomAdapters(List<Student> students, Context ctx) {
        this(ctx, R.layout.activity2);
        this.ctx = ctx;
        this.students = students;
    }

    static class ViewHolder()


}
