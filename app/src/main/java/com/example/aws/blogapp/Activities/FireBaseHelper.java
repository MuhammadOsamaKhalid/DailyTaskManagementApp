package com.example.aws.blogapp.Activities;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBaseHelper {

    public boolean insert(String name, String email, String conEmail, String password, String conPassword, String fatherName, String gender, String occupation, String dob ){

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        User user = new User(name,email, conEmail,password,conPassword, fatherName,gender,occupation,dob);
        DatabaseReference mRef =  mDatabase.child("users").push();
        mRef.setValue(user);
        return true;
    }
}
