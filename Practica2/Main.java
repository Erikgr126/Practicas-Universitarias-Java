import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{

public JLabel etq1;
public JLabel etq2;
public JLabel etq3;
public JButton boton1;
public JButton boton2;
public JTextField texto;
public JTextField camp1;
public JTextField camp2;
public JTextField camp3;

public Main(){

setLayout(null);
setTitle("Ventana de comandos");
 setDefaultCloseOperation(EXIT_ON_CLOSE);

etq1 = new JLabel("Nombre:");
etq1.setBounds(10,50,150,25);
add(etq1);

etq2 = new JLabel("Numero telefonico:");
etq2.setBounds(10,100,150,25);
add(etq2);

etq3 = new JLabel("Correo:");
etq3.setBounds(10,150,150,25);
add(etq3);

camp1 = new JTextField();
camp1.setBounds(150,50,150,20);
add(camp1);

camp2 = new JTextField();
camp2.setBounds(150,100,150,20);
add(camp2);

camp3 = new JTextField();
camp3.setBounds(150,150,300,20);
add(camp3);

boton1 = new JButton("Cerrar");
boton1.setBounds(200,200,100,15);
add(boton1);

boton2 = new JButton("Actualizar");
boton2.setBounds(200,300,100,15);
add(boton2);

boton1.addActionListener(this);
boton2.addActionListener(this);

}

public void actionPerformed(ActionEvent accion)
    {
        if (accion.getSource() == boton1) {
           System.exit(0); 
        }
        if (accion.getSource() == boton2) {
            etq1.setText(camp1.getText());
            etq2.setText(camp2.getText());
            etq3.setText(camp3.getText());
        }
    }
public static void main (String args[] ) {
        Main Pagina1 = new Main();
        Pagina1.setBounds(500,500,700,700);
        Pagina1.setVisible(true);
    }
}