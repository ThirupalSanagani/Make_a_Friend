package com.example.make_a_friend;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText enterEmailEditText;
    private EditText enterPasswordEditText;
    private Button loginButton;
    private Button googleButton;
    private Button facebookButton;
    private TextView newUserTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        enterEmailEditText = findViewById(R.id.EnterEmailid);
        enterPasswordEditText = findViewById(R.id.EnterPassword);
        loginButton = findViewById(R.id.Login);
        googleButton = findViewById(R.id.Google);
        facebookButton = findViewById(R.id.button);
        newUserTextView = findViewById(R.id.textView2);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here, you can implement your login logic.
                // For demonstration purposes, I'll just show a toast message with a login success message.
                Toast.makeText(LoginActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();

                // Navigate to the MenuActivity after login
                Intent menuIntent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(menuIntent);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Google in the browser when the Google button is clicked
                String googleUrl = "https://www.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleUrl));
                startActivity(intent);
            }
        });

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Facebook in the browser when the Facebook button is clicked
                String facebookUrl = "https://www.facebook.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                startActivity(intent);
            }
        });

        newUserTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the SignupActivity when the "New User? Register" text is clicked
                Intent signUpIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(signUpIntent);
            }
        });
    }
}
