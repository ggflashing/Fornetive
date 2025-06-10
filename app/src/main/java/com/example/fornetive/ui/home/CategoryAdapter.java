package com.example.fornetive.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fornetive.databinding.ItemCategoryBinding;
import com.example.fornetive.models.Category_model;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    ItemCategoryBinding binding;

    List<Category_model> list_main = new ArrayList<>();

    NavController navController;

    public void setList_main(List<Category_model> list_main) {
        this.list_main = list_main;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.onBind(list_main.get(position));

    }

    @Override
    public int getItemCount() {
        return list_main.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemCategoryBinding binding;


        public ViewHolder(@NonNull ItemCategoryBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Category_model categoryModel) {
        }
    }
}
