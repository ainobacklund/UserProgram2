package com.example.rekisterointi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage s = UserStorage.getInstance();

    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, AskInformationActivity.class);
        startActivity(intent);
    }

    public void switchToListUsers(View view) {
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }
}