import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, FocusListener{

public JLabel etq1;
public JLabel etq2;
public JLabel etq3;
public JButton boton1;
public JButton boton2;
public JTextField texto;
public JTextField camp1;
public JTextField camp2;
public JTextField camp3;
public int cent=1;

public Main(){

setLayout(null);
setTitle("Ventana de comandos");
 setDefaultCloseOperation(EXIT_ON_CLOSE);

etq1 = new JLabel("Nombre:");
etq1.setBounds(10,50,150,20);
add(etq1);

etq2 = new JLabel("Numero telefonico:");
etq2.setBounds(10,100,150,20);
add(etq2);

etq3 = new JLabel("Correo:");
etq3.setBounds(10,150,150,20);
add(etq3);

camp1 = new JTextField();
camp1.setBounds(150,50,150,20);
add(camp1);
camp1.addFocusListener(this);

camp2 = new JTextField();
camp2.setBounds(150,100,150,20);
add(camp2);

camp3 = new JTextField();
camp3.setBounds(150,150,300,30);
add(camp3);

boton1 = new JButton("Cerrar");
boton1.setBounds(200,200,100,20);
add(boton1);

boton2 = new JButton("Actualizar");
boton2.setBounds(200,300,100,20);
add(boton2);

boton1.addActionListener(this);
boton2.addActionListener(this);

}

    public void focusGained(FocusEvent e){



    }

    public void focusLost(FocusEvent e){

        String Ncadena = camp1.getText();
        int LongitudNcadena= Ncadena.length(),cent=1;

        for(int i=0; i< LongitudNcadena;i++){
            char caracter = Ncadena.charAt(i);
            int CodigoCaracter= (int)caracter;
            if(CodigoCaracter >= 33 && CodigoCaracter <= 64 ){
                cent=0;
            }
            if(CodigoCaracter >= 91 && CodigoCaracter <= 96){
                cent=0;
            }
            if(CodigoCaracter >= 123){
                cent=0;
            }
        }
        if(cent==1){
            etq1.setText(Ncadena);
        }
        else{
            JOptionPane.showMessageDialog(null,"*Favor de usar caracteres alfabeticos*");
        }


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
        Pagina1.setBounds(500,500,500,400);
        Pagina1.setVisible(true);
    }
}