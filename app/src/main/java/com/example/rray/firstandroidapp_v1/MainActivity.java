package com.example.rray.firstandroidapp_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create EditText, Button, and TextView object by using findViewById
        final EditText nameEdit = (EditText) findViewById(R.id.edit_text_name);
        final Button btn = (Button) findViewById(R.id.button);
        final TextView txtView = (TextView) findViewById(R.id.text_view);

        //set up OnClickListener so that when the button is clicked,
        //text in TextView field will be set to text in EditText field
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText(nameEdit.getText());
            }
        });

    }
}
