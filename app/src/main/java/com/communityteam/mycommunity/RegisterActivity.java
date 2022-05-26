package com.communityteam.mycommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button cancelbtn;
    Button registerbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // TODO: use binding to do the assignment
        cancelbtn = (Button) findViewById(R.id.button_cancelReg);
        registerbtn = (Button) findViewById(R.id.button_register2);

        // if click Cancel button, discard all the current data and switch to LoginActivity
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this, "You cancelled your registration!", Toast.LENGTH_LONG).show();

                // TODO: remove the current editing data, or rollback transaction

                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        // if click Register button,  if meet all requirement,
        // save all the current data and switch to LoginActivity or switch to MainActivity directly

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO: check the username and see whether it is available; and check other info as well.
                //  If any doesn't meet requirement, then Toast Message "Please check your information."

                // register successfully. return LoginActivity, or to MainActivity directly
                Toast.makeText(RegisterActivity.this, "Register Successfully!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}