import javax.swing.*; //Ventanas
import java.awt.event.*; //Botones y Combo
import java.awt.*;  //Fuente
import javax.swing.event.*; //CheckBox

public class Encuesta extends JFrame implements ActionListener, ItemListener, ChangeListener {

public JCheckBox Lic, Mae, Doc;
public JButton terminar;
public JCheckBox Leer, Cor, Bic;
public JComboBox <String> DDomicilio;
public JLabel Informacion;
public JLabel etiqueta, etiqueta1,etiqueta2,etiqueta3;
public JRadioButton masc,fem;
public ButtonGroup Genero;
public JRadioButton Matu,Vesp;
public ButtonGroup Turno;
public JTextArea area;
public String Domicilio,nivel,gustos,horario,genero;

public Encuesta(){

setLayout(null);
setTitle("Encuesta");
setDefaultCloseOperation(EXIT_ON_CLOSE);

etiqueta = new JLabel("Domicilio");
etiqueta.setBounds(50,100,130,15);
add(etiqueta);

DDomicilio = new JComboBox();
DDomicilio.setBounds(50,125,130,20);
add(DDomicilio);

DDomicilio.addItem("Zapopan");
DDomicilio.addItem("Tlaquepaque");
DDomicilio.addItem("Guadalajara");
DDomicilio.addItem("Ocotlan");
DDomicilio.addItem("Tonaland");

etiqueta1 = new JLabel("Genero");
etiqueta1.setBounds(50,200,130,15);
add(etiqueta1);

masc = new JRadioButton("Masculino");
masc.setBounds(50,225,130,15);
add(masc);

fem = new JRadioButton("Femenino");
fem.setBounds(50,250,130,15);
add(fem);

Genero = new ButtonGroup();
Genero.add(masc);
Genero.add(fem);

Lic = new JCheckBox("Licenciado");
Lic.setBounds(50,300,130,15);
add(Lic);

Mae = new JCheckBox("Maestria");
Mae.setBounds(50,325,130,15);
add(Mae);

Doc = new JCheckBox("Doctorado");
Doc.setBounds(50,350,130,15);
add(Doc);

etiqueta2 = new JLabel("Gustos");
etiqueta2.setBounds(50,400,130,15);
add(etiqueta2);

Leer = new JCheckBox("Leer");
Leer.setBounds(50,425,130,15);
add(Leer);

Cor = new JCheckBox("Deportes");
Cor.setBounds(50,450,130,15);
add(Cor);

Bic = new JCheckBox("Arte");
Bic.setBounds(50,475,130,15);
add(Bic);

etiqueta3 = new JLabel("Turno");
etiqueta3.setBounds(50,525,130,15);
add(etiqueta3);

Matu = new JRadioButton("Matutino");
Matu.setBounds(50,550,130,15);
add(Matu);

Vesp = new JRadioButton("Vespertino");
Vesp.setBounds(50,575,130,15);
add(Vesp);


Turno = new ButtonGroup();
Turno.add(Matu);
Turno.add(Vesp);

area = new JTextArea();
area.setBounds(200,50,300,700);
add(area);

terminar = new JButton("FINALIZAR");
terminar.setBounds(50,650,130,15);
add(terminar);

DDomicilio.addItemListener(this);
terminar.addActionListener(this);
Matu.addChangeListener(this);
Vesp.addChangeListener(this);
Leer.addChangeListener(this);
Cor.addChangeListener(this);
Bic.addChangeListener(this);
Lic.addChangeListener(this);
Mae.addChangeListener(this);
Doc.addChangeListener(this);
masc.addChangeListener(this);
fem.addChangeListener(this);

}

    public void actionPerformed (ActionEvent action) {
        if (action.getSource() == terminar) {
            this.area.setText("RESPUESTAS: \n\n"+"Municipio: "+ Domicilio +"\n\nGenero: "+ genero +"\n\nHorario: "+ horario +"\n\nNivel de Estudios: "+nivel+"\n\nGustos: "+gustos);
        }
    }

    public void itemStateChanged (ItemEvent action) {
        Domicilio = DDomicilio.getSelectedItem().toString();
    }


 public void stateChanged (ChangeEvent action){
        nivel="";
        gustos="";
        if(Lic.isSelected()==true){
            nivel= nivel+"Licenciatura ";
        }
        if(Mae.isSelected()==true){
            nivel= nivel+"Maestria  ";
        }
        if(Doc.isSelected()==true){
            nivel= nivel+"Doctorado ";
        }
        if(Leer.isSelected()==true){
            gustos= gustos+"Leer ";
        }
        if(Cor.isSelected()==true){
            gustos= gustos+"Correr ";
        }
        if(Bic.isSelected()==true){
            gustos= gustos+"Bicicleta";
        }
        if(masc.isSelected()==true){
            genero="Masculino";
        }
        if(fem.isSelected()==true){
            genero="Femenino";
        }
        if(Matu.isSelected()==true){
            horario="Matutino";
        }
        if(Vesp.isSelected()==true){
            horario="Vespertino";
        }
    }

    public static void main (String args[]){

        Encuesta Encuestanew = new Encuesta();
        Encuestanew.setBounds(500,50,600,950);
        Encuestanew.setVisible(true);
        Encuestanew.setResizable(true);

    }

}