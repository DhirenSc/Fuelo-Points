package com.example.dhirenchandnani.fuelo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Dhiren Chandnani on 29-10-2016.
 */

public class LoginActivity extends AppCompatActivity {

    static String userid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);




    }
    public void signupPost(View view){
        Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(i);

    }
    public void loginPost(View view){
        EditText username = (EditText) findViewById(R.id.tusername);
        EditText password = (EditText) findViewById(R.id.tpassword);
        String uname = username.getText().toString();
        String pass = password.getText().toString();
        if(!uname.equals("") && !pass.equals("")){

            new ValidateUserLogin(this).execute(uname,pass);

        }
        else{
            Toast toast= Toast.makeText(this, "Please Fill all entries!", Toast.LENGTH_SHORT);
            toast.setMargin(150,150);
            toast.show();
        }




    }
}