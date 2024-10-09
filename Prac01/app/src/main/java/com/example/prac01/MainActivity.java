package com.example.prac01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static int REQUEST_CODE=1;
    private Button bt1;
    private TextView textView2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv1=findViewById(R.id.textView2);
        TextView tv2=findViewById(R.id.textView3);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(MainActivity.this,Page2.class);
                startActivityForResult(it,REQUEST_CODE=1);
            }
        });
        Intent iten= getIntent();
        Bundle bundle=iten.getExtras();
        String str1;
        Float fl1;
        if (bundle != null){
             str1= bundle.getString("Name");
             fl1= bundle.getFloat("Điểm GPA");
            tv1.setText("Họ tên:" + str1);
            tv2.setText( "Điểm GPA: "+fl1.toString());
        }
    }
}