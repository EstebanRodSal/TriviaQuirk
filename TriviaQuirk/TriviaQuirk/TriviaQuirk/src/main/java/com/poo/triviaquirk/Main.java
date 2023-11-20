/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.triviaquirk;

import Jframes.JResultadosSinglePlayer;
import Jframes.Jmenu;
import Jframes.JsinglePlayer;
import Logica.LogicaJuego;

/**
 *
 * @author esteb
 */
public class Main {
    public static void main(String[] args) {
        Jmenu jmenu = new Jmenu();
        JsinglePlayer jsinglePlayer = new JsinglePlayer();
        JResultadosSinglePlayer jResultados = new JResultadosSinglePlayer();  
        LogicaJuego logicaJuego = new LogicaJuego();
        logicaJuego.activarMenu(jmenu);
    }
}
