package com.example.shukudai3.onboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shukudai3.R;
import com.example.shukudai3.databinding.FragmentFirstBinding;
import com.example.shukudai3.databinding.FragmentSecondBinding;
import com.example.shukudai3.utils.PreferncesHelper;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        setClickListener();
        return binding.getRoot();
    }

    private void setClickListener() {
        binding.send.setOnClickListener(v -> {
            PreferncesHelper sharedPref = new PreferncesHelper();
            sharedPref.init(requireContext());
            sharedPref.OnSaveOnboardState();
            close();
        });
    }

    private void close() {
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);
        navController.navigate(R.id.action_onBoadFragment_to_nav_home);
    }
}