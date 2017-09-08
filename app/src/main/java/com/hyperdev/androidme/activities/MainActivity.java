package com.hyperdev.androidme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.hyperdev.androidme.BodyPartFragment;
import com.hyperdev.androidme.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            BodyPartFragment bodyPartFragment = new BodyPartFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.BodyPartFragmentContainer, bodyPartFragment)

                    .commit();
        } else {

            BodyPartFragment bodyPartFragment = new BodyPartFragment();
            getSupportFragmentManager().getFragment(savedInstanceState, "myFragmentName");
        }
    }

}
