package com.example.moveover.aggregate;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference mDatabase;
    public Survey mySurvey = new Survey();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        mAuth.signInAnonymously()
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signInAnonymously:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "signInAnonymously", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };



        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase = mDatabase.push();//new survey

        mDatabase.child("ID").child("Date").setValue(mySurvey.getDate());
        mDatabase.child("ID").child("Code").setValue(mySurvey.getCode());

        mDatabase.child("Mental").child("Stress").setValue(mySurvey.get_stress());
        mDatabase.child("Mental").child("Anxiety").setValue(mySurvey.get_anxiety());
        mDatabase.child("Mental").child("Worried_Future").setValue(mySurvey.get_depressed());
        mDatabase.child("Mental").child("Depressed").setValue(mySurvey.get_worried_future());
        mDatabase.child("Mental").child("Overworked").setValue(mySurvey.get_overworked());
            mDatabase.child("Mental").child("Overworked").child("Hours Worked").setValue(mySurvey.get_hours_work());
        mDatabase.child("Mental").child("Tired").setValue(mySurvey.get_tired());
            mDatabase.child("Mental").child("Tired").child("Hours Sleep").setValue(mySurvey.get_hours_sleep());
            mDatabase.child("Mental").child("Tired").child("Hours Class Sleep").setValue(mySurvey.get_asleep_class());
            mDatabase.child("Mental").child("Tired").child("All Nighters").setValue(mySurvey.get_all_nighters());

        mDatabase.child("Physical").child("Exercise").setValue(mySurvey.get_exercise());
            mDatabase.child("Physical").child("Exercise").child("Hours Exercise").setValue(mySurvey.get_hours_exercise());
            mDatabase.child("Physical").child("Exercise").child("Intensity").setValue(mySurvey.get_intensity_exercise());
        mDatabase.child("Physical").child("Nutrition").setValue(mySurvey.get_nutrition());
            mDatabase.child("Physical").child("Nutrition").child("Consistent").setValue(mySurvey.get_nutrition_consistent());
        mDatabase.child("Physical").child("Weight Gain").setValue(mySurvey.get_weight_gain());
            mDatabase.child("Physical").child("Weight Gain").child("Gain Increase").setValue(mySurvey.get_gain_increase());
        mDatabase.child("Physical").child("Weight Loss").setValue(mySurvey.get_weight_loss());
            mDatabase.child("Physical").child("Weight Loss").child("Loss Decrease").setValue(mySurvey.get_loss_decrease());

        mDatabase.child("Social").child("Relationships").setValue(mySurvey.get_relationship_issues());
            mDatabase.child("Social").child("Relationships").child("Stability").setValue(mySurvey.get_relationship_stability());
        mDatabase.child("Social").child("Chill Time").setValue(mySurvey.get_hanging_time());
        mDatabase.child("Social").child("Hobbies Time").setValue(mySurvey.get_hobbies_time());

        mDatabase.child("Academic").child("Class Interest").setValue(mySurvey.get_class_interest());
        mDatabase.child("Academic").child("Class Learning").setValue(mySurvey.get_learning_importance());
        mDatabase.child("Academic").child("Class Struggling").setValue(mySurvey.get_learning_struggle());
            mDatabase.child("Academic").child("Class Struggling").child("Difficulty").setValue(mySurvey.get_class_difficulty());
            mDatabase.child("Academic").child("Class Struggling").child("Speed").setValue(mySurvey.get_class_speed());
        mDatabase.child("Academic").child("Class Work").setValue(mySurvey.get_hours_per_week());
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
}
