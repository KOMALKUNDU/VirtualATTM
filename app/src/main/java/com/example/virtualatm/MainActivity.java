package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void widhdraw (View view) {
        startActivity(new Intent(getApplicationContext(), WithdrawActivity.class));

    }

    public void addmoney (View view) {
        startActivity(new Intent(getApplicationContext(), AddMoneyActivity.class));
    }

    public void statement (View view) {
        startActivity(new Intent(getApplicationContext(), StatementActivity.class));

    }

    public void checkBalance (View view) {
        startActivity(new Intent(getApplicationContext(), AccountBalanceActivity.class));

    }

    public void exit (View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        finish();
    }
}
