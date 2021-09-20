package com.csapp.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//ประกาศตัวแปร
    AutoCompleteTextView autoCTV; //extends from editext
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCTV = findViewById(R.id.atctv);
        textView = findViewById(R.id.tv);
        String[] fruites ={
                "Orange",
                "Mango",
                "Banana",
                "Durian",
                "Melon",
                "Mangoes",
                "Blueberry"
        };
        //สร้างอแดปเตอร์สำหรับสตริง
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,fruites);
        //กำหนดค่าให้กับ autocompletetextview
        autoCTV.setAdapter(arrayAdapter);
        autoCTV.setThreshold(1);
        //เมื่อคลิกเลือกรายการให้แสดงรูปของผลไม้นั้น ๆ ออกหน้าจอ
        autoCTV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ///ใส่คำสั่งที่นี้
            }
        });
    }


}