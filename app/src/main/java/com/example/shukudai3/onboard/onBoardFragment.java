package com.example.shukudai3.onboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shukudai3.databinding.FragmentOnBoardBinding;

import org.jetbrains.annotations.Nullable;

public class onBoardFragment extends Fragment {
    private FragmentOnBoardBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnBoardBinding.inflate(getLayoutInflater(), container, false);
        init_viewpager_adapter();
        return binding.getRoot();
    }

    private void init_viewpager_adapter() {
        if (binding.viewPager != null) {
            ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
            binding.viewPager.setAdapter(adapter);
            binding.wormDotsIndicator.setViewPager(binding.viewPager);
        }

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private int COUNT = 3;
        ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new FirstFragment();
                    break;
                case 1:
                    fragment = new SecondFragment();
                    break;
                case 2:
                    fragment = new ThirdFragment();
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return COUNT;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + (position + 1);
        }
    }

}