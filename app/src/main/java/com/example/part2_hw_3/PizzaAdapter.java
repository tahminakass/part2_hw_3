package com.example.part2_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.part2_hw_3.databinding.PizzaItemBinding;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {

    private ArrayList<String> pizzaList;
    private ArrayList<String> imageList;

    public PizzaAdapter(ArrayList<String> pizzaList, ArrayList<String> imageList) {
        this.pizzaList = pizzaList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(PizzaItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.onBind(pizzaList.get(position),imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return pizzaList.size();
    }
}
