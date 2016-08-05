package com.giovanny.tabhost_android;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = getTabHost();

        tabhost.addTab(tabhost.newTabSpec("Tab1")
                .setIndicator("Tab1", getResources().getDrawable(R.drawable.icon))
                .setContent(R.id.tab1));
        tabhost.addTab(tabhost.newTabSpec("Tab2")
                .setIndicator("Tab2", getResources().getDrawable(R.drawable.icon))
                .setContent(R.id.tab2));
        tabhost.addTab(tabhost.newTabSpec("Tab3")
                .setIndicator("Tab3", getResources().getDrawable(R.drawable.icon))
                .setContent(R.id.tab3));
    }
}
