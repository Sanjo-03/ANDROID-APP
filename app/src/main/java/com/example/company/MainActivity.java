package com.example.company;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button b1;
    String ad,ad1;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.uname);
        t2=(EditText) findViewById(R.id.pass);

        b1=(Button) findViewById(R.id.Log);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ad=t1.getText().toString();
                ad1=t2.getText().toString();
                if(ad.equals("admin"))
                {

                    if (ad1.equals("12345"))
                    {
                        Toast.makeText(getApplicationContext(),"GOOD",Toast.LENGTH_LONG).show();
                        flag=0;
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"WRONG PASSWORD",Toast.LENGTH_LONG).show();
                        flag=1;
                    }
                }
                else
                {

                    Toast.makeText(getApplicationContext(),"WRONG USERNAME",Toast.LENGTH_LONG).show();
                    flag=1;
                }
                if (flag==1)
                {
                    Toast.makeText(getApplicationContext(),"CHECK USERNAME AND PASSWORD...",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i=new Intent(getApplicationContext(),PG2Activity.class);
                    startActivity(i);
                }

            }
        });


    }
}