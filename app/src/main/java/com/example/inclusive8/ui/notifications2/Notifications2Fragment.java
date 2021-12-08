package com.example.inclusive8.ui.notifications2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inclusive8.databinding.FragmentNotifications2Binding;
import com.example.inclusive8.databinding.FragmentNotificationsBinding;

public class Notifications2Fragment extends Fragment {


    private FragmentNotifications2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotifications2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}