package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] names={"King's Indian Defense","London System","French Defense","King's Gambit","Knight Opening",
            "Wing Gambit","Portuguese Gambit","Scotch Game","Sicilian Defense","Alekhine Defense"};
    ImageButton prev,next;
    ImageView pic;
    TextView text;
    int currentImage=0;
    //0,1,2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        text=findViewById(R.id.text);
        String idX="pic"+currentImage;
        int x=getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(10+currentImage-1)%10;
        String idY="pic"+currentImage;
        int y=getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
    public void next(View v){
        text=findViewById(R.id.text);
        String idX="pic"+currentImage;
        int x=getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(currentImage+1)%10;
        String idY="pic"+currentImage;
        int y=getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
}