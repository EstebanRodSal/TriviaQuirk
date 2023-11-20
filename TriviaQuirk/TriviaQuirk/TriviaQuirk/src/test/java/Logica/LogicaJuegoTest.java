/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Logica;

import Jframes.JMultijugador;
import Jframes.Jmenu;
import Jframes.JsinglePlayer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author esteb
 */
public class LogicaJuegoTest {
    
    public LogicaJuegoTest() {
    }

    /**
     * Test of activarMenu method, of class LogicaJuego.
     */
    @Test
    public void testActivarMenu() {
        System.out.println("activarMenu");
        Jmenu jmenu = new Jmenu();
        LogicaJuego instance = new LogicaJuego();
        instance.activarMenu(jmenu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activarCategorias method, of class LogicaJuego.
     */
    @Test
    public void testActivarCategorias() {
        System.out.println("activarCategorias");
        Jmenu menu = null;
        LogicaJuego instance = new LogicaJuego();
        instance.activarCategorias(menu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activarSinglePlayer method, of class LogicaJuego.
     */
    @Test
    public void testActivarSinglePlayer() {
        System.out.println("activarSinglePlayer");
        String categorias = "";
        JsinglePlayer jsinglePlayer = null;
        LogicaJuego instance = new LogicaJuego();
        instance.activarSinglePlayer(categorias, jsinglePlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activarMultijugador1 method, of class LogicaJuego.
     */
    @Test
    public void testActivarMultijugador1() {
        System.out.println("activarMultijugador1");
        String categorias = "";
        JMultijugador jMultijugador = null;
        LogicaJuego instance = new LogicaJuego();
        instance.activarMultijugador1(categorias, jMultijugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activarMultijugador2 method, of class LogicaJuego.
     */
    @Test
    public void testActivarMultijugador2() {
        System.out.println("activarMultijugador2");
        String categorias = "";
        JMultijugador jMultijugador = null;
        LogicaJuego instance = new LogicaJuego();
        instance.activarMultijugador2(categorias, jMultijugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaDeporets method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaDeporets() {
        System.out.println("generarPreguntaDeporets");
        JsinglePlayer jsinglePlayer = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaDeporets(jsinglePlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultados method, of class LogicaJuego.
     */
    @Test
    public void testMostrarResultados() {
        System.out.println("mostrarResultados");
        LogicaJuego instance = new LogicaJuego();
        instance.mostrarResultados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultadosMultijugador method, of class LogicaJuego.
     */
    @Test
    public void testMostrarResultadosMultijugador() {
        System.out.println("mostrarResultadosMultijugador");
        LogicaJuego instance = new LogicaJuego();
        instance.mostrarResultadosMultijugador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaMusica method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaMusica() {
        System.out.println("generarPreguntaMusica");
        JsinglePlayer jsinglePlayer = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaMusica(jsinglePlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaVideojuegos method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaVideojuegos() {
        System.out.println("generarPreguntaVideojuegos");
        JsinglePlayer jsinglePlayer = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaVideojuegos(jsinglePlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaDeporetsMultijugador method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaDeporetsMultijugador() {
        System.out.println("generarPreguntaDeporetsMultijugador");
        JMultijugador jMultijugador = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaDeporetsMultijugador(jMultijugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaMusicaMultijugador method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaMusicaMultijugador() {
        System.out.println("generarPreguntaMusicaMultijugador");
        JMultijugador jMultijugador = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaMusicaMultijugador(jMultijugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarPreguntaVideojuegosMultijugador method, of class LogicaJuego.
     */
    @Test
    public void testGenerarPreguntaVideojuegosMultijugador() {
        System.out.println("generarPreguntaVideojuegosMultijugador");
        JMultijugador jMultijugador = null;
        LogicaJuego instance = new LogicaJuego();
        instance.generarPreguntaVideojuegosMultijugador(jMultijugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
