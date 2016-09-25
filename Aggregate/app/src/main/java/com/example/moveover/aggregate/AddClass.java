package com.example.moveover.aggregate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AddClass extends AppCompatActivity {

    EditText input;

    TextView classs1;

    public static String message1;

    String file_name = "classes";

    private ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_add_class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter class code");
//        builder.setMessage("Enter class code");
        input = new EditText(this);
        builder.setView(input);

        classs1 = (TextView) findViewById(R.id.class1);

        //Set positive button

        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {

            View view;

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String txt = input.getText().toString();
                Toast.makeText(getApplicationContext(), "Class " + txt + " Added", Toast.LENGTH_LONG).show();
                message1 = txt;
                writeMessage(view);
                readMessage(view);


                Intent intent = new Intent(AddClass.this,Scrolling.class);
                startActivity(intent);

            }

            public void writeMessage(View view) {
                try {
                    FileOutputStream fileOutputStream = openFileOutput(file_name, MODE_PRIVATE);
                    fileOutputStream.write(message1.getBytes());
                    fileOutputStream.close();
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void readMessage(View view){
                try {
                    String Message;
                    FileInputStream fileInputStream = openFileInput("classes");
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuffer stringBuffer = new StringBuffer();

                    while ((Message = bufferedReader.readLine()) != null) {
                        stringBuffer.append(Message + "\n");
                    }
                    classs1.setText(stringBuffer.toString());
                    classs1.setVisibility(View.VISIBLE);
                    System.out.print(stringBuffer.toString());

                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        //Set negative button

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }

        });

        // Create the Dialog

        final AlertDialog ad = builder.create();

        ImageButton button = (ImageButton) findViewById(R.id.addclass);
        button.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View argo0) {
                ad.show();
            }
        });

    }


}
