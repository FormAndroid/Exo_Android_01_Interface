package be.bxl.formation.exo_01_interface_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        // La méthode "getIntent()" recuperer le message d'intention qui a provoqué le démarrage de l'activité.
        Intent intent = getIntent();

        // La méthode ".getExtras()" sur l'intent, permet de récuperer l'ensemble de des données envoyé
        Bundle data = intent.getExtras();

        // La méthode ".getTypeExtra(...)" permet de recuperer une donnée ciblé
        String msg = intent.getStringExtra("DEMO");

    }
}