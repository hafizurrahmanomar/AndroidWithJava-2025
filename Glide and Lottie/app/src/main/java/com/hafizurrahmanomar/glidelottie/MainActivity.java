package com.hafizurrahmanomar.glidelottie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Button imageBTN;
    ImageView imageShow;
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageBTN = findViewById(R.id.imageBTN);
        imageShow = findViewById(R.id.imageShow);
        animationView = findViewById(R.id.animationView);



        imageBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code here(Drawable image=>hafiz and placeholderimage)
                Glide.with(MainActivity.this).load("data:image/jpeg;base64,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")
                        .error(R.drawable.hafiz)
                        .placeholder(R.drawable.placeholderimage)
                        .centerCrop()
                        .into(imageShow);

                animationView.setAnimation(R.raw.animation);
                /*if not run*/
                /*animationView.playAnimation();
                animationView.setRepeatCount(LottieDrawable.INFINITE);
                animationView.setRepeatCount(200);*/
            }
        });

    }
}