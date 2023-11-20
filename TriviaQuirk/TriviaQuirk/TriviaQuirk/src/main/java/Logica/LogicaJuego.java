/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Jframes.JCategorias;
import Jframes.JMultijugador;
import Jframes.JResultadosSinglePlayer;
import Jframes.JResultadosMultijugador;
import Jframes.Jmenu;
import Jframes.JsinglePlayer;
import Preguntas.PreguntasDeportes;
import Preguntas.PreguntasMusica;
import Preguntas.PreguntasVideojuegos;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.Timer;
import com.proyecto.avance.Avance;

/**
 *
 * @author esteb
 */
public class LogicaJuego {
    private PreguntasMusica musica;
    private PreguntasVideojuegos videojuegos;
    private PreguntasDeportes deportes;
    private Jugador jugador;
    private JsinglePlayer jsingleplayer;
    private JMultijugador jMultijugador;;
    private Jmenu jmenu;
    private Byte respuesta = 0; 
    private JResultadosSinglePlayer resultados;
    private JResultadosMultijugador resultadosMultijugador;
    private int preguntas;
    
    /**
     * Variables para manipular al jugador1 y jugador2
     */
    public static String nombreJugador1;
    public static String nombreJugador2;
    

    /**
     * Variables del puntaje del jugador 1
     */
    private int correctasJ1;
    private int incorrectasJ1; 
    private int cantidadPreguntasAcertadasJ1;
    
     /**
     * Variables del puntaje del jugador 2
     */
    private int correctasJ2;
    private int incorrectasJ2; 
    private int cantidadPreguntasAcertadasJ2;
    
    
    
    
    
     /**
     * Esta variable contabiliza la cantidad de puntos por el usuario
     */
    private int correctas;
    
     /**
     * Esta variable contabiliza la cantidad de preguntas incorrectas por el usuario
     */
    private int incorrectas; 
    
    /**
     * Esta variable contabiliza la cantidad de preguntas acertadas por el usuario
     */
    private int cantidadPreguntasAcertadas;

/**
 * Activates the specified menu by setting its visibility to true.
 *
 * @param jmenu The menu to be activated.
 */    
     public void activarMenu(Jmenu jmenu) {
        jmenu.setVisible(true);
    }
     
    public void activarCategorias(Jmenu menu) {
         menu.setVisible(false);
         JCategorias categorias = new JCategorias();
         categorias.setVisible(true);
     }
/**
 * Activates the single-player menu, hides the main menu, and initializes the single-player game.
 *
 * @param jmenu         The main menu to be hidden.
 * @param jsinglePlayer The single-player menu to be activated.
 */    
public void activarSinglePlayer(String categorias, JsinglePlayer jsinglePlayer) {
        this.resultados = new JResultadosSinglePlayer();
        this.jsingleplayer = jsinglePlayer;
        correctas = 0; // Reiniciar el contador de respuestas correctas
        jsinglePlayer.actualizarPuntos(correctas); // Actualizar el contador de puntos en la interfaz
        jsingleplayer.setVisible(true);

            switch (categorias) {
                case "Deportes":
                    jsinglePlayer.setCategoriaText("Deportes");
                    generarPreguntaDeporets(jsinglePlayer);
                    break;
                case "Videojuegos":
                    jsinglePlayer.setCategoriaText("Videojuegos");
                    generarPreguntaVideojuegos(jsinglePlayer);
                    break;
                case "Musica":
                    jsinglePlayer.setCategoriaText("Musica");
                    generarPreguntaMusica(jsinglePlayer);
                    break;
                default:

                    break;        
        }
    }
    
