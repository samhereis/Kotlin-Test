package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;

class MainActivity : AppCompatActivity()
{
    private val clickableButton:Button = findViewById<Button>(R.id.clickableButton);

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickableButton.text = "a changed name";
    }
}