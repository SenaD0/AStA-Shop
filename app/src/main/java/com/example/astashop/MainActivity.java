package com.example.astashop;

import static java.lang.Integer.parseInt;

import static Model.Ernaehrungsform.Ernaehrung.HALAL;
import static Model.Ernaehrungsform.Ernaehrung.KOSCHER;
import static Model.Ernaehrungsform.Ernaehrung.VEGAN;
import static Model.Ernaehrungsform.Ernaehrung.VEGETARISCH;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.astashop.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

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

import java.util.ArrayList;

import Model.Ernaehrungsform;
import Model.Mitarbeiter;
import Model.Produkt;

public class MainActivity extends AppCompatActivity {

    private Mitarbeiter mitarbeiter;
    private Button bestaetigen, zutaten_bearbeiten, foto_hochladen;
    private CheckBox halal, koscher, vegetarisch, vegan;
    private boolean halal_b, koscher_b, vegetarisch_b, vegan_b;
    private EditText produktname, preis, menge, allergene;
    private String produktname_str, preis_str, menge_str, allergene_str;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Ernaehrungsform halal_e, koscher_e, vegetarisch_e, vegan_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        halal_e = new Ernaehrungsform(HALAL, new ArrayList<Produkt>());
        koscher_e = new Ernaehrungsform(KOSCHER, new ArrayList<Produkt>());
        vegetarisch_e = new Ernaehrungsform(VEGETARISCH, new ArrayList<Produkt>());
        vegan_e = new Ernaehrungsform(VEGAN, new ArrayList<Produkt>());
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
                setContentView(R.layout.zutatenliste);
            }
        });
        foto_hochladen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView((R.layout.foto_hochladen));
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_host_fragment_content_main) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}