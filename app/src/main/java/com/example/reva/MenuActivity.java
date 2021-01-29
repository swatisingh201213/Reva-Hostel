package com.example.reva;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
        switch (Item.getItemId()) {
            case R.id.areva:
                Intent a = new Intent(getApplicationContext(), ArevaActivity.class);
                startActivity(a);
                break;
            case R.id.hreva:
                Intent b = new Intent(getApplicationContext(), Hreva.class);
                startActivity(b);
                break;
            case R.id.athithi:
                Intent x = new Intent(getApplicationContext(), AthithiActivity.class);
                startActivity(x);
                break;
                case R.id.call:
                Intent c = new Intent(getApplicationContext(), CallActivity.class);
                startActivity(c);
                break;
            case R.id.feedback:
                Intent d = new Intent(getApplicationContext(), FeedbackActivity.class);
                startActivity(d);
                break;
            case R.id.facilities:
               Intent e = new Intent(getApplicationContext(), FacilitiesActivity.class);
                startActivity(e);
                break;
            case R.id.dev:
                Intent f = new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(f);
                break;
            case R.id.food:
                Intent g = new Intent(getApplicationContext(), FoodActivity.class);
                startActivity(g);
                break;
            case R.id.gallery:
                Intent h = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(h);
                break;
            case R.id.vid:
                Intent t = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(t);
                break;
            case R.id.rr:
                Intent j = new Intent(getApplicationContext(), RRActivity.class);
                startActivity(j);
                break;
            case R.id.rooms:
                Intent k = new Intent(getApplicationContext(), RoomsActivity.class);
                startActivity(k);
                break;
            case R.id.security:
                Intent l = new Intent(getApplicationContext(), SecurityActivity.class);
                startActivity(l);
                break;
        };
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
