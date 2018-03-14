package com.example.ricarso.tarea1cannvas;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;

import com.example.ricarso.tarea1cannvas.Escenarios.ControladorEscenario;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Ricarso on 13/3/2018.
 */

public class Motor implements GLSurfaceView.Renderer{

    private ControladorEscenario controladorEscenario;
    private int c = 0;

    public Motor(){
        controladorEscenario = new ControladorEscenario();
    }


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig eglConfig) {
        gl.glClearColor(0.0f, 1.0f, 1.0f, 1.0f);
        Log.d("actualizar","HOLA MUNDO");
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int ancho, int alto) {
        gl.glViewport(0, 0, ancho, alto);
        Log.d("actualizar","ancho:" +ancho+"alto:"+alto);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(gl.GL_COLOR_BUFFER_BIT);
//        controladorEscenario.dibujar(gl);
        Log.d("dibujar", "DIBUJO: " + c++);
    }
}
