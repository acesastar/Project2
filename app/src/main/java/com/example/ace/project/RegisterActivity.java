package com.example.ace.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
Button btnBackReg,btnRegReg;
EditText edNameReg,edIdReg,edPassReg,edDeptReg,edClassReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        btnBackReg.setOnClickListener(this);
        btnRegReg.setOnClickListener(this);

    }

    private void init(){
        btnBackReg = (Button) findViewById(R.id.button_back_reg);
        btnBackReg = (Button) findViewById(R.id.button_back_reg);
        edNameReg = (EditText) findViewById(R.id.edit_Name_reg);
        edIdReg = (EditText) findViewById(R.id.edit_user_reg);
        edPassReg = (EditText) findViewById(R.id.edit_pass_reg);
        edDeptReg = (EditText) findViewById(R.id.edit_dept_reg);
        edClassReg = (EditText) findViewById(R.id.edit_class_reg);
    }

    @Override
    public void onClick(View v) {

    }
}
