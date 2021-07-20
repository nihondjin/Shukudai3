package com.example.shukudai3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shukudai3.R;
import com.example.shukudai3.model.NoteModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.MyViewHolder> {

    ArrayList<NoteModel> list = new ArrayList<>();

    public NoteAdapter() {
    }

    public void addText(NoteModel title) {
        list.add(title);
        notifyDataSetChanged();

    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        holder.txttitle.setText(list.get(position).getTxtTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void filterList(ArrayList<NoteModel> filteredList) {
        list = filteredList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txttitle;

        public MyViewHolder(View itemView) {
            super(itemView);

            txttitle = itemView.findViewById(R.id.item_title);
        }
    }

}
