package com.alaqsa.android_lab.custombottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;

import com.alaqsa.android_lab.custombottomnavigation.Fragments.FavouritFragment;
import com.alaqsa.android_lab.custombottomnavigation.databinding.ActivityMainBinding;
import com.ismaeldivita.chipnavigation.model.Menu;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        //Start listener for BottomNavigationView
//        binding.bottomNav.setOnItemSelectedListener(item -> {
//            switch (item.get) {
//                case R.id.home:
//                    setCurrentFragment(new HomeFragment());
//                    return true;
//                case R.id.favorites:
//                    setCurrentFragment(new FavouritFragment());
//                    return true;
//                case R.id.menu:
//                    setCurrentFragment(new MenuFragment());
//                    return true;
//            }
//            return false;
//        });

//        binding.bottomNav.getSelectedItemId();
    }

//    private void setCurrentFragment(Fragment fragment) {
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fcvBottomNavigation,fragment);
//        ft.commit();
//    }

}}