package com.communityteam.mycommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    TextView username;
    TextView password;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextView) findViewById(R.id.et_username);
        password = (TextView) findViewById(R.id.et_password);
        loginbtn = (Button) findViewById(R.id.button_login);

       /* when the login button is clicked, we first check if user name is valid, if username is not valid, return username doesn't extist;
        then check if password matches, if doesn't match, return password and username not match;
        if both match, this login button will switch us to the MainActivity.
        */
        // Test: username is peter password is peter123

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // first check username, password, then direct to MainActivity and show different Dashboard and Calendar based on user type
               /*  below is a test. To run this test, also need to set this LoginActivity as LAUNCH activity in AndroidManifest.xml

               if(username.getText().toString().equals("peter") && password.getText().toString().equals("peter123")){
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);

                } else if(!username.getText().toString().equals("peter")){
                    Toast.makeText(LoginActivity.this, "username doesn't exist", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginActivity.this, "username and password not match", Toast.LENGTH_LONG).show();
                }*/
            }
        });
    }
}