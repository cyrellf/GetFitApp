package com.example.getfitapp.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.getfitapp.AdvancedWorkoutsAct;
import com.example.getfitapp.BeginnerWorkoutsAct;
import com.example.getfitapp.IndexActivity;
import com.example.getfitapp.IntermWorkoutsAct;
import com.example.getfitapp.LoginActivity;
import com.example.getfitapp.MainActivity;
import com.example.getfitapp.R;
import com.example.getfitapp.databinding.FragmentProgramsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentProgramsBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        View view = inflater.inflate(R.layout.fragment_programs, container, false);

        CardView icv = (CardView) view.findViewById(R.id.IntermediateCV);
        CardView bcv = (CardView) view.findViewById(R.id.BeginnerCV);
        CardView acv = (CardView) view.findViewById(R.id.AdvancedCV);
        bcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BeginnerWorkoutsAct.class);
                startActivity(intent);
            }
        });
        icv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IntermWorkoutsAct.class);
                startActivity(intent);
            }
        });
        acv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AdvancedWorkoutsAct.class);
                startActivity(intent);
            }
        });
        return view;
    }


}