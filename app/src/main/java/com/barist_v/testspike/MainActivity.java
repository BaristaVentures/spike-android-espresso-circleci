package com.barist_v.testspike;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.toastButton).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        new AlertDialog.Builder(MainActivity.this)
            .setTitle("Dialog title")
            .setMessage("it works!")
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
              }
            }).show();
      }
    });
  }
}
