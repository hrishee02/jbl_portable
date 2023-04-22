package com.hrisheekesh.animation;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import kotlin.jvm.internal.Intrinsics;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CoordinatorLayout coordinatorLayout;
    FrameLayout frameLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.nav);
        toolbar = findViewById(R.id.toolbar);
        coordinatorLayout = findViewById(R.id.coordinatorlayout);
        frameLayout = findViewById(R.id.framelayout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle drawerToggle = setupDrawerToggle();
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout, new MainFragment()).commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.language){
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new LanguageFragmentt()).commit();
                    getSupportActionBar().setTitle("Language");

                    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFFFF"));
                    toolbar.setBackgroundDrawable(colorDrawable);
                    drawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if(id == R.id.connect){
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new ConnectFragment()).commit();
                    getSupportActionBar().setTitle("How to connect speaker");

                    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFFFF"));
                    toolbar.setBackgroundDrawable(colorDrawable);
                    drawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                if(id == R.id.legal){
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new LegalFragment()).commit();
                    getSupportActionBar().setTitle("Legal");

                    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFFFF"));
                    toolbar.setBackgroundDrawable(colorDrawable);
                    drawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });

    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open,  R.string.drawer_close);
    }


    }

