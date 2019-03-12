package com.example.votingsystem;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Candidate_Add_Activity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected static final String ass = "Done";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_candidate);
    }

    public void send_data(View view)
    {
        EditText Name = findViewById(R.id.editText4);
        EditText Party = findViewById(R.id.editText5);
        EditText Des = findViewById(R.id.editText6);

        String name = Name.getText().toString();
        String party = Party.getText().toString();
        String des = Des.getText().toString();

        Map<String,Object> dataToSave = new HashMap<>();
        dataToSave.put("Name",name);
        dataToSave.put("Party",party);
        dataToSave.put("Description",des);

        db.collection("Jaival").add(dataToSave).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d(ass, "Data Fetched");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(ass, "Error", e);
            }
        });
    }
}