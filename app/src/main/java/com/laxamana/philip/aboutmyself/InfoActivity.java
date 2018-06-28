package com.laxamana.philip.aboutmyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle mainInfo = getIntent().getExtras();
        if(mainInfo == null){
            return;
        }

        String userName = mainInfo.getString("userName");
        String userHobby = mainInfo.getString("userHobby");
        String userQualification = mainInfo.getString("userQualification");
        String userJob = mainInfo.getString("userJob");

        final TextView name = findViewById(R.id.nameText);
        final TextView hobby = findViewById(R.id.hobbyText);
        final TextView qualification = findViewById(R.id.qualificationText);
        final TextView job = findViewById(R.id.jobText);

        name.setText(userName);
        hobby.setText(userHobby);
        qualification.setText(userQualification);
        job.setText(userJob);
    }
}
