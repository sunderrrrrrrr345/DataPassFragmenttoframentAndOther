package sunder.com.khstm.datapassfragmenttoframentandother.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import sunder.com.khstm.datapassfragmenttoframentandother.MainActivity;
import sunder.com.khstm.datapassfragmenttoframentandother.R;
import sunder.com.khstm.datapassfragmenttoframentandother.SecondActivity;

public class SecondFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reception_home, container, false);
        Hello(view);
        return view;
    }

    private void Hello(View view) {
        SecondActivity activity = (SecondActivity) getActivity();
        //String myDataFromActivity = activity.getMyData();
        //    String mParam1 = getArguments().getString("data");
        String data= activity.getIntent().getExtras().getString("Regular_visitor");
        Toast.makeText(getActivity(), ":" + data, Toast.LENGTH_SHORT).show();





        //fetch activiy data same activity with fragment

        SecondActivity activity1 = (SecondActivity) getActivity();
        String str=activity1.getMyData();
        Toast.makeText(getActivity(), "Sunder:" + str, Toast.LENGTH_SHORT).show();

    }
}


