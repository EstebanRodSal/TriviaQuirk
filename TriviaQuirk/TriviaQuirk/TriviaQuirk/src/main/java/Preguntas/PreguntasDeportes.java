package Preguntas;

public enum PreguntasDeportes {
    PREGUNTA_1("¿Quién ganó la Copa del Mundo de Fútbol en 2018?", "1) Brasil", "2) Francia", "3) Argentina", (byte)2),
    PREGUNTA_2("¿Cuál es el deporte más popular en Estados Unidos?", "1) Béisbol", "2) Fútbol", "3) Baloncesto", (byte)3),
    PREGUNTA_3("¿En qué país se originó el deporte del cricket?", "1) India", "2) Australia", "3) Sudáfrica", (byte)2),
    PREGUNTA_4("¿Cuál es el equipo más exitoso en la historia de la NBA?", "1) Los Angeles Lakers", "2) Boston Celtics", "3) Golden State Warriors", (byte)2),
    PREGUNTA_5("¿Quién es considerado el mejor jugador de tenis de todos los tiempos?", "1) Rafael Nadal", "2) Novak Djokovic", "3) Roger Federer", (byte)3),
    PREGUNTA_6("¿En qué deporte se compite en el Super Bowl?", "1) Fútbol americano", "2) Béisbol", "3) Baloncesto", (byte)1),
    PREGUNTA_7("¿Cuál es el evento deportivo más grande del mundo?", "1) Copa del Mundo de la FIFA", "2) Juegos Olímpicos", "3) Wimbledon", (byte)2),
    PREGUNTA_8("¿En qué deporte se utiliza una pista de hielo?", "1) Patinaje artístico", "2) Snowboarding", "3) Hockey sobre hielo", (byte)3),
    PREGUNTA_9("¿Quién es el máximo goleador en la historia de la Liga de Campeones de la UEFA?", "1) Cristiano Ronaldo", "2) Lionel Messi", "3) Robert Lewandowski", (byte)1),
    PREGUNTA_10("¿Cuál es el deporte que se juega en un campo con un palo y una pelota?", "1) Golf", "2) Rugby", "3) Cricket", (byte)1),
    PREGUNTA_11("¿En qué deporte se utiliza una raqueta?", "1) Vóley", "2) Tenis", "3) Boxeo", (byte)2),
    PREGUNTA_12("¿Cuál es el deporte en el que se compite en la Serie Mundial?", "1) Béisbol", "2) Fútbol americano", "3) Tenis", (byte)1),
    PREGUNTA_13("¿Quién es el campeón reinante de la Fórmula 1?", "1) Sebastian Vettel", "2) Lewis Hamilton", "3) Max Verstappen", (byte)2),
    PREGUNTA_14("¿Cuál es el deporte en el que se compite en el Torneo de Wimbledon?", "1) Tenis", "2) Golf", "3) Natación", (byte)1),
    PREGUNTA_15("¿Cuál es el deporte en el que se compite en los Juegos Olímpicos de Invierno?", "1) Atletismo", "2) Esquí", "3) Ciclismo", (byte)2),
    PREGUNTA_16("¿Cuál es el deporte en el que se utiliza una tabla para deslizarse sobre las olas?", "1) Surf", "2) Buceo", "3) Vela", (byte)1),
    PREGUNTA_17("¿En qué deporte se compite en el Masters de Augusta?", "1) Golf", "2) Tenis", "3) Ciclismo", (byte)1),
    PREGUNTA_18("¿Cuál es el deporte en el que se compite en el Campeonato Mundial de Rally?", "1) Fórmula 1", "2) Motocross", "3) Rally", (byte)3),
    PREGUNTA_19("¿Quién es el boxeador más famoso de todos los tiempos?", "1) Mike Tyson", "2) Muhammad Ali", "3) Floyd Mayweather", (byte)2),
    PREGUNTA_20("¿En qué deporte se compite en la Copa Davis?", "1) Tenis", "2) Golf", "3) Ciclismo", (byte)1),
    PREGUNTA_21("¿Cuál es el deporte en el que se compite en la Liga de Campeones de la CONCACAF?", "1) Fútbol", "2) Béisbol", "3) Fútbol americano", (byte)1),
    PREGUNTA_22("¿Cuál es el deporte en el que se compite en el Campeonato Mundial de Natación?", "1) Fórmula 1", "2) Atletismo", "3) Natación", (byte)3),
    PREGUNTA_23("¿En qué deporte se utiliza una pista de atletismo?", "1) Fútbol", "2) Atletismo", "3) Ciclismo", (byte)2),
    PREGUNTA_24("¿Cuál es el deporte en el que se compite en el Abierto de Australia?", "1) Tenis", "2) Golf", "3) Fútbol", (byte)1),
    PREGUNTA_25("¿Quién es el máximo goleador en la historia de la Premier League?", "1) Thierry Henry", "2) Alan Shearer", "3) Cristiano Ronaldo", (byte)3),
    PREGUNTA_26("¿Cuál es el deporte en el que se compite en el Tour de Francia?", "1) Atletismo", "2) Ciclismo", "3) Tenis", (byte)2),
    PREGUNTA_27("¿Quién es considerado el mejor jugador de baloncesto de todos los tiempos?", "1) Magic Johnson", "2) LeBron James", "3) Michael Jordan", (byte)3),
    PREGUNTA_28("¿En qué deporte se compite en la Copa América?", "1) Fútbol", "2) Rugby", "3) Golf", (byte)1),
    PREGUNTA_29("¿Cuál es el deporte en el que se compite en el Campeonato Mundial de Esgrima?", "1) Esgrima", "2) Tiro con arco", "3) Lucha libre", (byte)1),
    PREGUNTA_30("¿Quién es el campeón reinante de la UFC en la categoría de peso pesado?", "1) Jon Jones", "2) Khabib Nurmagomedov", "3) Francis Ngannou", (byte)3);

    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;
    
