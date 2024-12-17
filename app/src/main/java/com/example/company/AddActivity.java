package com.example.company;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    int f=PG2Activity.f;
    int[] a=new int[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

            if(f==0)
            {
                Toast.makeText(getApplicationContext(),"success1",Toast.LENGTH_LONG).show();
            }
            if (f==1)
            {
                Toast.makeText(getApplicationContext(),"success2",Toast.LENGTH_LONG).show();
            }

    }
}