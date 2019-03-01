package com.example.votingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dashboard_Admin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);
    }
    public void goToCandidateInfo(View view)
    {
        Intent intent = new Intent(this, Candidate_Admin_Activity.class);
        startActivity(intent);
    }
    public void goVoteView(View view)
    {
        Intent intent = new Intent(this, Voting_Admin_Activity.class);
        startActivity(intent);
    }
    public void goToResultAdmin(View view)
    {
        Intent intent = new Intent(this, Result_Admin_Activity.class);
        startActivity(intent);
    }
}
