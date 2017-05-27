package com.example.cier.tabhosttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TabHost tab;
    private Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        test1();

//        setContentView(R.layout.activity_main_second);
//        test2();

    }

    public void test1(){
        tab= (TabHost) findViewById(R.id.tabHost);
        tab.setup();//初始化tabHost容器
        //在tabHost创建标签，然后设置标题/标签图片(null)/标签页内容
        //null就是每一个标签的图片
        tab.addTab(tab.newTabSpec("tab1").setIndicator("标签1",null).setContent(R.id.tab1));
        tab.addTab(tab.newTabSpec("tab2").setIndicator("标签2",null).setContent(R.id.tab2));
        tab.addTab(tab.newTabSpec("tab3").setIndicator("标签2",null).setContent(R.id.tab3));

        bt1= (Button) findViewById(R.id.tab1_button);
        bt2= (Button) findViewById(R.id.tab2_button);
        bt3= (Button) findViewById(R.id.tab3_button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tab1->button", Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tab2->button", Toast.LENGTH_SHORT).show();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tab3->button", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void test2(){
        tab= (TabHost) findViewById(R.id.tabHost_2);
        tab.setup();

        LayoutInflater inflater=LayoutInflater.from(this);
        inflater.inflate(R.layout.sub_tab_activity_one,tab.getTabContentView());
        inflater.inflate(R.layout.sub_tab_activity_two,tab.getTabContentView());
//        inflater.inflate(R.layout.sub_tab_activity_three,tab.getTabContentView());

        tab.addTab(tab.newTabSpec("tab1").setIndicator("标签1",null).setContent(R.id.tab_layout_1));
        tab.addTab(tab.newTabSpec("tab2").setIndicator("标签2",null).setContent(R.id.tab_layout_2));
//        tab.addTab(tab.newTabSpec("tab1").setIndicator("标签2",null).setContent(R.id.tab_layout_3));

    }
}
