package com.example.votingsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Candidate_Edit_Activity extends AppCompatActivity {

//    FirebaseFirestore db = FirebaseFirestore.getInstance();
//    public DocumentReference docRef = db.collection("Jaival").document("");
//    protected static final String ass = "Done";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_edit);
    }

//    public void fetch(View view)
//    {
//        TextView Name = findViewById(R.id.textView7);
//        TextView Party = findViewById(R.id.textView8);
//        TextView Des = findViewById(R.id.textView9);
//        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                if(task.isSuccessful())
//                {
//                    DocumentSnapshot document = task.getResult();
//                    if(document.exists())
//                    {
//                        Log.d(ass,"Done"+ document.getData());
//                    }
//                    else
//                    {
//                        Log.d(ass,"No Such Document");
//                    }
//                }
//                else
//                {
//                    Log.d(ass,"Data Failed To Fetch");
//                }
//            }
//        });
}
