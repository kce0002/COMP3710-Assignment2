package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button addNoteButton;
    EditText editText;
    List<String> notes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNoteButton = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
    }

    public void addNote(View v) {
        String note = editText.getText().toString().trim();
        if (!note.equals("")) {
            notes.add(note);
        }
        System.out.println(notes.toString());
    }
}
