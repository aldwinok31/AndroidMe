package com.hyperdev.androidme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hyperdev.androidme.BodyPartFragment;
import com.hyperdev.androidme.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BodyPartFragment bodyPartFragment = new BodyPartFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.BodyPartFragmentContainer, bodyPartFragment)
                .commit();
    }

}
