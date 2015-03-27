package com.example.bhavyarao.todo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.content.DialogInterface;
/**
 * Created by Bhavya Rao on 22-03-2015.
 */
public class Customdialog extends ActionBarActivity
{
    EditText et1,et2;
    DatePicker dp;
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater li = LayoutInflater.from(getApplicationContext());

        View promptsView = li.inflate(R.layout.customdialog, null);

        AlertDialog.Builder dia = new AlertDialog.Builder(getApplicationContext());
        dia.setView(promptsView);

       et1=(EditText)promptsView.findViewById(R.id.e1);
       et2=(EditText)promptsView.findViewById(R.id.e2);
       dp=(DatePicker)promptsView.findViewById(R.id.datePicker);
       bt1=(Button)promptsView.findViewById(R.id.b1);
       bt2=(Button)promptsView.findViewById(R.id.b2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        dia.setNegativeButton(R.id.b2,new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {

            }

        });
        dia.setCancelable(false);
        dia.show();
    }

}
