package com.example.cityguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
    private Button ButtonLogin;
    private EditText LoginPass;
    private EditText LoginEmail;
    FirebaseAuth firebaseAuth ;
    private CheckBox checkbox;
    private ProgressDialog progressDialog;


    private FirebaseAuth.AuthStateListener authStateListener;
//    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButtonLogin =(Button) findViewById(R.id.ButtonLogin);
        LoginPass = (EditText) findViewById(R.id.LoginPass);
        LoginEmail = (EditText) findViewById(R.id.LoginEmail);
        checkbox=(CheckBox) findViewById(R.id.checkbox);
        progressDialog =new ProgressDialog(this);

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    LoginPass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{

                    LoginPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });



        firebaseAuth = firebaseAuth.getInstance();
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Lemail= LoginEmail.getText().toString().trim();
                String Lpassword= LoginPass.getText().toString().trim();
                Log.d("check", Lemail);
                Log.d("check2", Lpassword);

                progressDialog.setMessage("LOGGING IN ");
                progressDialog.show();

                firebaseAuth.signInWithEmailAndPassword(Lemail,Lpassword).addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()){
                            Toast.makeText(login.this," LOGIN ERROR!",Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                        else{
                            Intent ihome_page= new Intent(getApplicationContext() , home_page.class);
                            startActivity(ihome_page);
                            progressDialog.dismiss();
                        }
                    }
                });
            }
        });




    }
}

