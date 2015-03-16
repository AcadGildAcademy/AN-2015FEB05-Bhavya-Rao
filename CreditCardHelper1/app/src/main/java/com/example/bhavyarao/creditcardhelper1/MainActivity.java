package com.example.bhavyarao.creditcardhelper1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity

{
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText e1,e2,e3,e4,e5,e6;
    Button bt1,bt2;
    Double principle,rate,minimum_payment,monthlyPrinciple,monthlyBalance, monthlyfloatInterestPaid,count=0.0,totalInterest=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
        e4=(EditText)findViewById(R.id.et4);
        e5=(EditText)findViewById(R.id.et5);
        e6=(EditText)findViewById(R.id.et6);
        bt1=(Button)findViewById(R.id.b1);
        bt2=(Button)findViewById(R.id.b2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                principle = Double.parseDouble(s1);
                String s2 = e2.getText().toString();
                rate = Double.parseDouble(s2);
                String s3 = e3.getText().toString();
                minimum_payment = Double.parseDouble(s3);
                do {

                   if(count>0) {
                       principle = monthlyBalance;

                   }
                    monthlyfloatInterestPaid = Math.ceil((principle * (rate / (1200))));

                    monthlyPrinciple = minimum_payment - monthlyfloatInterestPaid;

                    monthlyBalance = principle - monthlyPrinciple;

                    totalInterest=totalInterest+monthlyfloatInterestPaid;
                    count++;
                }while (monthlyBalance>=0);
                e5.setText(String.valueOf(count));
                e6.setText(String.valueOf(totalInterest));
                e4.setText(String.valueOf(principle));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(null);
                e2.setText(null);
                e3.setText(null);
                e4.setText(null);
                e5.setText(null);
                e6.setText(null);
            }
        });
    }



}
