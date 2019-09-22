package com.example.bodolah;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.bodolah.fragment.FragmentGame;
import com.example.bodolah.fragment.FragmentHome;
import com.example.bodolah.fragment.FragmentMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    //a list to store all the products


    BottomNavigationView bottom;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiple_res);
        bottom = findViewById(R.id.bottom);
        bottom.setOnNavigationItemSelectedListener(this);

        LoadFragment(new FragmentHome());


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment f = null;

        switch (menuItem.getItemId()){
            case R.id.home:
                f = new FragmentHome();
                break;

            case R.id.game:
                f = new FragmentGame();
                break;

            case R.id.menu:
                f = new FragmentMenu();
                break;
        }

        return LoadFragment(f);
    }

    private boolean LoadFragment(Fragment fragment){

        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();

            return true;
        }

        return false;


    }
}





