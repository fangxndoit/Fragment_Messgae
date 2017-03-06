package com.example.administrator.fragment_messgae;

import android.content.Context;
import android.support.annotation.Nullable;
import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.example.administrator.fragment_messgae.R.id.thrid_message;

public class Fragment_btn extends Fragment implements View.OnClickListener{
    private  Button bt_frist;
    private  Button bt_second;
    private  Button bt_thrid;
    private  Button bt_fourth;
    private Context mcontext;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_btn,container,false);
        bt_frist = (Button) view.findViewById(R.id.fourth_btn);
        bt_second = (Button) view.findViewById(R.id.second_btn);
        bt_thrid = (Button) view.findViewById(R.id.thrid_btn);
        bt_fourth = (Button) view.findViewById(R.id.fourth_btn);

        bt_frist.setOnClickListener(this);
        bt_second.setOnClickListener(this);
        bt_thrid.setOnClickListener(this);
        bt_fourth.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.frist_btn:
                TextView mTextViewFrist = (TextView) getActivity().findViewById(R.id.first_message);
                mTextViewFrist.setText("11");
                mTextViewFrist.setVisibility(View.VISIBLE);
                break;
            case R.id.second_btn:
                TextView mTextViewSecond = (TextView) getActivity().findViewById(R.id.second_message);
                mTextViewSecond.setText("99+");
                mTextViewSecond.setVisibility(View.VISIBLE);
                break;
            case R.id.thrid_btn:
                TextView mTextViewThrid = (TextView) getActivity().findViewById(R.id.thrid_message);
                mTextViewThrid.setText("22");
                mTextViewThrid.setVisibility(View.VISIBLE);
                break;
            case R.id.fourth_btn:
                TextView mTextViewFourth = (TextView) getActivity().findViewById(R.id.fourth_message);
                mTextViewFourth.setText("");

                break;
        }
    }
}

