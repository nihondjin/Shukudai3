package com.example.shukudai3.ui.share;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shukudai3.R;
import com.example.shukudai3.databinding.FragmentShareBinding;

public class ShareFragment extends Fragment {
    private FragmentShareBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentShareBinding.inflate(inflater, container, false);




        return binding.getRoot(); }
}