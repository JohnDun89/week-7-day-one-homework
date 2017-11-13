package com.example.johnd.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private TextView inputQuestion;
    private EditText inputEdit;
    private Button go;

    public MainActivity(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputQuestion = (TextView) findViewById(R.id.top);
        this.inputEdit = (EditText) findViewById(R.id.input);
        this.go = (Button) findViewById(R.id.button);

        Log.d("MainActivity","OnCreate called");

    }

    public void onButtonClicked(View view){
        Log.d("mainActivity","onButtonPressed");
        String input = this.inputEdit.getText().toString();
        Log.d(getClass().toString(),input);

        WordCount wordCount = new WordCount();
        String stringLenght = wordCount.number(input);
        this.inputQuestion.setText(stringLenght);
    }
}
