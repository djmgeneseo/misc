package com.example.david.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private Button showDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialogButton = (Button) findViewById(R.id.buttonMain);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show alert dialog
                // Alert dialog belongs to activity
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // Setup dialog - setup title
                alertDialog.setTitle(R.string.alert_title);
                // alertDialog.setTitle(getResources().getString(R.string.alert_title);

                // Set message
                alertDialog.setMessage(R.string.alert_message);

                // Set Cancelable - user must select option before exiting window
                alertDialog.setCancelable(false);

                // Set negative button
                alertDialog.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }); // alert NO onClickListener

                // Set positive button
                alertDialog.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Exit window activity
                        MainActivity.this.finish();
                    }
                }); // alert YES onClickListener

                // Create dialog
                AlertDialog dialog = alertDialog.create();

                // Show dialog
                dialog.show();
            }
        }); // Button onClickListener

    } // MainActivity
}