        public void activarMultijugador1(String categorias, JMultijugador jMultijugador) {
             
            this.jMultijugador = jMultijugador;
            correctas = 0; // Reiniciar el contador de respuestas correctas
            jMultijugador.actualizarPuntos(correctas); // Actualizar el contador de puntos en la interfaz
            jMultijugador.setVisible(true);

            switch (categorias) {
                case "Deportes":
                    jMultijugador.setCategoriaText("Deportes");
                    generarPreguntaDeporetsMultijugador(jMultijugador);
                    break;
                case "Videojuegos":
                    jMultijugador.setCategoriaText("Videojuegos");
                    generarPreguntaVideojuegosMultijugador(jMultijugador);
                    break;
                case "Musica":
                    jMultijugador.setCategoriaText("Musica");
                    generarPreguntaMusicaMultijugador(jMultijugador);
                    break;
                default:
                    break;
            }
    }
        
     public void activarMultijugador2(String categorias, JMultijugador jMultijugador) {
                this.resultadosMultijugador = new JResultadosMultijugador();
            this.jMultijugador = jMultijugador;
            correctas = 0; // Reiniciar el contador de respuestas correctas
            jMultijugador.actualizarPuntos(correctas); // Actualizar el contador de puntos en la interfaz
            jMultijugador.setVisible(true);
            jMultijugador.actualizarJugador("Jugador 2");

            switch (categorias) {
                case "Deportes":
                    jMultijugador.setCategoriaText("Deportes");
                    generarPreguntaDeporetsMultijugador(jMultijugador);
                    break;
                case "Videojuegos":
                    jMultijugador.setCategoriaText("Videojuegos");
                    generarPreguntaVideojuegosMultijugador(jMultijugador);
                    break;
                case "Musica":
                    jMultijugador.setCategoriaText("Musica");
                    generarPreguntaMusicaMultijugador(jMultijugador);
                    break;
                default:
                    break;
            }
    }
    


/**
 * Generates a random sports question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */   
public void generarPreguntaDeporets(JsinglePlayer jsinglePlayer) {
    PreguntasDeportes preguntaAleatoria1 = obtenerPreguntaAleatoriaDeportes();
    jsinglePlayer.setPreguntaText(preguntaAleatoria1.getPregunta());
    jsinglePlayer.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jsinglePlayer.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jsinglePlayer.setbtnCText(preguntaAleatoria1.getRespuestaC());

    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jsinglePlayer.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;

        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            Timer pauseTimer = new Timer(2000, (ActionEvent ev) -> {
                evaluarRespuestaYContinuarDeporets(preguntaAleatoria1, jsinglePlayer); // Método para evaluar respuesta y pasar a la siguiente pregunta
                ((Timer)ev.getSource()).stop(); // Detener este temporizador también
            });
            pauseTimer.setRepeats(false); // Asegurarse de que el temporizador de pausa no se repita
            pauseTimer.start();
        }
    });
    countdownTimer.start();
}



/**
 * Metodo encargado de evaluar 
 * @param preguntaAleatoria
 * @param jsinglePlayer 
 */
