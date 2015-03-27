package com.example.bhavyarao.todo;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ListView;


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
import android.widget.Toast;

public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row);

        DatabaseHandle db=new DatabaseHandle(this);


        for(int i=5;i<=50;i++){
            db.deleteItem(new Item(null,null,null));
        }

        long insert_status= db.addToDo(new Item("Pay Bill","Credit Card Bill","11/10/1994"));
        if(insert_status==-1){
            Toast.makeText(getApplicationContext(),"insert failed",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"insert success",Toast.LENGTH_LONG).show();
        }
        db.addToDo(new Item("Bill","Pay Electric Bill","23/9/1995"));
        db.addToDo(new Item("Tuesday","Session at 11AM","6/2/2015"));

        int status_update=db.updateToDo(new Item("Bill","water Bill","4/7/2009"));
        if(status_update>0){
            Toast.makeText(getApplicationContext(),"update success",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"update failed",Toast.LENGTH_LONG).show();
        }

        MyAdapter adapter = new MyAdapter(this, generateData());
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        //"+" button in the MAIN_UI should call generateData()
    }

    private ArrayList<Item> generateData()
    {
        //this function will return ArrayList<Item> type object(An induvidual ToDo task//
        //pressing + button in the actionbar will lead you here. Have the take the component's values in the customdialog and copy them to        the database HERE

    }

}



