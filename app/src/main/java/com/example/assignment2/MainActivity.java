package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button addNoteButton;
    EditText editText;
    List<String> notes = new ArrayList<String>();
    ScrollView scrollView;
    LinearLayout scrollLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNoteButton = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        scrollView = findViewById(R.id.scrollView);
        scrollLayout = findViewById(R.id.scrollLayout);
    }

    public void addNote(View v) {
        String note = editText.getText().toString().trim();
        if (!note.equals("")) {
            notes.add(note);
            System.out.println(notes.toString());
            View newNote = null;
            newNote = (LinearLayout) View.inflate(MainActivity.this, R.layout.scroll_items, null);
            EditText et = newNote.findViewById(R.id.editNote);
            et.setText(note);
            Button db = newNote.findViewById(R.id.deleteButton);

            scrollLayout.addView(newNote);
        }

    }

    public void deleteNote(View v) {
        LinearLayout l = (LinearLayout) (v.getParent()).getParent();
        l.removeView(v);
    }
}
