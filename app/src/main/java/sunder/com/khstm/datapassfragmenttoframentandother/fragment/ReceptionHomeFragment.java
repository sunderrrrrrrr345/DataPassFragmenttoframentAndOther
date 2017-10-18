package sunder.com.khstm.datapassfragmenttoframentandother.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sunder.com.khstm.datapassfragmenttoframentandother.R;
import sunder.com.khstm.datapassfragmenttoframentandother.SecondActivity;

public class ReceptionHomeFragment extends Fragment {


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

        //Send data to SecondFragment
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra("Regular_visitor", "1");
        startActivity(intent);
    //    getActivity().finish();
    }
}


