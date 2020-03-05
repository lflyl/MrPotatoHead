package com.example.mrpotatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageBody = (ImageView)findViewById(R.id.imageBody);
        final ImageView imageHat = (ImageView)findViewById(R.id.imageHat);
        final ImageView imageEyes = (ImageView)findViewById(R.id.imageEyes);
        final ImageView imageEyebrows = (ImageView)findViewById(R.id.imageEyebrows);
        final ImageView imageGlasses = (ImageView)findViewById(R.id.imageGlasses);
        final ImageView imageArms = (ImageView)findViewById(R.id.imageArms);
        final ImageView imageEars = (ImageView)findViewById(R.id.imageEars);
        final ImageView imageNose = (ImageView)findViewById(R.id.imageNose);
        final ImageView imageMustache = (ImageView)findViewById(R.id.imageMustache);
        final ImageView imageMouth = (ImageView)findViewById(R.id.imageMouth);
        final ImageView imageShoes = (ImageView)findViewById(R.id.imageShoes);

        final CheckBox checkHat = (CheckBox)findViewById(R.id.checkHat);
        final CheckBox checkEyes = (CheckBox)findViewById(R.id.checkEyes);
        final CheckBox checkEyebrows = (CheckBox)findViewById(R.id.checkEyebrows);
        final CheckBox checkGlasses = (CheckBox)findViewById(R.id.checkGlasses);
        final CheckBox checkArms = (CheckBox)findViewById(R.id.checkArms);
        final CheckBox checkEars = (CheckBox)findViewById(R.id.checkEars);
        final CheckBox checkNoes = (CheckBox)findViewById(R.id.checkNose);
        final CheckBox checkMustache = (CheckBox)findViewById(R.id.checkMustache);
        final CheckBox checkMouth = (CheckBox)findViewById(R.id.checkMouth);
        final CheckBox checkShoes = (CheckBox)findViewById(R.id.checkShoes);

        imageBody.setVisibility(View.VISIBLE);
        imageHat.setVisibility(View.INVISIBLE);
        imageEyes.setVisibility(View.INVISIBLE);
        imageEyebrows.setVisibility(View.INVISIBLE);
        imageGlasses.setVisibility(View.INVISIBLE);
        imageArms.setVisibility(View.INVISIBLE);
        imageEars.setVisibility(View.INVISIBLE);
        imageNose.setVisibility(View.INVISIBLE);
        imageMustache.setVisibility(View.INVISIBLE);
        imageMouth.setVisibility(View.INVISIBLE);
        imageShoes.setVisibility(View.INVISIBLE);

        checkHat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageHat.setVisibility(View.VISIBLE);
                }
                else {
                    imageHat.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageEyes.setVisibility(View.VISIBLE);
                }
                else {
                    imageEyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageEyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    imageEyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkGlasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageGlasses.setVisibility(View.VISIBLE);
                }
                else {
                    imageGlasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkArms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageArms.setVisibility(View.VISIBLE);
                }
                else {
                    imageArms.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkEars.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageEars.setVisibility(View.VISIBLE);
                }
                else {
                    imageEars.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkNoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageNose.setVisibility(View.VISIBLE);
                }
                else {
                    imageNose.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkMustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageMustache.setVisibility(View.VISIBLE);
                }
                else {
                    imageMustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkMouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageMouth.setVisibility(View.VISIBLE);
                }
                else {
                    imageMouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkShoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imageShoes.setVisibility(View.VISIBLE);
                }
                else {
                    imageShoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
