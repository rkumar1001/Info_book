package com.rk.informationbook.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.rk.informationbook.R;
import com.rk.informationbook.adapters.ViewPagerAdapterCountries;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutUCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutUCountries = findViewById(R.id.tabLayoutUnitedKingdom);
        viewPagerCountries = findViewById(R.id.viewPagerUnitedKingdom);

        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(),getLifecycle());

        viewPagerCountries.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator =  new TabLayoutMediator(tabLayoutUCountries, viewPagerCountries, true,
                true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                    case 1:
                        tab.setText("France");
                        break;
                    case 2:
                        tab.setText("Italy");
                        break;
                    case 3:
                        tab.setText("India");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();
    }
}