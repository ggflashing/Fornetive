package com.example.fornetive.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;

import com.airbnb.lottie.LottieAnimationView;
import com.example.fornetive.databinding.FragmentHomeBinding;
import com.example.fornetive.models.Category_model;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    List<Category_model> list_category = new ArrayList<>();

    CategoryAdapter adapter;

    LottieAnimationView lotty_reclama;

    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        View root = binding.getRoot();


        return root;
    }
    private void

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}