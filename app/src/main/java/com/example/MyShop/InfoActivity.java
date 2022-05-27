package com.example.MyShop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.MyShop.R;

public class InfoActivity extends AppCompatActivity {

    int no =0;//그림 번호
    int imgs[] = {R.drawable.escaperoom,R.drawable.info2,R.drawable.info3,R.drawable.info4,R.drawable.info5};

    String txts[] = {"이스케이프 룸 영화를 모티브로 한 방탈출카페","2번 테마","3번 테마","4번 테마","5번 테마"};

    ImageView img_info;
    TextView txt_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.btn_info_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        img_info.setImageResource(imgs[0]);
        txt_info.setText(txts[0]);

        img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InfoActivity.this, "이미지 클릭", Toast.LENGTH_SHORT).show();

                no = ++no%5;
                img_info.setImageResource(imgs[no]);
                txt_info.setText(txts[no]);
            }
        });

    }
}