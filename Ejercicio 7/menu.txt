import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class menu extends JFrame implements ActionListener{

public JMenuBar menus;
public JMenu menu1,submenu1,menu2,menu3;
public JMenuItem Rbaja,Ralta;
public JMenuItem Rojo,Azul,Verde;
public JMenuItem Title1,Title2;
public JMenuItem VentanaPre,ProgramaX;

String NombrePestana,Ventanapre;
int opc,x;

public menu(){

setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Programa MENU");
getContentPane().setBackground(new Color(100,100,100));

menus = new JMenuBar();
setJMenuBar(menus);

menu1 = new JMenu("Menu 1");
menu2 = new JMenu("Menu 2");
menu3 = new JMenu("Menu 3");
submenu1 = new JMenu("Sub-menu");

menus.add(menu1);
menus.add(menu2);
menus.add(menu3);

Rbaja = new JMenuItem("240 x 480");
Ralta = new JMenuItem("640 x 720");

Rbaja.addActionListener(this);
Ralta.addActionListener(this);

menu1.add(Rbaja);
menu1.add(Ralta);
menu1.add(submenu1);
	
	Rojo = new JMenuItem("Rojo");
	Azul = new JMenuItem("Azul");
	Verde  = new JMenuItem("Verde");
	
	Rojo.addActionListener(this);
	Azul.addActionListener(this);
	Verde.addActionListener(this);
	
	submenu1.add(Rojo);
	submenu1.add(Azul);
	submenu1.add(Verde);

Title1 = new JMenuItem("Titulo original");
Title2 = new JMenuItem("Titulo nuevo");

Title1.addActionListener(this);
Title2.addActionListener(this);

menu2.add(Title1);
menu2.add(Title2);

VentanaPre = new JMenuItem("Ventana predisenada");
ProgramaX = new JMenuItem("Combo whopper");

VentanaPre.addActionListener(this);
ProgramaX.addActionListener(this);

menu3.add(VentanaPre);
menu3.add(ProgramaX);
}


public void actionPerformed(ActionEvent accion){

if(accion.getSource() == Rbaja){
setSize(240,480);
}
if(accion.getSource() == Ralta){
setSize(640,720);
}
if(accion.getSource() == Rojo){
getContentPane().setBackground(new Color(255,0,0));
}
if(accion.getSource() == Azul){
getContentPane().setBackground(new Color(0,0,255));
}
if(accion.getSource() == Verde){
getContentPane().setBackground(new Color(0,255,0));
}
if(accion.getSource() == Title1){
setTitle("Programa MENU");
}
if(accion.getSource() == Title2){
NombrePestana = JOptionPane.showInputDialog("Favor de ingresar el nombre nuevo:");
setTitle(NombrePestana);
}
if(accion.getSource() == VentanaPre){
if(x==1){
JOptionPane.showMessageDialog(null,"El nombre del usuario pasado es:" + Ventanapre);
}

Ventanapre = JOptionPane.showInputDialog(null,"Favor de ingresar su nomre estimado USUARIO");
JOptionPane.showMessageDialog(null,"El nombre del usuario es:" + Ventanapre);

x=1;

opc = JOptionPane.showConfirmDialog(null,"SI : Cerrar programa, NO : Modificarnombre, CANCEL : Regresar al programa");

if(opc == 0){System.exit(0);}

if(opc == 1){Ventanapre = JOptionPane.showInputDialog(null,"Favor de ingresar su nomre estimado USUARIO");}

if(opc == 2){}
}
if(accion.getSource() == ProgramaX){
whopper jr = new whopper();
jr.setBounds(100,100,500,700);
jr.setVisible(true);
}

}

public static void main (String args []){

menu opciones = new menu();
opciones.setBounds(100,100,250,250);
opciones.setVisible(true);
opciones.setResizable(true);
}
}
