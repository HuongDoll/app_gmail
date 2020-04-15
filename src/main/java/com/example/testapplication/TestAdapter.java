package com.example.testapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TestAdapter extends BaseAdapter {
    List<TestModel> itemp;

    public TestAdapter(List<TestModel> itemp) {
        this.itemp = itemp;
    }

    @Override
    public int getCount() {
        return itemp.size();
    }

    @Override
    public Object getItem(int position) {
        return itemp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder  viewHolder;
        if (convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.mini_item, parent, false);
            viewHolder= new ViewHolder();
            viewHolder.avt=convertView.findViewById(R.id.avt);
            viewHolder.name=convertView.findViewById(R.id.name);
            viewHolder.message=convertView.findViewById(R.id.message);
            viewHolder.time=convertView.findViewById(R.id.time);
            viewHolder.image=convertView.findViewById(R.id.image);
            convertView.setTag(viewHolder);
        }
        viewHolder=(ViewHolder)convertView.getTag();
        final TestModel temp= itemp.get(position);
        viewHolder.name.setText(temp.getName());
        viewHolder.avt.setText(temp.getName().substring(0,1));
        viewHolder.avt.setBackgroundResource(temp.getPic());
        viewHolder.message.setText(temp.getMessage());
        viewHolder.time.setText(temp.getTime());
        if(temp.issellect){
            viewHolder.image.setImageResource(R.drawable.full);
        }else viewHolder.image.setImageResource(R.drawable.unfull);
        viewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean issellect=itemp.get(position).getIssellect();
                itemp.get(position).setIssellect(!issellect);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }

    class ViewHolder{
        TextView name;
        TextView avt;
        TextView message;
        TextView time;
        ImageView image;
    }
}
