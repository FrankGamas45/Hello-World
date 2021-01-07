package com.frank.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        //user can tap a button to change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_200));
            }
        });

        //user can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        //user can tap a button to change the text string of the label -Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //user can tap a button on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to "Hello from Frank!"
                textView.setText("Hello from Frank!");

                //2. Reset the color of the text to the original color
                textView.setTextColor(getResources().getColor(R.color.white));

                //3. Reset background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.Light_Blue));
            }
        });

        //user can tap the "Change text string" button to update the label with the text from the text field
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text view to what's in the edit text view
                String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //if the text is empty, update label with default text string.
                if(userEnteredText.isEmpty()){
                    textView.setText(("Enter your own Text!"));
                }
                else
                    textView.setText(userEnteredText);
            }
        });
    }
}