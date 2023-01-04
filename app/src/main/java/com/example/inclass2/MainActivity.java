package com.example.inclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        save = findViewById(R.id.save);

        {

        public void saveOnClick(View view) {
            Book []book = new Book[2] ;
            book[0] = new Book(1 , "C Book" , "ahmad " , "200page") ;
            book[1] = new Book(2 , "Java Book " , " maram" , "300page") ;


            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = sharedPreferences.edit() ;
            Gson gson = new Gson() ;
            String str = gson.toJson(book) ;
            editor.putString("DATA" , str) ;
            editor.commit() ;
            Toast.makeText(this, "Data is Saved \n"+str, Toast.LENGTH_SHORT).show();

        }

    }
