package ve.com.ucab.tesis.tesisprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;

import static ve.com.ucab.tesis.tesisprueba.R.layout.activity_main;
import static ve.com.ucab.tesis.tesisprueba.R.layout.content_mapa;

public class MainActivity extends AppCompatActivity {

    Button btnTipos,btnUbicacion,btnSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        btnUbicacion = (Button) findViewById(R.id.btn_Ubicacion);
        btnSitios = (Button) findViewById(R.id.btn_Lugares);
        btnSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivity1.class);
                startActivity(intent);

            }
            }
            );

    }
}
