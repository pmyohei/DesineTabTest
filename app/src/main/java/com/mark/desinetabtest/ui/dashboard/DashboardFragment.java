package com.mark.desinetabtest.ui.dashboard;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mark.desinetabtest.R;

//import com.mark.desinetabtest.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    //private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_record, container, false);


        ImageView iv_circle = root.findViewById(R.id.iv_circle);

        // ObjectAnimatorにセットする
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(iv_circle, "rotation", 0.0f, 360.0f);
        objectAnimator.setDuration(4000);
        objectAnimator.setInterpolator( new AccelerateDecelerateInterpolator() );
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        // アニメーションを開始
        objectAnimator.start();

        return root;

        /*        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}