package com.tutorial.deleteit;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserProfiles extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofiles);
        Button button = findViewById(R.id.b2);
        final EditText editText = findViewById(R.id.et2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText.getText().toString();
                Intent intent = new Intent(UserProfiles.this,Profile.class);
                intent.putExtra("username",username);
                startActivity(intent);

            }
        });
    }
}
