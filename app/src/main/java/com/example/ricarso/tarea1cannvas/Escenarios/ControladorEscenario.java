package com.example.ricarso.tarea1cannvas.Escenarios;

import java.util.ArrayList;
import java.util.Stack;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Ricarso on 13/3/2018.
 */

public class ControladorEscenario {

    public  int actualEscenario = 0;
    public int CantidadEscenarios = 2;
    public static final int  MENU= 0 ;
    public static final int  PRIMER_NIVEL = 1;
    private Escenario escenarios[];

    public ControladorEscenario(){

        escenarios = new Escenario[CantidadEscenarios];
        actualEscenario = PRIMER_NIVEL;
        cargarEscenario(actualEscenario);

    }

    public void cargarEscenario(int escenario){

        if(escenario == MENU){
            escenarios[escenario] =  new Menu();
        }
        if(escenario == PRIMER_NIVEL){
            escenarios[escenario] =  new PrimerNivel();

        }
    }

    public void limpiarEscenario(int escenario){

        escenarios[escenario] = null;
    }


    public void cambiarEstado(int nuevoEscenario){

        limpiarEscenario(actualEscenario);
        actualEscenario = nuevoEscenario;
        cargarEscenario(actualEscenario);
    }

    public void actualizar(){

        escenarios[actualEscenario].actualizar();
    }
    public void dibujar(GL10 gl){

        escenarios[actualEscenario].dibujar(gl);
    }


}
