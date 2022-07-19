package com.example.recyclerview;

import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.SportView> {


    private static final String TAG = "ViewAdapter";
    String[] data;

    public ViewAdapter(String[] mData){
        data = mData;
    }

    @NonNull
    @Override
    //Getting "Planks"
    public SportView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "Getting Planks");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_plank, parent, false);
        return new SportView(view);
    }

    //Counting how many items
    @Override
    public int getItemCount() {
        Log.d(TAG, "Counting");
        return data.length;
    }

    //Writing planks
    @Override
    public void onBindViewHolder(@NonNull SportView holder, int position) {
        Log.d(TAG, "Writing");
        holder.tv.setText(data[position]);
    }

    protected class SportView extends RecyclerView.ViewHolder{

        //Managing the planks
        TextView tv;
        public SportView(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            Log.d(TAG, "Managing");
        }
    }
}
