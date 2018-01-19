package com.example.cvct121.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public final String TAG_MAIN = "MainActivity";
    Button btnFour;
    Button btnFive;
    Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
       // TAG_MAIN = this.getLocalClassName().getSimpleName():
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFour = (Button)findViewById(R.id.button4);
        btnFive = (Button)findViewById(R.id.button5);
        btnOne = (Button)findViewById(R.id.button);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG_MAIN,"You clicked on button one");
            }
        });
    }

    public void clickedTwoThree (View view)
    {
        switch (view.getId())
        {
            case R.id.button2:
                Toast.makeText(this, "Button Two Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                System.out.println("Clicked on button 3");
                Log.e(TAG_MAIN, "Clicked on button 3");
                break;
                default:
        }
    }
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button4:
                Toast.makeText(this, "Button four Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                System.out.println("Clicked on button 5");
                Log.e(TAG_MAIN, "Clicked on button 5");
                break;
            default:
        }

    }
}
