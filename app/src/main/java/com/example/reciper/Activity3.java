package com.example.reciper;

//Imported Dependencies
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;

public class Activity3 extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ImageView googleBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        googleBtn = findViewById(R.id.login_google_button);



        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);

           googleBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    signIn();
                };
                void signIn() {
                    Intent signInIntent = gsc.getSignInIntent();
                    startActivityForResult(signInIntent, 1000);


                    Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(Data);

                    try {
                        task.getResult(ApiException.class);
                        navigateToSecondActivity();

                    } catch (ApiException e) {
                        Toast.makeText(getApplicationContext(),"Something went wrong",Toast.LENGTH_SHORT).show();
                    }


                }
                void navigateToSecondActivity(){
                    finish();
                    Intent intent = new Intent(Activity3.this,SecondActivity3.class);
                    startActivity(intent);

                }
                });





                EditText username = (EditText) findViewById(R.id.Username);
        MaterialButton createAccount = (MaterialButton) findViewById(R.id.create_account);
        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username1 = username.getText().toString();
                Toast.makeText(Activity3.this,"Username is",Toast.LENGTH_SHORT).show();
            }
        });

//intent for back button(It takes you back to Activity2)
        ImageButton goToActivityButton = findViewById(R.id.back_button);
        goToActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });


    }

}
