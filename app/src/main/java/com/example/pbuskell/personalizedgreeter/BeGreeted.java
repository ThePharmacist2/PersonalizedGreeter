package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";
    String strUsersNameLast = "";
    String strUsersNameMid = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    TextView txtvwGreetingSpace;
    EditText edtxtNameFieldLast;
    EditText edtxtNameFieldMid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
        edtxtNameFieldLast = (EditText) findViewById(R.id.edtxtNameFieldLast);
        edtxtNameFieldMid = (EditText) findViewById(R.id.edtxtNameFieldMid);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strUsersNameLast = edtxtNameFieldLast.getText().toString();
        strUsersNameMid = edtxtNameFieldMid.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersName, strUsersNameMid, strUsersNameLast));
    }
}
