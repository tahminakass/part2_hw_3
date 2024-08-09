package com.example.part2_hw_3;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.part2_hw_3.databinding.PizzaItemBinding;

public class PizzaViewHolder extends RecyclerView.ViewHolder {

    PizzaItemBinding binding;

    public PizzaViewHolder(@NonNull PizzaItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public  void onBind(String name,String image) {
        binding.tvName.setText(name);
        Glide.with(binding.imgPizza).
                load(image).into(binding.imgPizza);
    }
}