    /**
     * Variable encargada de contabilizar todos los aciertos
     */
    private int aciertos = 0;
    
     /**
     * Variable encargada de contabilizar todos los desaciertos
     */
    private int desaciertos = 0;

    /**
     * Constructor para crear una pregunta de deportes con 3 opciones de respuesta.
     *
     * @param pregunta          La pregunta en sí.
     * @param respuestaA        La primera opción de respuesta.
     * @param respuestaB        La segunda opción de respuesta.
     * @param respuestaC        La tercera opción de respuesta.
     * @param respuestaCorrecta El número que representa la opción de respuesta correcta (1, 2 o 3).
     * @param respuestaCorrecta Cantidad de aciertos por pregunta
     * @param respuestaCorrecta Cantidad de desaciertos por pregunta
     */
 PreguntasDeportes(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaCorrecta = respuestaCorrecta;
        this.aciertos = 0;
        this.desaciertos = 0;
    }

    /**
     * Obtiene la pregunta.
     *
     * @return La pregunta.
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Obtiene la primera opción de respuesta.
     *
     * @return La primera opción de respuesta.
     */
    public String getRespuestaA() {
        return respuestaA;
    }

    /**
     * Obtiene la segunda opción de respuesta.
     *
     * @return La segunda opción de respuesta.
     */
    public String getRespuestaB() {
        return respuestaB;
    }

    /**
     * Obtiene la tercera opción de respuesta.
     *
     * @return La tercera opción de respuesta.
     */
    public String getRespuestaC() {
        return respuestaC;
    }

    /**
     * Obtiene el número que representa la opción de respuesta correcta (1, 2 o 3).
     *
     * @return El número que representa la opción de respuesta correcta.
     */
    public byte getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    
   /**
    * Obtiene la cantidad de aciertos
    * @return cantidad de aciertos
    */
    public int getAciertos() {
        return aciertos;
    }

    
    /**
     * Obtiene la cantidad de desaciertos
     * @return cantidad de desaciertos
     */
    public int getDesaciertos() {
        return desaciertos;
    }
    
       /**
    * Establece la cantidad de aciertos
    * @param aciertos cantidad de aciertos
    */
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    
    /**
     * Establece la cantidad de desaciertos
     * @param desaciertos cantidad de desaciertos
     */
    public void setDesaciertos(int desaciertos) {
        this.desaciertos = desaciertos;
    }
    

}