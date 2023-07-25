package com.example.make_a_friend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signupButton;
    private TextView forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        nameEditText = findViewById(R.id.editTextTextName);
        emailEditText = findViewById(R.id.editTextTextPersonName);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        signupButton = findViewById(R.id.Signup);
        forgotPasswordTextView = findViewById(R.id.textView2);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here, you can implement your signup logic.
                // For demonstration purposes, I'll just show a toast message with a signup success message.
                Toast.makeText(SignupActivity.this, "Signup successful!", Toast.LENGTH_SHORT).show();

                // Navigate to the DashboardActivity after signup
                Intent dashboardIntent = new Intent(SignupActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your forgot password logic here if needed.
                // For demonstration purposes, I'll just show a toast message.
                Toast.makeText(SignupActivity.this, "Forgot Password clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
