package com.example.astashop;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FotohochladenActivity extends AppCompatActivity {

    private ImageButton home, qrcode, profilanzeigen, produkthinzu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotohochladen);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        home = findViewById(R.id.home_button);
        qrcode = findViewById(R.id.qrButton);
        profilanzeigen = findViewById(R.id.profile_button);
        produkthinzu = findViewById(R.id.produkthinzufuegen);


/*

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

 */


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotohochladenActivity.this, StartseiteActivity.class);
                startActivity(intent);
                finish();
            }
        });
        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotohochladenActivity.this, QrcodeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        profilanzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotohochladenActivity.this, ProfilActivity.class);
                startActivity(intent);
                finish();
            }
        });

        produkthinzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotohochladenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}