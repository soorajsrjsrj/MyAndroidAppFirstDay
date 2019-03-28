package com.example.myandroidappfirstday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edtUserEmail;
    private EditText edtPassword;
    private Button btnLogin;
    private Button btnClear;
    private TextView txtMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserEmail = findViewById(R.id.editText);
        edtPassword = findViewById(R.id.editText2);
        txtMsg = findViewById(R.id.textView3);

        btnLogin = findViewById(R.id.login);
        btnClear = findViewById(R.id.signin);

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String email = edtUserEmail.getText().toString();
               String paswrd = edtPassword.getText().toString();
           
               Toast.makeText(MainActivity.this, "Email :- "+email, Toast.LENGTH_SHORT).show();
           }
       });

    }
}
