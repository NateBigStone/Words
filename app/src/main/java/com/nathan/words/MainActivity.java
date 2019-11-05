package com.nathan.words;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {   ///////on slide 38!

    private static final String TAG = "DICTIONARY";

    Button searchButton;
    EditText enterWord;
    TextView wordDefinition;
    ImageView wordImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.search_button);
        enterWord = findViewById(R.id.enter_word);
        wordDefinition = findViewById(R.id.word_definition);
        wordImage = findViewById(R.id.word_image);

        // Hide ImageView until an image is available 
        wordImage.setVisibility(GONE);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String word = enterWord.getText().toString();
                if (word.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter a word", Toast.LENGTH_SHORT).show();
                    return;
                }

                hideKeyboard();
                getDefinitionForWord(word);
            }
        });
    }

    private void getDefinitionForWord(String word) {
        // todo
    }

    private void hideKeyboard() {
        View mainView = findViewById(android.R.id.content);
        InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(mainView.getWindowToken(), 0);
    }

}