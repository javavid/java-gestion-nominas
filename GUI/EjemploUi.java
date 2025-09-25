package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploUi {
    
    public static void main(String[] args) {
        

        JFrame ventana = new JFrame("Mi primera ventana en JFrame");
        ventana.setSize(500, 500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLayout(null);

        JButton boton = new JButton("Pulsa");

        ventana.add(boton);

        boton.setBounds(100, 200, 200, 40);
    }
}
