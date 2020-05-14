package com.safari.travel_v1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.safari.travel_v1.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout username, password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.username = (TextInputLayout) findViewById(R.id.username);
        this.password = (TextInputLayout) findViewById(R.id.password);
        this.btnLogin = (Button) findViewById(R.id.btnLogin);

        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUsername = username.getEditText().getText().toString().trim();
                String sPassword = password.getEditText().getText().toString().trim();

                if(sUsername.length() > 0 && sPassword.length() > 0 ){

                    if(sUsername.isEmpty()){
                        username.setError("Ecrivez votre nom d'utilisateur");
                        return;
                    }else if(sPassword.isEmpty()){
                        password.setError("Ecrivez votre mot de passe");
                        return;
                    }

                }else{
                    username.setError("Veuillez remplire tout les champs");
                    password.setError("Veuillez remplire tout les champs");
                }
            }
        });

    }
}
