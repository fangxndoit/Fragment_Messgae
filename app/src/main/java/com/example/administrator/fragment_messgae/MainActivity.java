package com.example.administrator.fragment_messgae;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout ly_one,ly_two,ly_three,ly_four;
    private TextView tab_frist,tab_second,tab_thrid,tab_fourth;
    private TextView frist_message,second_message,third_message,fourth_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction  = getFragmentManager().beginTransaction();
        Fragment_btn f_btn = new Fragment_btn();
        transaction.add(R.id.fragment_container,f_btn);
        transaction.commit();


        bindView();

    }

    private void bindView() {
        ly_one = (LinearLayout) findViewById(R.id.tab_bar_frist);
        ly_two = (LinearLayout) findViewById(R.id.tab_bar_second);
        ly_three = (LinearLayout) findViewById(R.id.tab_bar_third);
        ly_four = (LinearLayout) findViewById(R.id.tab_bar_fourth);
        //ly_one.performClick();

        tab_frist = (TextView) findViewById(R.id.tab_frist);
        tab_second = (TextView) findViewById(R.id.tab_second);
        tab_thrid = (TextView) findViewById(R.id.tab_third);
        tab_fourth = (TextView) findViewById(R.id.tab_fourth);

        frist_message = (TextView) findViewById(R.id.first_message);
        second_message = (TextView) findViewById(R.id.second_message);
        third_message = (TextView) findViewById(R.id.thrid_message);
        fourth_message = (TextView) findViewById(R.id.fourth_message);

        ly_one.setOnClickListener(this);
        ly_two.setOnClickListener(this);
        ly_three.setOnClickListener(this);
        ly_four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tab_bar_frist:
                setselected();
                tab_frist.setSelected(true);
                frist_message.setVisibility(View.INVISIBLE);
                break;
            case R.id.tab_bar_second:
                setselected();
                tab_second.setSelected(true);
                second_message.setVisibility(View.INVISIBLE);
                break;
            case R.id.tab_bar_third:
                setselected();
                tab_thrid.setSelected(true);
                third_message.setVisibility(View.INVISIBLE);
                break;
            case R.id.tab_bar_fourth:
                setselected();
                tab_fourth.setSelected(true);
                fourth_message.setVisibility(View.INVISIBLE);
                break;
        }
    }

    private void setselected() {
        tab_frist.setSelected(false);
        tab_second.setSelected(false);
        tab_thrid.setSelected(false);
        tab_fourth.setSelected(false);
    }
}
