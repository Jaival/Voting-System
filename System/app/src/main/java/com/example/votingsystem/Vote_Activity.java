package com.example.votingsystem;

import android.content.Intent;
import android.location.Criteria;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Vote_Activity extends AppCompatActivity {
    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference condRef = rootRef.child("Candidate");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        canrad();
    }

    public void canrad() {
        final RadioGroup rg = findViewById(R.id.radioGroup2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.candi_1) {
                    Toast.makeText(Vote_Activity.this, "Candidate 1 selected!", Toast.LENGTH_LONG).show();
                    condRef.setValue("1");
                } else if (checkedId == R.id.candi_2) {
                    Toast.makeText(Vote_Activity.this, "Candidate 2 selected!", Toast.LENGTH_LONG).show();
                    condRef.setValue("2");
                } else if (checkedId == R.id.candi_3) {
                    Toast.makeText(Vote_Activity.this, "Candidate 3 selected!", Toast.LENGTH_LONG).show();
                    condRef.setValue("3");
                } else if (checkedId == R.id.candi_4) {

                    Toast.makeText(Vote_Activity.this, "Candidate 4 selected!", Toast.LENGTH_LONG).show();
                    condRef.setValue("4");
                }
                rg.getCheckedRadioButtonId();
            }
        });
    }

    public void gotomainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}