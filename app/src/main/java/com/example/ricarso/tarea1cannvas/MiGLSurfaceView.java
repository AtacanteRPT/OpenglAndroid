package com.example.ricarso.tarea1cannvas;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Ricarso on 13/3/2018.
 */

public class MiGLSurfaceView extends GLSurfaceView {

    private final Motor motor;
    public MiGLSurfaceView(Context context) {
        super(context);
        // creando OPENGL version 3
        setEGLContextClientVersion(3);
        motor = new Motor();
        setRenderer(motor);

    }
}
