package com.example.votingsystem;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class Candidate_Add_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_candidate);
    }

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected static final String TAG = "Done";

    public void adddata(View view) {

        EditText Name = findViewById(R.id.editText4);
        EditText PartyName = findViewById(R.id.editText5);
        EditText Description = findViewById(R.id.editText6);

        String cname = Name.getText().toString();
        String Partyname = PartyName.getText().toString();
        String Desc = Description.getText().toString();
        Map<String, Object> dataTosave = new HashMap<>();
        dataTosave.put("Name", cname);
        dataTosave.put("Partyname", Partyname);
        dataTosave.put("Description", Desc);

        db.collection("Kushal").add(dataTosave).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d(TAG, "Data loaded");

            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "failure", e);


            }
        });


    }
}