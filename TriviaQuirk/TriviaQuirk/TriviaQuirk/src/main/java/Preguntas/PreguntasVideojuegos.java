package Preguntas;

public enum PreguntasVideojuegos {
    PREGUNTA_1("¿En qué año se lanzó el juego 'Super Mario Bros.' de Nintendo?", "1) 1985", "2) 1987", "3) 1990", (byte)1),
    PREGUNTA_2("¿Cuál es el personaje principal en la serie de videojuegos 'The Legend of Zelda'?", "1) Link", "2) Mario", "3) Sonic", (byte)1),
    PREGUNTA_3("¿Cuál es el juego más vendido de todos los tiempos?", "1) Minecraft", "2) Grand Theft Auto V", "3) Tetris", (byte)3),
    PREGUNTA_4("¿Cuál es la consola de videojuegos más vendida de la historia?", "1) PlayStation 2", "2) Xbox 360", "3) Wii", (byte)1),
    PREGUNTA_5("¿Quién es el creador de la serie de videojuegos 'Metal Gear Solid'?", "1) Shigeru Miyamoto", "2) Hideo Kojima", "3) Todd Howard", (byte)2),
    PREGUNTA_6("¿Cuál es el nombre del fontanero de gorra roja que protagoniza la serie de videojuegos 'Super Mario'?", "1) Luigi", "2) Wario", "3) Mario", (byte)3),
    PREGUNTA_7("¿En qué año se lanzó el primer juego de 'The Elder Scrolls'?", "1) 1994", "2) 2011", "3) 2015", (byte)1),
    PREGUNTA_8("¿Cuál es el nombre del planeta natal de Master Chief en la serie 'Halo'?", "1) Reach", "2) Earth", "3) Installation 04", (byte)2),
    PREGUNTA_9("¿Cuál es el juego de rol en línea masivo (MMORPG) más popular?", "1) World of Warcraft", "2) Final Fantasy XIV", "3) Guild Wars 2", (byte)1),
    PREGUNTA_10("¿Cuál es el juego de puzles donde el objetivo es emparejar tres o más gemas del mismo color?", "1) Bejeweled", "2) Candy Crush Saga", "3) Tetris", (byte)1),
    PREGUNTA_11("¿En qué juego de disparos en primera persona (FPS) se utiliza la BFG 9000?", "1) Call of Duty", "2) Doom", "3) Battlefield", (byte)2),
    PREGUNTA_12("¿Cuál es el nombre del mundo virtual en línea donde los jugadores pueden crear y explorar mundos?", "1) Second Life", "2) World of Warcraft", "3) Minecraft", (byte)1),
    PREGUNTA_13("¿Cuál es el enemigo principal en 'Pac-Man'?", "1) Fantasmas", "2) Monstruos", "3) Aliens", (byte)1),
    PREGUNTA_14("¿En qué juego de disparos en primera persona (FPS) se utilizan los Gravity Gun y el HEV Suit?", "1) Half-Life 2", "2) Bioshock", "3) Crysis", (byte)1),
    PREGUNTA_15("¿Cuál es el nombre del planeta donde se desarrolla la mayor parte de la trilogía 'Mass Effect'?", "1) Hoth", "2) Alderaan", "3) El Citadel", (byte)3),
    PREGUNTA_16("¿Cuál es el juego de rol en línea masivo (MMORPG) que se desarrolla en el mundo de Tyria?", "1) World of Warcraft", "2) Final Fantasy XIV", "3) Guild Wars 2", (byte)3),
    PREGUNTA_17("¿Quién es el fontanero verde que es el hermano de Mario en la serie 'Super Mario'?", "1) Luigi", "2) Wario", "3) Bowser", (byte)1),
    PREGUNTA_18("¿En qué juego de estrategia en tiempo real (RTS) se utilizan los Zerg, Terran y Protoss?", "1) Warcraft III", "2) StarCraft", "3) Age of Empires", (byte)2),
    PREGUNTA_19("¿Cuál es el nombre del científico loco en 'Half-Life' que desencadena la invasión alienígena?", "1) Dr. Wily", "2) Dr. Kleiner", "3) Dr. Breen", (byte)3),
    PREGUNTA_20("¿En qué juego de aventuras el protagonista lleva una máscara de Majora?", "1) The Legend of Zelda: Ocarina of Time", "2) Majora's Mask", "3) Skyward Sword", (byte)2),
    PREGUNTA_21("¿Cuál es el nombre del protagonista en la serie de videojuegos 'Assassin's Creed'?", "1) Altair", "2) Ezio Auditore", "3) Desmond Miles", (byte)3),
    PREGUNTA_22("¿En qué juego de rol en línea masivo (MMORPG) los jugadores luchan contra dragones?", "1) World of Warcraft", "2) Final Fantasy XIV", "3) Guild Wars 2", (byte)2),
    PREGUNTA_23("¿Cuál es el nombre del mundo de fantasía en el que se desarrolla la serie de videojuegos 'The Witcher'?", "1) Westeros", "2) Tamriel", "3) Continent", (byte)3),
    PREGUNTA_24("¿En qué juego de disparos en primera persona (FPS) se utiliza el arma llamada 'Portal Gun'?", "1) Half-Life 2", "2) Bioshock", "3) Call of Duty", (byte)1),
    PREGUNTA_25("¿Cuál es el juego de construcción y supervivencia en un mundo abierto donde los jugadores pueden crear estructuras con bloques?", "1) Terraria", "2) Minecraft", "3) Stardew Valley", (byte)2),
    PREGUNTA_26("¿Quién es el fontanero verde que es el hermano de Mario en la serie 'Super Mario'?", "1) Luigi", "2) Wario", "3) Bowser", (byte)1),
    PREGUNTA_27("¿En qué juego de rol en línea masivo (MMORPG) los jugadores exploran el mundo de Tamriel?", "1) World of Warcraft", "2) Final Fantasy XIV", "3) Guild Wars 2", (byte)3),
    PREGUNTA_28("¿Cuál es el nombre del personaje principal en la serie de videojuegos 'Sonic the Hedgehog'?", "1) Tails", "2) Amy", "3) Sonic", (byte)3),
    PREGUNTA_29("¿En qué juego de disparos en primera persona (FPS) se utilizan las Espadas de Energía?", "1) Destiny", "2) Halo", "3) Overwatch", (byte)2),
    PREGUNTA_30("¿Cuál es el juego de rol en línea masivo (MMORPG) donde los jugadores exploran el mundo de Azeroth?", "1) World of Warcraft", "2) Final Fantasy XIV", "3) Guild Wars 2", (byte)1);

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
     * Constructor para crear una pregunta de videojuegos con 3 opciones de respuesta.
     *
     * @param pregunta          La pregunta en sí.
     * @param respuestaA        La primera opción de respuesta.
     * @param respuestaB        La segunda opción de respuesta.
     * @param respuestaC        La tercera opción de respuesta.
     * @param respuestaCorrecta El número que representa la opción de respuesta correcta (1, 2 o 3).
      * @param respuestaCorrecta Cantidad de aciertos por pregunta
     * @param respuestaCorrecta Cantidad de desaciertos por pregunta
     */
    PreguntasVideojuegos(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
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