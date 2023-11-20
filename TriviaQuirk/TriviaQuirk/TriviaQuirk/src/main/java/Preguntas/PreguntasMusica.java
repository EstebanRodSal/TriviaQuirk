package Preguntas;

public enum PreguntasMusica {
    PREGUNTA_1("¿Quién es conocido como el 'Rey del Pop'?", "1) Elvis Presley", "2) Michael Jackson", "3) Prince", (byte)2),
    PREGUNTA_2("¿Qué banda de rock británica lanzó el álbum 'The Dark Side of the Moon'?", "1) The Who", "2) The Rolling Stones", "3) Pink Floyd", (byte)3),
    PREGUNTA_3("¿Quién es la artista femenina con más ventas de discos en la historia de la música?", "1) Beyoncé", "2) Whitney Houston", "3) Mariah Carey", (byte)3),
    PREGUNTA_4("¿Qué género musical se originó en Jamaica y se caracteriza por un ritmo distintivo y letras sociales y políticas?", "1) Ska", "2) Reggae", "3) Calypso", (byte)2),
    PREGUNTA_5("¿Cuál de las siguientes canciones de los Beatles fue lanzada primero?", "1) Hey Jude", "2) Let It Be", "3) Love Me Do", (byte)3),
    PREGUNTA_6("¿Qué banda sueca es famosa por éxitos como 'Dancing Queen' y 'Mamma Mia'?", "1) ABBA", "2) Ace of Base", "3) Roxette", (byte)1),
    PREGUNTA_7("¿Quién es el cantante y compositor de 'Purple Haze' y 'Voodoo Child (Slight Return)'?", "1) Eric Clapton", "2) Jimi Hendrix", "3) Jeff Beck", (byte)2),
    PREGUNTA_8("¿Qué género musical es conocido por sus raíces en Nueva Orleans y se caracteriza por el uso de instrumentos de viento y una sección rítmica sólida?", "1) Jazz", "2) Blues", "3) Hip-hop", (byte)1),
    PREGUNTA_9("¿Qué banda británica es famosa por su álbum 'The Wall'?", "1) The Rolling Stones", "2) Pink Floyd", "3) The Who", (byte)2),
    PREGUNTA_10("¿Cuál de las siguientes canciones de Queen es conocida por su icónico solo de guitarra de Brian May?", "1) Bohemian Rhapsody", "2) We Will Rock You", "3) Another One Bites the Dust", (byte)1),
    PREGUNTA_11("¿Quién es la legendaria cantante de soul conocida como la 'Reina del Soul'?", "1) Tina Turner", "2) Whitney Houston", "3) Aretha Franklin", (byte)3),
    PREGUNTA_12("¿Cuál de las siguientes bandas de rock es conocida por su álbum 'Back in Black'?", "1) AC/DC", "2) Led Zeppelin", "3) The Rolling Stones", (byte)1),
    PREGUNTA_13("¿Qué género musical se originó en la región del delta del Misisipi y es conocido por sus raíces en la música africana y la esclavitud?", "1) Country", "2) Blues", "3) Hip-hop", (byte)2),
    PREGUNTA_14("¿Cuál es la banda de rock liderada por Bono y conocida por éxitos como 'With or Without You' y 'Sunday Bloody Sunday'?", "1) Coldplay", "2) U2", "3) The Police", (byte)2),
    PREGUNTA_15("¿Cuál de los siguientes artistas es conocido como el 'Rey del Rock and Roll'?", "1) Buddy Holly", "2) Chuck Berry", "3) Elvis Presley", (byte)3),
    PREGUNTA_16("¿Qué banda de rock británica es conocida por su álbum 'The Queen Is Dead'?", "1) The Clash", "2) The Smiths", "3) The Cure", (byte)2),
    PREGUNTA_17("¿Quién es la artista pop conocida por éxitos como 'Like a Virgin' y 'Vogue'?", "1) Britney Spears", "2) Lady Gaga", "3) Katy Perry", (byte)3),
    PREGUNTA_18("¿Cuál de las siguientes canciones de Bob Marley es un himno del reggae y la paz mundial?", "1) One Love", "2) No Woman, No Cry", "3) Redemption Song", (byte)1),
    PREGUNTA_19("¿Qué género musical se originó en la ciudad de Nueva York y es conocido por su énfasis en el ritmo y el canto improvisado?", "1) Jazz", "2) Blues", "3) Hip-hop", (byte)3),
    PREGUNTA_20("¿Cuál de los siguientes artistas es conocido por su álbum 'Thriller' y el éxito 'Billie Jean'?", "1) Prince", "2) Stevie Wonder", "3) Michael Jackson", (byte)3),
    PREGUNTA_21("¿Qué banda de rock británica es conocida por su álbum 'Abbey Road'?", "1) The Who", "2) The Rolling Stones", "3) The Beatles", (byte)3),
    PREGUNTA_22("¿Quién es el icónico guitarrista de la banda Queen?", "1) Roger Taylor", "2) Brian May", "3) Freddie Mercury", (byte)2),
    PREGUNTA_23("¿Qué género musical se caracteriza por su origen en la música folklórica de Estados Unidos y su énfasis en la narración de historias?", "1) Jazz", "2) Country", "3) Hip-hop", (byte)3),
    PREGUNTA_24("¿Quién es el legendario cantante de rock conocido como 'El Bardo de Liverpool'?", "1) Mick Jagger", "2) John Lennon", "3) Jim Morrison", (byte)2),
    PREGUNTA_25("¿Cuál de las siguientes bandas de rock es conocida por su álbum 'Led Zeppelin IV' y la canción 'Stairway to Heaven'?", "1) The Who", "2) Pink Floyd", "3) Led Zeppelin", (byte)3),
    PREGUNTA_26("¿Quién es la legendaria cantante de jazz conocida como 'Lady Day'?", "1) Ella Fitzgerald", "2) Billie Holiday", "3) Sarah Vaughan", (byte)2),
    PREGUNTA_27("¿Cuál de los siguientes artistas es conocido por su álbum 'Hunky Dory' y la canción 'Space Oddity'?", "1) David Bowie", "2) Elton John", "3) Mick Jagger", (byte)1),
    PREGUNTA_28("¿Qué género musical se caracteriza por su origen en el Caribe y su influencia en la música latina y el hip-hop?", "1) Jazz", "2) Reggae", "3) Salsa", (byte)2),
    PREGUNTA_29("¿Quién es la artista conocida como la 'Reina del Tejano' y famosa por su éxito 'Como la Flor'?", "1) Jennifer Lopez", "2) Selena Quintanilla", "3) Gloria Estefan", (byte)2),
    PREGUNTA_30("¿Cuál de las siguientes bandas de rock es conocida por su álbum 'The Joshua Tree'?", "1) Coldplay", "2) Radiohead", "3) U2", (byte)3);

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
     * Constructor para crear una pregunta de música con 3 opciones de respuesta.
     *
     * @param pregunta          La pregunta en sí.
     * @param respuestaA        La primera opción de respuesta.
     * @param respuestaB        La segunda opción de respuesta.
     * @param respuestaC        La tercera opción de respuesta.
     * @param respuestaCorrecta El número que representa la opción de respuesta correcta (1, 2 o 3).
     * @param respuestaCorrecta Cantidad de aciertos por pregunta
     * @param respuestaCorrecta Cantidad de desaciertos por pregunta
     */
    PreguntasMusica(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaCorrecta = respuestaCorrecta;
        this.aciertos = 0;
        this.desaciertos = 30;
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
