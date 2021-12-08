package com.example.inclusive8.ui.notifications3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inclusive8.databinding.FragmentNotifications2Binding;
import com.example.inclusive8.databinding.FragmentNotifications3Binding;

public class Notifications3Fragment extends Fragment {


    private FragmentNotifications3Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotifications3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}