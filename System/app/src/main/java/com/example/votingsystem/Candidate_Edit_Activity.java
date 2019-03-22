package com.example.votingsystem;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Candidate_Edit_Activity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected static final String TAG = "Done";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_edit);
    }

    public void UpdateData(View view) {
        final EditText Name = findViewById(R.id.Candidate_Name);
        final EditText Party = findViewById(R.id.Party_Name);
        final EditText Des = findViewById(R.id.Description);

        String name = Name.getText().toString();
        String party = Party.getText().toString();
        String des = Des.getText().toString();


        Map<String,Object> datatoUpdate = new HashMap<>();
        datatoUpdate.put("Name",name);
        datatoUpdate.put("Party",party);
        datatoUpdate.put("Description",des);

        DocumentReference c = db.collection("Candidate").document("Candidate 3");
        c.update(datatoUpdate)
                .addOnSuccessListener(new OnSuccessListener< Void >() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(Candidate_Edit_Activity.this, "Updated Successfully",
                                Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Error", e);
            }
        });
    }

}
