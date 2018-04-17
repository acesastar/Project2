package com.example.ace.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity implements View.OnClickListener {
    Button btnloginLog,btnRegLog;
    EditText edUserLog,edPassLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
        btnloginLog.setOnClickListener(this);
        btnRegLog.setOnClickListener(this);
    }

    private void init(){
        edUserLog = (EditText) findViewById(R.id.edit_user_login);
        edPassLog = (EditText) findViewById(R.id.edit_pass_login);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.button_reg_login:
                intent = new Intent(getApplicationContext(),RegisterActivity.class);
        }       break;
    }
}
