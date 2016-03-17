package com.creatorbe.multiedittext;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowDialog(View v) {

        Toast.makeText(getApplicationContext(), "Fill Edittext!", Toast.LENGTH_LONG)
                .show();
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.layout_row);
        dialog.setTitle("Title");
        final LinearLayout layoutmain = (LinearLayout) dialog
                .findViewById(R.id.layoutmain);
        Button btnadd = (Button) dialog.findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                EditText myedittext = new EditText(MainActivity.this);
                layoutmain.addView(myedittext);
            }
        });
        dialog.show();
    }

    // set id edittext programatically
    //http://stackoverflow.com/questions/18207623/generate-dynamic-id-for-multiple-edittext-with-button-click

}