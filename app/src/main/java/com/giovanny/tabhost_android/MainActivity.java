package com.giovanny.tabhost_android;

import android.app.TabActivity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;

        spec = tabhost.newTabSpec("Tab1")
                .setIndicator("Tab1", res.getDrawable(R.drawable.icon))
                .setContent(R.id.tab1Layout);

        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Tab2")
                .setIndicator(null, res.getDrawable(R.drawable.icon))
                .setContent(R.id.tab2Layout);

        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Tab3")
                .setIndicator("Tab3", res.getDrawable(R.drawable.icon))
                .setContent(R.id.tab3Layout);

        tabhost.addTab(spec);

    }
}
