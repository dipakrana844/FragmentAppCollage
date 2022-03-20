package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2,l3, l;
    ListView lv;
    String[] subject;
    TextView tv;
    int count = 0;
    Integer[] image = {R.drawable.a,R.drawable.b, R.drawable.c};
    public int ret() {
        count++;
        if(count > 2)
        count = 0;
        return image[count];
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subject  = new String[]{"CE Engineering","IT Engineering" , "EC Engineering", "ICT Engineering"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, subject);

        lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);
        l1 = findViewById(R.id.l1);
        tv =findViewById(R.id.textView);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundResource(ret());
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i ==  0){
                    tv.setText("\n\n\nDepartment of Computer Engineering was established in the year 2009 with the objective of imparting " +
                                    "quality education in the field of Computer Engineering"
                            );
                }else if(i == 1){
                    tv.setText("\n\n\nDepartment of IT Engineering was established in the year 2009 with the objective of imparting " +
                            "quality education in the field of IT Engineering"
                    );
                }else if(i == 2){
                    tv.setText("\n\n\nDepartment of EC Engineering was established in the year 2009 with the objective of imparting " +
                            "quality education in the field of EC Engineering"
                    );
                }else if(i == 3){
                    tv.setText("\n\n\nDepartment of ICT Engineering was established in the year 2009 with the objective of imparting " +
                            "quality education in the field of ICT Engineering"
                    );
                }
            }
        });
    }
}
