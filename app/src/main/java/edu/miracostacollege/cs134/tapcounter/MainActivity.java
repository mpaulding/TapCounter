package edu.miracostacollege.cs134.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.countTextView);
    }

    public void tapMe(View v)
    {
        countTextView.setText(String.valueOf(++count));
        Toast.makeText(this, R.string.toast_text, Toast.LENGTH_LONG).show();
    }
}