private void evaluarRespuestaYContinuarDeporets(PreguntasDeportes preguntaAleatoria, JsinglePlayer jsinglePlayer) {
    Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jsinglePlayer.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jsinglePlayer.cambiarColorPanelRespuesta(jsinglePlayer.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jsinglePlayer.restablecerColorPanelRespuesta(jsinglePlayer.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacion(preguntaAleatoria, jsinglePlayer, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

private void continuarEvaluacion(PreguntasDeportes preguntaAleatoria, JsinglePlayer jsinglePlayer, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosDeportes(preguntaAleatoria);
        jsinglePlayer.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
   if (preguntas == 3) {
        jsinglePlayer.setVisible(false);
        mostrarResultados();
    } else {
        generarPreguntaMusica(jsinglePlayer);
    }
}

/**
 * Método para calcular puntos según las estadistica de cada pregunta
 * @param pregunta
 * @return el puntaje que debería de sumar la pregunta en caso de estar corecta
 */
private int calcularPuntosDeportes(PreguntasDeportes pregunta) {
    if (pregunta.getAciertos() + pregunta.getDesaciertos() < 10) {
        return 1;
    } else {
        double porcentajeDesaciertos = (double) pregunta.getDesaciertos() / (pregunta.getAciertos() + pregunta.getDesaciertos());

        if (porcentajeDesaciertos < 0.33) {
            return 1;
        } else if (porcentajeDesaciertos >= 0.33 && porcentajeDesaciertos < 0.66) {
            return 2;
        } else {
            return 3;
        }
    }
}

/**
 * Muestra los resultados del juego en una ventana.
 * Actualiza la ventana de resultados con la cantidad de preguntas acertadas, incorrectas y el puntaje total.
 * Hace visible la ventana de resultados para que el jugador pueda ver sus resultados.
 */
public void mostrarResultados() {
    this.resultados.setPreguntaText(cantidadPreguntasAcertadas, incorrectas, correctas);
    this.resultados.setVisible(true);
}


public void mostrarResultadosMultijugador() {
    this.resultadosMultijugador.setPreguntaText(cantidadPreguntasAcertadas, incorrectas);
    this.resultadosMultijugador.setVisible(true);
}

/**
 * Generates a random music question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */
public void generarPreguntaMusica(JsinglePlayer jsinglePlayer) {
    PreguntasMusica preguntaAleatoria1 = obtenerPreguntaAleatoriaMusica();
    jsinglePlayer.setPreguntaText(preguntaAleatoria1.getPregunta());
    jsinglePlayer.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jsinglePlayer.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jsinglePlayer.setbtnCText(preguntaAleatoria1.getRespuestaC());

    // Nuevo temporizador para la cuenta regresiva
    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jsinglePlayer.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;
        
        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            evaluarRespuestaYContinuarMusica(preguntaAleatoria1, jsinglePlayer); // Método para evaluar respuesta
        }
    });
    countdownTimer.start();
}

/**
 * Evalúa la respuesta dada por el jugador a una pregunta de música y continúa con el juego.
 * Actualiza las estadísticas y el puntaje del jugador según la respuesta dada.
 *
 * @param preguntaAleatoria La pregunta de música que se está evaluando.
 * @param jsinglePlayer    La instancia del jugador en el juego.
 */
private void evaluarRespuestaYContinuarMusica(PreguntasMusica preguntaAleatoria, JsinglePlayer jsinglePlayer) {
    Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jsinglePlayer.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jsinglePlayer.cambiarColorPanelRespuesta(jsinglePlayer.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jsinglePlayer.restablecerColorPanelRespuesta(jsinglePlayer.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacion(preguntaAleatoria, jsinglePlayer, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

    private void continuarEvaluacion(PreguntasMusica preguntaAleatoria, JsinglePlayer jsinglePlayer, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosMusica(preguntaAleatoria);
        jsinglePlayer.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
   if (preguntas == 3) {
        jsinglePlayer.setVisible(false);
        mostrarResultados();
    } else {
        generarPreguntaMusica(jsinglePlayer);
    }
}



/**
 * Método para calcular puntos según las estadistica de cada pregunta
 * @param pregunta
 * @return el puntaje que debería de sumar la pregunta en caso de estar corecta
 */
private int calcularPuntosMusica(PreguntasMusica pregunta) {
    if (pregunta.getAciertos() + pregunta.getDesaciertos() < 10) {
        return 1;
    } else {
        double porcentajeDesaciertos = (double) pregunta.getDesaciertos() / (pregunta.getAciertos() + pregunta.getDesaciertos());

        if (porcentajeDesaciertos < 0.33) {
            return 1;
        } else if (porcentajeDesaciertos >= 0.33 && porcentajeDesaciertos < 0.66) {
            return 2;
        } else {
            return 3;
        }
    }
}











/**
 * Generates a random video games question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */
public void generarPreguntaVideojuegos(JsinglePlayer jsinglePlayer) {
    PreguntasVideojuegos preguntaAleatoria1 = obtenerPreguntaAleatoriaVideojuegos();
    jsinglePlayer.setPreguntaText(preguntaAleatoria1.getPregunta());
    jsinglePlayer.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jsinglePlayer.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jsinglePlayer.setbtnCText(preguntaAleatoria1.getRespuestaC());

    // Nuevo temporizador para la cuenta regresiva
    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jsinglePlayer.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;

        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            evaluarRespuestaYContinuarVideojuegos(preguntaAleatoria1, jsinglePlayer); // Método para evaluar respuesta
        }
    });
    countdownTimer.start();
}

/**
 * Evalúa la respuesta dada por el jugador a una pregunta de videojuegos y continúa con el juego.
 * Actualiza las estadísticas y el puntaje del jugador según la respuesta dada.
 *
 * @param preguntaAleatoria La pregunta de videojuegos que se está evaluando.
 * @param jsinglePlayer    La instancia del jugador en el juego.
 */
private void evaluarRespuestaYContinuarVideojuegos(PreguntasVideojuegos preguntaAleatoria, JsinglePlayer jsinglePlayer) {
    Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jsinglePlayer.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jsinglePlayer.cambiarColorPanelRespuesta(jsinglePlayer.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jsinglePlayer.restablecerColorPanelRespuesta(jsinglePlayer.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacion(preguntaAleatoria, jsinglePlayer, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

private void continuarEvaluacion(PreguntasVideojuegos preguntaAleatoria, JsinglePlayer jsinglePlayer, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosVideoJuegos(preguntaAleatoria);
        jsinglePlayer.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
   if (preguntas == 3) {
        jsinglePlayer.setVisible(false);
        mostrarResultados();
    } else {
        generarPreguntaMusica(jsinglePlayer);
    }
}




/**
 * Método para calcular puntos según las estadistica de cada pregunta
 * @param pregunta
 * @return el puntaje que debería de sumar la pregunta en caso de estar corecta
 */
private int calcularPuntosVideoJuegos(PreguntasVideojuegos pregunta) {
    if (pregunta.getAciertos() + pregunta.getDesaciertos() < 10) {
        return 1;
    } else {
        double porcentajeDesaciertos = (double) pregunta.getDesaciertos() / (pregunta.getAciertos() + pregunta.getDesaciertos());

        if (porcentajeDesaciertos < 0.33) {
            return 1;
        } else if (porcentajeDesaciertos >= 0.33 && porcentajeDesaciertos < 0.66) {
            return 2;
        } else {
            return 3;
        }
    }
}






/**
 * Retrieves a random sports question from the available set of sports questions.
 *
 * @return A randomly selected sports question.
 */
     private PreguntasDeportes obtenerPreguntaAleatoriaDeportes() {
        // Obtener todas las preguntas de deportes
        PreguntasDeportes[] preguntasDeportes = PreguntasDeportes.values();

        // Generar un número aleatorio para seleccionar una pregunta
        Random random = new Random();
        int indicePreguntaAleatoria = random.nextInt(preguntasDeportes.length);

        // Devolver la pregunta aleatoria
        return preguntasDeportes[indicePreguntaAleatoria];
    }   
  
 /**
 * Retrieves a random video games question from the available set of video games questions.
 *
 * @return A randomly selected video games question.
 */   
    private PreguntasVideojuegos obtenerPreguntaAleatoriaVideojuegos() {
        // Obtener todas las preguntas de deportes
        PreguntasVideojuegos[] preguntasVideojuegos = PreguntasVideojuegos.values();

        // Generar un número aleatorio para seleccionar una pregunta
        Random random = new Random();
        int indicePreguntaAleatoria = random.nextInt(preguntasVideojuegos.length);

        // Devolver la pregunta aleatoria
        return preguntasVideojuegos[indicePreguntaAleatoria];
    }
    
/**
 * Retrieves a random music question from the available set of music questions.
 *
 * @return A randomly selected music question.
 */   
    private PreguntasMusica obtenerPreguntaAleatoriaMusica() {
        // Obtener todas las preguntas de deportes
        PreguntasMusica[] preguntasMusica = PreguntasMusica.values();

        // Generar un número aleatorio para seleccionar una pregunta
        Random random = new Random();
        int indicePreguntaAleatoria = random.nextInt(preguntasMusica.length);

        // Devolver la pregunta aleatoria
        return preguntasMusica[indicePreguntaAleatoria];
    }
    
    

    //--------------------------------Metodos del modo multijugador--------------------------------------------------------------------------------------------------------------------------------------------------------
    
    /**
 * Generates a random sports question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */   
public void generarPreguntaDeporetsMultijugador(JMultijugador jMultijugador) {
    PreguntasDeportes preguntaAleatoria1 = obtenerPreguntaAleatoriaDeportes();
    jMultijugador.setPreguntaText(preguntaAleatoria1.getPregunta());
    jMultijugador.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jMultijugador.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jMultijugador.setbtnCText(preguntaAleatoria1.getRespuestaC());

    // Nuevo temporizador para la cuenta regresiva
    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jMultijugador.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;

        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            evaluarRespuestaYContinuarDeporetsMultijugador(preguntaAleatoria1, jMultijugador); // Método para evaluar respuesta
        }
    });
    countdownTimer.start();
}



/**
 * Metodo encargado de evaluar 
 * @param preguntaAleatoria
 * @param jsinglePlayer 
 */
private void evaluarRespuestaYContinuarDeporetsMultijugador(PreguntasDeportes preguntaAleatoria, JMultijugador jMultijugador) {
    Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jMultijugador.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jMultijugador.cambiarColorPanelRespuesta(jMultijugador.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jMultijugador.restablecerColorPanelRespuesta(jMultijugador.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacionMultijugador(preguntaAleatoria, jMultijugador, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

private void continuarEvaluacionMultijugador(PreguntasDeportes preguntaAleatoria, JMultijugador jMultijugador, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosDeportes(preguntaAleatoria);
        jMultijugador.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
    
    if (preguntas == 3) {
        jMultijugador.setVisible(false);
        activarMultijugador2("Deportes", jMultijugador);

            
    } else {
        if (preguntas == 6){
            jMultijugador.setVisible(false);
            mostrarResultadosMultijugador();
        }else{
        generarPreguntaDeporetsMultijugador(jMultijugador);

        }
    }
}


/**
 * Generates a random music question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */
public void generarPreguntaMusicaMultijugador(JMultijugador jMultijugador) {
    PreguntasMusica preguntaAleatoria1 = obtenerPreguntaAleatoriaMusica();
    jMultijugador.setPreguntaText(preguntaAleatoria1.getPregunta());
    jMultijugador.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jMultijugador.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jMultijugador.setbtnCText(preguntaAleatoria1.getRespuestaC());

    // Nuevo temporizador para la cuenta regresiva
    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jMultijugador.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;
        
        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            evaluarRespuestaYContinuarMusicaMultijugador(preguntaAleatoria1, jMultijugador); // Método para evaluar respuesta
        }
    });
    countdownTimer.start();
}

/**
 * Evalúa la respuesta dada por el jugador a una pregunta de música y continúa con el juego.
 * Actualiza las estadísticas y el puntaje del jugador según la respuesta dada.
 *
 * @param preguntaAleatoria La pregunta de música que se está evaluando.
 * @param jsinglePlayer    La instancia del jugador en el juego.
 */
private void evaluarRespuestaYContinuarMusicaMultijugador(PreguntasMusica preguntaAleatoria, JMultijugador jMultijugador) {
   Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jMultijugador.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jMultijugador.cambiarColorPanelRespuesta(jMultijugador.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jMultijugador.restablecerColorPanelRespuesta(jMultijugador.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacionMultijugador(preguntaAleatoria, jMultijugador, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

    private void continuarEvaluacionMultijugador(PreguntasMusica preguntaAleatoria, JMultijugador jMultijugador, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosMusica(preguntaAleatoria);
        jMultijugador.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
    if (preguntas == 3) {
        jMultijugador.setVisible(false);
        activarMultijugador2("Musica", jMultijugador);

       
    } else {
        if (preguntas == 6){
            jMultijugador.setVisible(false);
            mostrarResultadosMultijugador();
        }else{
        generarPreguntaMusicaMultijugador(jMultijugador);

        }
    }
}
    


/**
 * Generates a random video games question for the single-player game and initializes the corresponding UI elements.
 *
 * @param jsinglePlayer The single-player menu to which the question and answers will be applied.
 */
public void generarPreguntaVideojuegosMultijugador(JMultijugador jMultijugador) {
    PreguntasVideojuegos preguntaAleatoria1 = obtenerPreguntaAleatoriaVideojuegos();
    jMultijugador.setPreguntaText(preguntaAleatoria1.getPregunta());
    jMultijugador.setbtnAText(preguntaAleatoria1.getRespuestaA());
    jMultijugador.setbtnBText(preguntaAleatoria1.getRespuestaB());
    jMultijugador.setbtnCText(preguntaAleatoria1.getRespuestaC());

    // Nuevo temporizador para la cuenta regresiva
    final int[] tiempoRestante = {20}; // Tiempo inicial en segundos
    Timer countdownTimer = new Timer(1000, (ActionEvent e) -> {
        jMultijugador.setContadorText(String.valueOf(tiempoRestante[0]));
        tiempoRestante[0]--;

        if (tiempoRestante[0] < 0) {
            ((Timer)e.getSource()).stop(); // Detener el temporizador de cuenta regresiva
            evaluarRespuestaYContinuarVideojuegosMultijugador(preguntaAleatoria1, jMultijugador); // Método para evaluar respuesta
        }
    });
    countdownTimer.start();
}

/**
 * Evalúa la respuesta dada por el jugador a una pregunta de videojuegos y continúa con el juego.
 * Actualiza las estadísticas y el puntaje del jugador según la respuesta dada.
 *
 * @param preguntaAleatoria La pregunta de videojuegos que se está evaluando.
 * @param jsinglePlayer    La instancia del jugador en el juego.
 */
private void evaluarRespuestaYContinuarVideojuegosMultijugador(PreguntasVideojuegos preguntaAleatoria, JMultijugador jMultijugador) {
    Byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
    boolean esRespuestaCorrecta = respuestaCorrecta.equals(jMultijugador.getRespuesta());

    // Cambia el color del panel de la respuesta seleccionada
    jMultijugador.cambiarColorPanelRespuesta(jMultijugador.getRespuesta(), esRespuestaCorrecta);

    // Temporizador de 2 segundos para mostrar el color y luego restablecer y continuar
    new Timer(2000, (ActionEvent ev) -> {
        // Restablece el color del panel a su estado original
        jMultijugador.restablecerColorPanelRespuesta(jMultijugador.getRespuesta());

        // Llama a continuarEvaluacion para manejar la lógica de puntuación y estadísticas
        continuarEvaluacionMultijugador(preguntaAleatoria, jMultijugador, esRespuestaCorrecta);

        ((Timer)ev.getSource()).stop();
    }).start();
}

private void continuarEvaluacionMultijugador(PreguntasVideojuegos preguntaAleatoria, JMultijugador jMultijugador, boolean esRespuestaCorrecta) {
    if (esRespuestaCorrecta) {
        cantidadPreguntasAcertadas++;
        preguntaAleatoria.setAciertos(preguntaAleatoria.getAciertos() + 1);
        correctas = correctas + calcularPuntosVideoJuegos(preguntaAleatoria);
        jMultijugador.actualizarPuntos(correctas);
    } else {
        incorrectas++;
        preguntaAleatoria.setDesaciertos(preguntaAleatoria.getDesaciertos() + 1);
    }

    preguntas++;
    
    if (preguntas == 3) {
        jMultijugador.setVisible(false);
        activarMultijugador2("Videojuegos", jMultijugador);

        
    } else {
        if (preguntas == 6){
            jMultijugador.setVisible(false);
            mostrarResultadosMultijugador();
        }else{
            generarPreguntaVideojuegosMultijugador(jMultijugador);

        }
            
    }
}
    
}
