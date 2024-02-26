import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class whopper extends JFrame implements ItemListener , ActionListener{

public JLabel Pantalon;
public JLabel Camisa;
public JLabel Calceta;
public JLabel Genero;
public JLabel Edad;
public JComboBox <String> Pcolor;
public JComboBox <String> Ptalla;
public JComboBox <String> Pcorte;
public JComboBox <String> Ccolor;
public JComboBox <String> Cmanga;
public JComboBox <String> CCalceta;
public JComboBox <String> GGenero;
public JComboBox <String> EEdad;
public JTextArea areadetexo;
public String Inf;
public JButton confirmacion;


public whopper(){


setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().setBackground(new Color(100,180,150));
setTitle("Combo whopper");

Pantalon = new JLabel("Pantalon");
Pantalon.setBounds(10,10,80,20);
Pantalon.setForeground(Color.BLACK);
add(Pantalon);

Camisa = new JLabel("Camisa");
Camisa.setBounds(10,40,80,20);
Camisa.setForeground(Color.BLACK);
add(Camisa);

Calceta = new JLabel("Calceta");
Calceta.setBounds(10,70,80,20);
Calceta.setForeground(Color.BLACK);
add(Calceta);

Genero = new JLabel("Genero");
Genero.setBounds(10,100,80,20);
Genero.setForeground(Color.BLACK);
add(Genero);

Edad = new JLabel("Edad");
Edad.setBounds(10,130,50,20);
Edad.setForeground(Color.BLACK);
add(Edad);

Pcolor = new JComboBox();
Pcolor.setBounds(100,10,80,20);
add(Pcolor);
Pcolor.setForeground(Color.BLACK);

Pcolor.addItem("Negro");
Pcolor.addItem("Azul");
Pcolor.addItem("Blanco");
Pcolor.addItem("Gris");
Pcolor.addItem("Caqui");

Ptalla= new JComboBox();
Ptalla.setBounds(200,10,80,20);
add(Ptalla);
Ptalla.setForeground(Color.BLACK);

Ptalla.addItem("CH");
Ptalla.addItem("M");
Ptalla.addItem("X");
Ptalla.addItem("XL");
Ptalla.addItem("XX");
Ptalla.addItem("XXL");

Pcorte = new JComboBox();
Pcorte.setBounds(300,10,80,20);
add(Pcorte);
Pcorte.setForeground(Color.BLACK);

Pcorte.addItem("Amplio");
Pcorte.addItem("Recto");
Pcorte.addItem("Slim");
Pcorte.addItem("Slim Fit");
Pcorte.addItem("Skinny");

Ccolor = new JComboBox();
Ccolor.setBounds(100,40,80,20);
add(Ccolor);
Ccolor.setForeground(Color.BLACK);

Ccolor.addItem("Negro");
Ccolor.addItem("Azul");
Ccolor.addItem("Blanco");
Ccolor.addItem("Gris");
Ccolor.addItem("Caqui");

Cmanga = new JComboBox();
Cmanga.setBounds(200,40,80,20);
add(Cmanga);
Cmanga.setForeground(Color.BLACK);

Cmanga.addItem("Larga");
Cmanga.addItem("Corta");
Cmanga.addItem("Nada");


CCalceta = new JComboBox();
CCalceta.setBounds(100,70,80,20);
add(CCalceta);
CCalceta.setForeground(Color.BLACK);

CCalceta.addItem("Dama");
CCalceta.addItem("Caballero");
CCalceta.addItem("Otros");


GGenero = new JComboBox();
GGenero.setBounds(100,100,80,20);
add(GGenero);
GGenero.setForeground(Color.BLACK);

GGenero.addItem("Dama");
GGenero.addItem("Caballero");
GGenero.addItem("Otros");

EEdad = new JComboBox();
EEdad.setBounds(100,130,80,20);
add(EEdad);
EEdad.setForeground(Color.BLACK);

EEdad.addItem("<5");
EEdad.addItem("6-10");
EEdad.addItem("11-20");
EEdad.addItem("21-30");
EEdad.addItem(">30");

confirmacion = new JButton("Confirmar");
confirmacion.setBounds(100,170,200,20);
add(confirmacion);

areadetexo = new JTextArea("");
areadetexo.setBounds(30,200,400,400);
areadetexo.setEditable(false);
add(areadetexo);

confirmacion.addActionListener(this);
Pcolor.addItemListener(this);
Ptalla.addItemListener(this);
Pcorte.addItemListener(this);
Ccolor.addItemListener(this);
Cmanga.addItemListener(this);
CCalceta.addItemListener(this);
GGenero.addItemListener(this);
EEdad.addItemListener(this);
}

public void itemStateChanged(ItemEvent accion){

}

public void actionPerformed(ActionEvent accion){

if(accion.getSource() == confirmacion){

Inf = "Pantalon: \n" + Pcolor.getSelectedItem().toString() + "\n" + Ptalla.getSelectedItem().toString() + "\n" + Pcorte.getSelectedItem().toString() + "\n" + "Camisa: \n" + Ccolor.getSelectedItem().toString() + "\n" + Cmanga.getSelectedItem().toString() + "\n" + "Calceta: \n" + CCalceta.getSelectedItem().toString() + "\n" + "Genero: \n" + GGenero.getSelectedItem().toString() + "\n" + 
"Edad: \n" + EEdad.getSelectedItem().toString();

areadetexo.setText(Inf);

}
}

public static void main(String args[]){
        
whopper combowhopperJr = new whopper();
combowhopperJr.setBounds(0, 100, 500, 700);
combowhopperJr.setVisible(true);
combowhopperJr.setResizable(false);
        
}
}