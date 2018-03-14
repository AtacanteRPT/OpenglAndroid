package com.example.ricarso.tarea1cannvas;

         import android.opengl.GLSurfaceView;
         import android.support.v7.app.AppCompatActivity;
         import android.os.Bundle;

public class Principal extends AppCompatActivity {

    private GLSurfaceView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pantalla = new MiGLSurfaceView(this);
        setContentView(pantalla);
    }


}
