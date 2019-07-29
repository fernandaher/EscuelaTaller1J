package entidades;

public enum Mensajes {

    MENSAJE_NOTA1("Ingresa tu primera nota: "),
    MENSAJE_NOTA2("Ingresa tu segunda nota: "),
    MENSAJE_NOTA3("Ingresa tu tercera nota: "),
    MENSAJE_PROMEDIO("Tu media final es: "),
    MENSAJE_NOTA_INICIAR("Nuevamente vuelve a iniciar tus estudios y dedícate."),
    MENSAJE_NOTA_NOTICIA("Malas noticias, no cumpliste con el mínimo para avanzar."),
    MENSAJE_NOTA_SUGERENCIA("Te sugerimos comprometerte más con tu estudio."),
    MENSAJE_NOTA_ACEPTABLE("Tu rendimiento es aceptable, pero finalizaste bien."),
    MENSAJE_NOTA_EXCELENTE("Excelente, tu rendimiento ha sido el mejor.");

    private String mensaje;

    Mensajes (String m) {this.mensaje = m; }


public String getMensaje(){ return mensaje; }

}


