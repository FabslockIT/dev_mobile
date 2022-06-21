package com.premier.webox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.connexion);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("fabien") && password.getText().toString().equals("1234")){
                    Toast.makeText(MainActivity.this, "Username and Password is correct",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,welcome.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Username or Password is incorrect",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}