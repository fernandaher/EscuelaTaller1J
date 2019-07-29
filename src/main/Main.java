package main;

import static entidades.Mensajes.*;
import entidades.alumnos.Notas;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){
        DecimalFormat formateador = new DecimalFormat( "###,###.##");

        Notas notas = new Notas();

        String not1 = JOptionPane.showInputDialog(null, MENSAJE_NOTA1.getMensaje());
        String not2 = JOptionPane.showInputDialog(null, MENSAJE_NOTA2.getMensaje());
        String not3 = JOptionPane.showInputDialog(null, MENSAJE_NOTA3.getMensaje());
        String total = JOptionPane.showInputDialog(null, MENSAJE_PROMEDIO.getMensaje());

        notas.setNota1(Double.parseDouble(not1));
        notas.setNota2(Double.parseDouble(not2));
        notas.setNota3(Double.parseDouble(not3));
        double tot =Double.parseDouble(total);

        if(tot <= 0.0&& tot <=0.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA_INICIAR.getMensaje());
        }
        if(tot >= 1.0&& tot <=1.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA_NOTICIA.getMensaje());
        }
        if(tot >= 2.0&& tot <=2.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA_SUGERENCIA.getMensaje());
        }
        if(tot >= 3.0&& tot <=3.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA_ACEPTABLE.getMensaje());
        }
        if(tot >= 4.0&& tot <=5.0){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA_EXCELENTE.getMensaje());
        }
        JOptionPane.showMessageDialog(null, MENSAJE_PROMEDIO.getMensaje() + formateador.format(notas.total()));

        }


    }


