package com.example.part2_hw_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.part2_hw_3.databinding.FragmentRVBinding;

import java.util.ArrayList;

public class RVFragment extends Fragment {

    FragmentRVBinding binding;
    PizzaAdapter adapter;
    private ArrayList<String> pizzaList = new ArrayList<>();
    private ArrayList<String> imageList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRVBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new PizzaAdapter(pizzaList, imageList);
        binding.rvView.setAdapter(adapter);
    }

    private void loadData() {
        pizzaList.add(" TOP \n PIZZA №1");
        imageList.add("https://imag.bonviveur.com/pizza-margarita.jpg");

        pizzaList.add(" TOP \n PIZZA №2");
        imageList.add("https://www.allrecipes.com/thmb/D73VvwH_cG06pVzh05oitTocYV8=/0x512/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-4x3-BG-2974-a7a9842c14e34ca699f3b7d7143256cf.jpg");

        pizzaList.add(" TOP \n PIZZA №3");
        imageList.add("https://istoedinheiro.com.br/wp-content/uploads/sites/17/2023/07/feche-a-pizza-italiana-sobre-o-queijo-cole-o-foco-seletivo-generativo-ai-1258-153047.jpeg");

        pizzaList.add(" TOP \n PIZZA №4");
        imageList.add("https://www.recipetineats.com/tachyon/2023/05/Garlic-cheese-pizza_9.jpg");

        pizzaList.add(" TOP \n PIZZA №5");
        imageList.add("https://content.jdmagicbox.com/comp/udaipur-rajasthan/d8/9999px294.x294.221112161953.f2d8/catalogue/pizza-planet-cafe-udaipur-city-udaipur-rajasthan-pizza-outlets-pw2zddgw2x.jpg");

        pizzaList.add(" TOP \n  SWEETS \n PIZZA №1");
        imageList.add("https://images.immediate.co.uk/production/volatile/sites/30/2023/03/Chocolate-pizza-a24aff9.jpg");

        pizzaList.add(" TOP \n SWEETS \n PIZZA №2");
        imageList.add("https://www.imperialsugar.com/sites/default/files/styles/recipe_image_node_full/public/recipe/Chocolate-Pizza-imperial.jpg?itok=Uvdgvvez");

        pizzaList.add(" TOP \n  SWEETS \n PIZZA №3");
        imageList.add("https://badun.nestle.es/imgserver/v1/80/1290x742/pizza-de-chocolate-con-fresones-y-platanos.jpg");
    }
}