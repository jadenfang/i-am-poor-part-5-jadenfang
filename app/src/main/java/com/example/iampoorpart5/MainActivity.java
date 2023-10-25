package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button richButton;
    Button poorButton;
    TextView text;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        richButton = findViewById(R.id.button);
        poorButton = findViewById(R.id.button2);
        text = findViewById(R.id.textView);
        image = findViewById(R.id.imageView);

        richButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(richButton);
            }
        });

        poorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(poorButton);
            }
        });


    }

    public void verifyRichness(Button button) {
        if (button.getText().equals("I Am Rich")) {
            text.setText("I AM RICH");
            image.setImageResource(R.drawable.diamond);
        } else {
            text.setText("I AM POOR");
            image.setImageResource(R.drawable.coal);
        }
    }
}