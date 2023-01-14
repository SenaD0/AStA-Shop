package com.example.astashop;

import static java.lang.Integer.parseInt;

import static Model.Ernaehrungsform.Ernaehrung.HALAL;
import static Model.Ernaehrungsform.Ernaehrung.KOSCHER;
import static Model.Ernaehrungsform.Ernaehrung.VEGAN;
import static Model.Ernaehrungsform.Ernaehrung.VEGETARISCH;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceManager;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.astashop.databinding.ActivityMainBinding;

import java.util.ArrayList;

import Model.Ernaehrungsform;
import Model.Mitarbeiter;

public class MainActivity extends AppCompatActivity {


    private Mitarbeiter mitarbeiter;
    private Button bestaetigen, zutaten_bearbeiten, foto_hochladen;
    private CheckBox halal, koscher, vegetarisch, vegan;
    private EditText produktname, preis, menge, allergene;
    private String produktname_str, preis_str, menge_str, allergene_str;

    private ImageButton home, qrcode, profilanzeigen;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        home = findViewById(R.id.home_button);
        qrcode = findViewById(R.id.qrButton);
        profilanzeigen = findViewById(R.id.profile_button);
        halal = findViewById(R.id.checkBox_Halal);
        koscher = findViewById(R.id.checkBox_Koscher);
        vegetarisch = findViewById(R.id.checkBox_Vegetarisch);
        vegan = findViewById(R.id.checkBox_Vegan);
        bestaetigen = findViewById(R.id.button_Bestaetigen);
        zutaten_bearbeiten = findViewById(R.id.button_Zutaten_bearbeiten);
        foto_hochladen = findViewById(R.id.button_Foto_hochladen);
        produktname = findViewById(R.id.editText_Produktname);
        preis = findViewById(R.id.editText_Preis);
        menge = findViewById(R.id.editText_Menge);
        allergene = findViewById(R.id.editText_Allergene);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        produktname_str = prefs.getString("Produktname:", "");
        produktname.setText(produktname_str);
        preis_str = prefs.getString("Preis:", "");
        preis.setText(preis_str);
        menge_str = prefs.getString("Menge:", "");
        menge.setText(menge_str);
        allergene_str = prefs.getString("Allergene:", "");
        allergene.setText(allergene_str);
/*

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

 */

        bestaetigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                produktname_str = produktname.getText().toString();
                preis_str = preis.getText().toString();
                menge_str = menge.getText().toString();
                allergene_str = allergene.getText().toString();
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("Produktname:", produktname_str);
                editor.putString("Preis:", preis_str);
                editor.putString("Menge:", menge_str);
                editor.putString("Allergene:", allergene_str);
                editor.apply();
                ArrayList<Ernaehrungsform.Ernaehrung> ernaehrungsformen = new ArrayList<>();
                if (halal.isChecked())
                    ernaehrungsformen.add(HALAL);
                if (koscher.isChecked())
                    ernaehrungsformen.add(KOSCHER);
                if (vegetarisch.isChecked())
                    ernaehrungsformen.add(VEGETARISCH);
                if (vegan.isChecked())
                    ernaehrungsformen.add(VEGAN);
                mitarbeiter.addProdukt(produktname_str, parseInt(menge_str), parseInt(preis_str), allergene_str, ernaehrungsformen);

            }
        });
        zutaten_bearbeiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZutatenlisteActivity.class);
                startActivity(intent);
                finish();
            }
        });
        foto_hochladen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FotohochladenActivity.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StartseiteActivity.class);
                startActivity(intent);
                finish();
            }
        });
        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QrcodeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        profilanzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

}