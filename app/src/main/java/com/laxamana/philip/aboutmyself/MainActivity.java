package com.laxamana.philip.aboutmyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onSubmit(View view){
        Intent i = new Intent(this, InfoActivity.class);

        final EditText name = findViewById(R.id.nameEditText);
        final EditText hobby = findViewById(R.id.hobbyEditText);
        final EditText qualification = findViewById(R.id.qualificationEditText);
        final EditText job = findViewById(R.id.jobEditText);

        String userName = name.getText().toString();
        String userHobby = hobby.getText().toString();
        String userQualification = qualification.getText().toString();
        String userJob = job.getText().toString();

        i.putExtra("userName", userName);
        i.putExtra("userHobby", userHobby);
        i.putExtra("userQualification", userQualification);
        i.putExtra("userJob", userJob);

        startActivity(i);

        Toast.makeText(this, "Information submitted!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
