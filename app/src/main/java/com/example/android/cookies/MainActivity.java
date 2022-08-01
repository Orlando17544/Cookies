package com.example.android.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.eat_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eatCookie();
            }
        });
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie() {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = findViewById(R.id.android_cookie_image_view);

        imageView.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = findViewById(R.id.status_text_view);

        textView.setText("I'm so full");
    }
}