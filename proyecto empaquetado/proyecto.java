import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class proyecto extends JFrame implements ActionListener, KeyListener, ItemListener, ChangeListener, FocusListener, MouseListener {

    String strCadena;


    private Container contain;
    public JMenuBar menus;
    public JMenu menu5, menu6, Concierto, Deporte, Teatro, Peliculas;
    public JMenuItem Registrar, Eliminar, ReporteM, ReporteT, ReporteC, ReporteD;
    public ButtonGroup Genero, Grupo_eventos;
    public JRadioButton masc, fem, Evento_musical, Evento_deportivo, Evento_cine, Evento_teatro;
    public JCheckBox alimento, valet;
    public JTextArea Datos_Persona, Datos_Evento, Asientos, Eventos_Disponibles, eventos_datos, eventos_personas, eventos_datos2, eventos_personas2, eventos_datos3, eventos_personas3, eventos_datos4, eventos_personas4;
    public JLabel Genero_etiqueta, Edad_etiqueta, Nombre_etiqueta, Tipo_de_evento_etiqueta, Nombre_de_evento_etiqueta, eventos_datos_etiqueta, eventos_personas_etiqueta;
    public JLabel Eventos_disponibles_etiqueta, Datos_de_persona_etiqueta, Datos_de_eventos_seleccionado_etiqueta, Asientos_etiqueta;
    public JLabel Etiqueta_imagen_1, Etiqueta_imagen_2, Etiqueta_imagen_3, Etiqueta_imagen_4, Etiqueta_imagen_5, Etiqueta_imagen_6, Etiqueta_imagen_7, Etiqueta_imagen_8, Etiqueta_imagen_9;
    public JComboBox<String> Edad_menu;
    public JTextField Nombre_TextField, Nombre_de_evento_menu;
    public JButton Registrar_Botton,Registrar_Botton1,Registrar_Botton2,Registrar_Botton3,Registrar_Botton4,Registrar_Botton5;
    public JScrollPane Datos_persona_scroll, Datos_eventos_seleccionado_scroll, Asientos_scroll, Eventos_disponibles_scroll, eventos_datos_scroll, eventos_personas_scroll, eventos_datos_scroll2, eventos_personas_scroll2, eventos_datos_scroll3, eventos_personas_scroll3, eventos_datos_scroll4, eventos_personas_scroll4;


    //Variables de ADMIN evento
    public JLabel Evento_nombre_etiqueta, Evento_tipo_etiqueta, Evento_costo_etiqueta, Evento_fecha_etiqueta;
    public JLabel Evento_lugar_etiqueta, Evento_hora_etiqueta, Evento_asientos_etiqueta;
    public TextField Evento_nombre_textfield, Evento_costo_textfield, Evento_fecha_textfield;
    public TextField Evento_lugar_textfield, Evento_hora_textfield, Evento_asientos_textfield;
    public JComboBox<String> Evento_tipo_menu;
    public JButton registrar, salir, salir_registro;

    //Variables ADMIN

    //Arreglos de datos de evento
    String[] Evento_nombre_datos = new String[100];
    String[] Evento_tipo_datos = new String[100];
    int[] Evento_costo_datos = new int[100];
    String[] Evento_fecha_datos = new String[100];
    String[] Evento_lugar_datos = new String[100];
    String[] Evento_hora_datos = new String[100];
    int[] Evento_asientos_totales_datos = new int[100];
    int[] Evento_asientos_disp_datos = new int[100];
    int[] Evento_tipo_dato_select = new int[100];
    int[] Evento_asientos_ocup_datos = new int[100];
    String[] Evento_nombre = new String[100];
    String[] Evento_tipo = new String[100];
    String[] Valet = new String[100];
    String[] Alimentos = new String[100];
    String[] Generos = new String[100];
    String[] Edad = new String[100];
    int[] tipoeventoint = new int[100];
    String[] Evento_tipo_registro = new String[100];

    String Nombre,Nombre1;
    int a=6 ,b,aceptado_genero = 0,aceptado_tipo = 0,c = 5,n=1,o;

    Font fuente = new Font("Arial",Font.CENTER_BASELINE,15);

    public proyecto(){

    menu_principal();

        ///////////////////////////////////Datos de eventos


        //Evento 1 datos
        Evento_nombre_datos[1] = "Rammstein";
        Evento_costo_datos[1] = 1300;
        Evento_fecha_datos[1] = "06/01/2021";
        Evento_lugar_datos[1] = "Guadalajara";
        Evento_hora_datos[1] = "8:50PM";
        Evento_tipo_datos[1] = "Musical";
        Evento_tipo_dato_select[1] = 1;
        Evento_asientos_totales_datos[1] = 400;
        Evento_asientos_disp_datos[1] = 400;
        Evento_asientos_ocup_datos[1] = 0;

        //Evento 2 datos
        Evento_nombre_datos[2] = "El fantasma de la opera" ;
        Evento_costo_datos[2] = 1900;
        Evento_fecha_datos[2] = "23/12/2020";
        Evento_lugar_datos[2] = "Ciudad Guzman";
        Evento_hora_datos[2] = "7:00PM";
        Evento_tipo_datos[2] = "Teatro";
        Evento_tipo_dato_select[2] = 2;
        Evento_asientos_totales_datos[2] = 200;
        Evento_asientos_disp_datos[2] = 200;
        Evento_asientos_ocup_datos[2] = 0;

        //Evento 3 datos
        Evento_nombre_datos[3] = "El Hobbit";
        Evento_costo_datos[3] = 150;
        Evento_fecha_datos[3] = "21/12/2020";
        Evento_lugar_datos[3] = "jalisco";
        Evento_hora_datos[3] = "10:00PM";
        Evento_tipo_datos[3] = "Pelicula";
        Evento_tipo_dato_select[3] = 3;
        Evento_asientos_totales_datos[3] = 150;
        Evento_asientos_disp_datos[3] = 150;
        Evento_asientos_ocup_datos[3] = 0;

        //Evento 4 datos
        Evento_nombre_datos[4] = "Super Bolw 55";
        Evento_costo_datos[4] = 6000;
        Evento_fecha_datos[4] = "06/02/2021";
        Evento_lugar_datos[4] = "Tampa Bay";
        Evento_hora_datos[4] = "5:00PM";
        Evento_tipo_datos[4] = "Deporte";
        Evento_tipo_dato_select[4] = 4;
        Evento_asientos_totales_datos[4] = 2100;
        Evento_asientos_disp_datos[4] = 2100;
        Evento_asientos_ocup_datos[4] = 0;

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent ea) {
        if(ea.getKeyCode() == 10)
        {
            if(aceptado_genero == 1){
                if(aceptado_tipo == 1){
                    setSize(880,620);
                    this.Datos_Persona.append(Generos[a] + Edad[a] + Evento_nombre[a] + Alimentos[a] + Valet[a] + Evento_tipo[a]);
                    JOptionPane.showMessageDialog(null,"Registrado exitosamente");
                    contain = getContentPane();
                    contain.removeAll();
                    invalidate();
                    repaint();
                    aceptado_genero = 0;
                    aceptado_tipo = 0;
                    menu_principal();
                    a++;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Favor de ingresar un tipo de evento");
                }
            }

            else{
                JOptionPane.showMessageDialog(null,"Favor de ingresar un genero");
            }
        }
    }

    public void keyReleased(KeyEvent e) {

    }

    public void itemStateChanged (ItemEvent action){

        Edad[a] = Edad_menu.getSelectedItem().toString();
        Edad[a] = "\n La edad es: " + Edad[a];


    }

    public void stateChanged (ChangeEvent action){

        if (Evento_cine.isSelected() == true) {



            Evento_tipo[a] = "\n Evento tipo Pelicula";
            tipoeventoint[a] = 1;
            aceptado_tipo = 1;

        }
        if (Evento_deportivo.isSelected() == true) {



            Evento_tipo[a] = "\n Evento tipo Deportivo";
            tipoeventoint[a] = 2;
            aceptado_tipo = 1;

        }
        if (Evento_teatro.isSelected() == true) {



            Evento_tipo[a] = "\n Evento tipo Teatro";
            tipoeventoint[a] = 3;
            aceptado_tipo = 1;

        }
        if (Evento_musical.isSelected() == true) {



            Evento_tipo[a] = "\n Evento tipo Musical";
            tipoeventoint[a] = 4;
            aceptado_tipo = 1;
        }
        if (masc.isSelected() == true) {
            Generos[a] = "\nGenero: Hombre";
            aceptado_genero = 1;
        }
        if (fem.isSelected() == true) {
            Generos[a] = "\nGenero: Mujer";
            aceptado_genero = 1;
        }
        if (valet.isSelected() == true) {
            Valet[a] = "\nValet Parking incluido";
        }
        if (valet.isSelected() == false) {
            Valet[a] = "\nValet Parking no incluido";
        }
        if (alimento.isSelected() == true) {
            Alimentos[a] = "Alimentos incluidas";
        }
        if (alimento.isSelected() == false) {
            Alimentos[a] = "Alimentos no incluidas";
        }

    }

    public void actionPerformed(ActionEvent accion){


        if(accion.getSource() == Registrar){
            JOptionPane.showMessageDialog(null,"Registrar un evento");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            if(Nombre.equals("Hola")){
                setSize(1500, 620);

                
                Evento_nombre_etiqueta = new JLabel("Nombre de evento:");
                Evento_nombre_etiqueta.setBounds(1010, 20, 130, 20);
                Evento_nombre_etiqueta.setFont(fuente);
                add(Evento_nombre_etiqueta);

                Evento_nombre_textfield = new TextField("");
                Evento_nombre_textfield.setBounds(1240, 20, 200, 25);
                Evento_nombre_textfield.setFont(fuente);
                add(Evento_nombre_textfield);

                Evento_tipo_etiqueta = new JLabel("Tipo de evento:");
                Evento_tipo_etiqueta.setBounds(1010, 50, 130, 20);
                Evento_tipo_etiqueta.setFont(fuente);
                add(Evento_tipo_etiqueta);

                Evento_tipo_menu = new JComboBox();
                Evento_tipo_menu.setBounds(1240, 50, 200, 25);
                Evento_tipo_menu.setFont(fuente);
                add(Evento_tipo_menu);

                Evento_tipo_menu.addItem("Musica");
                Evento_tipo_menu.addItem("Teatro");
                Evento_tipo_menu.addItem("Pelicula");
                Evento_tipo_menu.addItem("Deporte");

                Evento_costo_etiqueta = new JLabel("Costo de evento:");
                Evento_costo_etiqueta.setBounds(1010, 80, 130, 20);
                Evento_costo_etiqueta.setFont(fuente);
                add(Evento_costo_etiqueta);

                Evento_costo_textfield = new TextField("");
                Evento_costo_textfield.setBounds(1240, 80, 200, 25);
                Evento_costo_textfield.setFont(fuente);
                add(Evento_costo_textfield);

                Evento_fecha_etiqueta = new JLabel("Fecha de evento:");
                Evento_fecha_etiqueta.setBounds(1010, 110, 130, 20);
                Evento_fecha_etiqueta.setFont(fuente);
                add(Evento_fecha_etiqueta);

                Evento_fecha_textfield = new TextField("");
                Evento_fecha_textfield.setBounds(1240, 110, 200, 25);
                Evento_fecha_textfield.setFont(fuente);
                add(Evento_fecha_textfield);

                Evento_lugar_etiqueta = new JLabel("Lugar del evento:");
                Evento_lugar_etiqueta.setBounds(1010, 140, 130, 20);
                Evento_lugar_etiqueta.setFont(fuente);
                add(Evento_lugar_etiqueta);

                Evento_lugar_textfield = new TextField("");
                Evento_lugar_textfield.setBounds(1240, 140, 200, 25);
                Evento_lugar_textfield.setFont(fuente);
                add(Evento_lugar_textfield);

                Evento_hora_etiqueta = new JLabel("Hora de evento:");
                Evento_hora_etiqueta.setBounds(1010, 170, 130, 20);
                Evento_hora_etiqueta.setFont(fuente);
                add(Evento_hora_etiqueta);

                Evento_hora_textfield = new TextField("");
                Evento_hora_textfield.setBounds(1240, 170, 200, 25);
                Evento_hora_textfield.setFont(fuente);
                add(Evento_hora_textfield);

                Evento_asientos_etiqueta = new JLabel("Num. de asientos:");
                Evento_asientos_etiqueta.setBounds(1010, 200, 130, 20);
                Evento_asientos_etiqueta.setFont(fuente);
                add(Evento_asientos_etiqueta);

                Evento_asientos_textfield = new TextField("");
                Evento_asientos_textfield.setBounds(1240, 200, 200, 25);
                Evento_asientos_textfield.setFont(fuente);
                add(Evento_asientos_textfield);

                Evento_tipo_menu.addItemListener(this);

                registrar = new JButton("Registrar");
                registrar.setBounds(1180, 230, 120, 25);
                registrar.setFont(fuente);
                add(registrar);

                salir = new JButton("Salir menu ADMIN");
                salir.setBounds(1180, 260, 220, 25);
                salir.setFont(fuente);
                add(salir);

                salir.addActionListener(this);
                registrar.addActionListener(this);
                Evento_tipo_menu.addItemListener(this);
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta, Verifiquelo nuevamente :(");
                }
        }
        if(accion.getSource() == registrar) {

            String Ncadena2 = Evento_nombre_textfield.getText();
            int Ncadena3 = Integer.parseInt(Evento_costo_textfield.getText());
            String Ncadena4 = Evento_fecha_textfield.getText();
            String Ncadena5 = Evento_lugar_textfield.getText();
            String Ncadena6 = Evento_hora_textfield.getText();
            int Ncadena7 = Integer.parseInt(Evento_asientos_textfield.getText());

            Evento_tipo_datos[c] = Evento_tipo_menu.getSelectedItem().toString();



            if(Evento_tipo_datos[c].equals("Musica")){
                Evento_tipo_dato_select[c] = 1;
            }
            if(Evento_tipo_datos[c].equals("Teatro")){
                Evento_tipo_dato_select[c] = 2;
            }
            if(Evento_tipo_datos[c].equals("Pelicula")){
                Evento_tipo_dato_select[c] = 3;
            }
            if(Evento_tipo_datos[c].equals("Deporte")){
                Evento_tipo_dato_select[c] = 4;
            }

            Evento_tipo_datos[c] = Evento_tipo_menu.getSelectedItem().toString();
            Evento_nombre_datos[c] = Ncadena2;
            Evento_costo_datos[c] = Ncadena3;
            Evento_fecha_datos[c] = Ncadena4;
            Evento_lugar_datos[c] = Ncadena5;
            Evento_hora_datos[c] = Ncadena6;
            Evento_asientos_totales_datos[c] = Ncadena7;
            Evento_asientos_disp_datos[c] = Ncadena7;
            Evento_asientos_ocup_datos[c] = 0;


            JOptionPane.showMessageDialog(null,"Registrado exitosamente");

            contain = getContentPane();
            contain.removeAll();
            invalidate();
            repaint();
            menu_principal();
            setSize(880,620);

            c++;
        }
        if(accion.getSource() == Eliminar){

            JOptionPane.showMessageDialog(null,"Eliminar un evento");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            Nombre1 = JOptionPane.showInputDialog("Favor de ingresar el nombre del evento");

            if(Nombre.equals("Hola")){

                for(int z=1; z<=90; z++){
                    if(Nombre1.equals(Evento_nombre_datos[z])) {

                        Evento_nombre_datos[z] = null;
                        Evento_costo_datos[z] = 0;
                        Evento_fecha_datos[z] = null;
                        Evento_lugar_datos[z] = null;
                        Evento_hora_datos[z] = null;
                        Evento_tipo_datos[z] = null;
                        Evento_tipo_dato_select[z] = 0;
                        Evento_asientos_totales_datos[z] = 0;
                        Evento_asientos_disp_datos[z] = 0;
                        Evento_asientos_ocup_datos[z] = 0;


                    }
                }

            }
            else{
                JOptionPane.showMessageDialog(null,"Evento no encontrado");
            }

        }
        if(accion.getSource() == ReporteC){
            JOptionPane.showMessageDialog(null,"Reporte de Eventos de Cine");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            if(Nombre.equals("Hola")){

                setSize(1500,620);

                eventos_datos_etiqueta = new JLabel("Datos de eventos");
                eventos_datos_etiqueta.setBounds(900,15,190,15);
                eventos_datos_etiqueta.setFont(fuente);
                eventos_datos_etiqueta.setForeground(Color.GREEN);
                add(eventos_datos_etiqueta);

                eventos_datos =  new JTextArea("");
                eventos_datos.setBounds(900, 30, 250, 500);
                eventos_datos.setFont(fuente);
                eventos_datos.setEditable(false);
                add(eventos_datos);

                eventos_datos_scroll = new JScrollPane(eventos_datos);
                eventos_datos_scroll.setBounds(900,30,250,500);
                add(eventos_datos_scroll);

                eventos_personas_etiqueta = new JLabel("Personas registradas");
                eventos_personas_etiqueta.setBounds(1200,15,190,15);
                eventos_personas_etiqueta.setFont(fuente);
                eventos_personas_etiqueta.setForeground(Color.GREEN);
                add(eventos_personas_etiqueta);

                eventos_personas =  new JTextArea("");
                eventos_personas.setBounds(1200, 30, 250, 500);
                eventos_personas.setFont(fuente);
                eventos_personas.setEditable(false);
                add(eventos_personas);

                eventos_personas_scroll = new JScrollPane(eventos_personas);
                eventos_personas_scroll.setBounds(1200,30,250,500);
                add( eventos_personas_scroll);

                salir_registro = new JButton("Salir");
                salir_registro.setBounds(1100,533,150,25);
                add(salir_registro);

                salir_registro.addActionListener(this);

                strCadena = "";

                int p = 1;

                for(int i=1; i<=90; i++){
                    if(tipoeventoint[i] == 1) {
                        strCadena +=  "\n" + "persona" + p + "\n" + Edad[i] + Generos[i] + Evento_tipo[i]+ Evento_nombre[i] + Alimentos[i] + Valet[i] +  "\n Eventpo registrado: " + Evento_tipo_registro[i] ;
                        p++;
                    }
                }
                eventos_personas.setText(strCadena);

                repaint();

                strCadena = "";

                int n = 1;

                for(int z=1; z<=90; z++){
                    if(Evento_tipo_dato_select[z] == 3) {
                        strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                        n++;
                    }
                }
                eventos_datos.setText(strCadena);

                repaint();

               }
            else{

                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
                }
        }
        if(accion.getSource() == ReporteD){
            JOptionPane.showMessageDialog(null,"Reporte de Eventos de Deporte");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            if(Nombre.equals("Hola")){
                setSize(1500,620);

                eventos_datos_etiqueta = new JLabel("Datos de eventos");
                eventos_datos_etiqueta.setBounds(900,15,190,15);
                eventos_datos_etiqueta.setFont(fuente);
                eventos_datos_etiqueta.setForeground(Color.GREEN);
                add(eventos_datos_etiqueta);

                eventos_datos2 =  new JTextArea("");
                eventos_datos2.setBounds(900, 30, 250, 500);
                eventos_datos2.setFont(fuente);
                eventos_datos2.setEditable(false);
                add(eventos_datos2);

                eventos_datos_scroll2 = new JScrollPane(eventos_datos2);
                eventos_datos_scroll2.setBounds(900,30,250,500);
                add(eventos_datos_scroll2);

                eventos_personas_etiqueta = new JLabel("Personas registradas");
                eventos_personas_etiqueta.setBounds(1200,15,190,15);
                eventos_personas_etiqueta.setFont(fuente);
                eventos_personas_etiqueta.setForeground(Color.GREEN);
                add(eventos_personas_etiqueta);

                eventos_personas2 =  new JTextArea("");
                eventos_personas2.setBounds(1200, 30, 250, 500);
                eventos_personas2.setFont(fuente);
                eventos_personas2.setEditable(false);
                add(eventos_personas2);

                eventos_personas_scroll2 = new JScrollPane(eventos_personas2);
                eventos_personas_scroll2.setBounds(1200,30,250,500);
                add( eventos_personas_scroll2);

                salir_registro = new JButton("Salir");
                salir_registro.setBounds(1100,533,150,25);
                add(salir_registro);

                salir_registro.addActionListener(this);

                strCadena = "";

                int p = 1;

                for(int i=1; i<=90; i++){
                    if(tipoeventoint[i] == 2) {
                        strCadena += "\n" +  "persona" + p + "\n" + Edad[i] + Generos[i] + Evento_tipo[i]+ Evento_nombre[i] + Alimentos[i] + Valet[i] +  "\n Eventpo registrado: " + Evento_tipo_registro[i] ;
                        p++;
                    }
                }
                eventos_personas2.setText(strCadena);

                strCadena = "";

                int n = 1;

                for(int z=1; z<=90; z++){
                    if(Evento_tipo_dato_select[z] == 4) {
                        strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                        n++;
                    }
                }

                eventos_datos2.setText(strCadena);

            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
                }
        }
        if(accion.getSource() == ReporteM){
            JOptionPane.showMessageDialog(null,"Reporte de Eventos de Musica");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            if(Nombre.equals("Hola")){
                setSize(1500,620);

                eventos_datos_etiqueta = new JLabel("Datos de eventos");
                eventos_datos_etiqueta.setBounds(900,15,190,15);
                eventos_datos_etiqueta.setFont(fuente);
                eventos_datos_etiqueta.setForeground(Color.GREEN);
                add(eventos_datos_etiqueta);

                eventos_datos3 =  new JTextArea("");
                eventos_datos3.setBounds(900, 30, 250, 500);
                eventos_datos3.setFont(fuente);
                eventos_datos3.setEditable(false);
                add(eventos_datos3);

                eventos_datos_scroll3 = new JScrollPane(eventos_datos3);
                eventos_datos_scroll3.setBounds(900,30,250,500);
                add(eventos_datos_scroll3);

                eventos_personas_etiqueta = new JLabel("Personas registradas");
                eventos_personas_etiqueta.setBounds(1200,15,190,15);
                eventos_personas_etiqueta.setFont(fuente);
                eventos_personas_etiqueta.setForeground(Color.GREEN);
                add(eventos_personas_etiqueta);

                eventos_personas3 =  new JTextArea("");
                eventos_personas3.setBounds(1200, 30, 250, 500);
                eventos_personas3.setFont(fuente);
                eventos_personas3.setEditable(false);
                add(eventos_personas3);

                eventos_personas_scroll3 = new JScrollPane(eventos_personas3);
                eventos_personas_scroll3.setBounds(1200,30,250,500);
                add( eventos_personas_scroll3);

                salir_registro = new JButton("Salir");
                salir_registro.setBounds(1100,533,150,25);
                add(salir_registro);

                salir_registro.addActionListener(this);

                strCadena = "";

                int c = 1;

                for(int i=1; i<=90; i++){
                    if(tipoeventoint[i] == 4) {
                        strCadena += "\n" + "persona" + c + "\n" + Edad[i] + Generos[i] + Evento_tipo[i]+ Evento_nombre[i] + Alimentos[i] + Valet[i] +  "\n Eventpo registrado: " + Evento_tipo_registro[i] ;
                        c++;
                    }
                }
                eventos_personas3.setText(strCadena);

                repaint();

                strCadena = "";

                int n = 1;

                for(int z=1; z<=90; z++){
                    if(Evento_tipo_dato_select[z] == 1) {
                        strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                    n++;
                    }
                }
                eventos_datos3.setText(strCadena);

                repaint();
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
                }
        }
        if(accion.getSource() == ReporteT){
            JOptionPane.showMessageDialog(null,"Reporte de Eventos de Teatro");
            Nombre = JOptionPane.showInputDialog("Favor de ingresar la contraseña de ADMINISTRADOR:");
            if(Nombre.equals("Hola")){
                setSize(1500,620);

                eventos_datos_etiqueta = new JLabel("Datos de eventos");
                eventos_datos_etiqueta.setBounds(900,15,190,15);
                eventos_datos_etiqueta.setFont(fuente);
                eventos_datos_etiqueta.setForeground(Color.GREEN);
                add(eventos_datos_etiqueta);

                eventos_datos4 =  new JTextArea("");
                eventos_datos4.setBounds(900, 30, 250, 500);
                eventos_datos4.setFont(fuente);
                eventos_datos4.setEditable(false);
                add(eventos_datos4);

                eventos_datos_scroll4 = new JScrollPane(eventos_datos4);
                eventos_datos_scroll4.setBounds(900,30,250,500);
                add(eventos_datos_scroll4);

                eventos_personas_etiqueta = new JLabel("Personas registradas");
                eventos_personas_etiqueta.setBounds(1200,15,190,15);
                eventos_personas_etiqueta.setFont(fuente);
                eventos_personas_etiqueta.setForeground(Color.GREEN);
                add(eventos_personas_etiqueta);

                eventos_personas4 =  new JTextArea("");
                eventos_personas4.setBounds(1200, 30, 250, 500);
                eventos_personas4.setFont(fuente);
                eventos_personas4.setEditable(false);
                add(eventos_personas4);

                eventos_personas_scroll4 = new JScrollPane(eventos_personas4);
                eventos_personas_scroll4.setBounds(1200,30,250,500);
                add( eventos_personas_scroll4);

                salir_registro = new JButton("Salir");
                salir_registro.setBounds(1100,533,150,25);
                add(salir_registro);

                salir_registro.addActionListener(this);

                strCadena = "";

                int c = 1;

                for(int i=1; i<=90; i++){
                    if(tipoeventoint[i] == 2) {
                        strCadena += "\n" + "persona" + c + "\n" + Edad[i] + Generos[i] + Evento_tipo[i]+ Evento_nombre[i] + Alimentos[i] + Valet[i] +  "\n Eventpo registrado: " + Evento_tipo_registro[i] ;
                        c++;
                    }
                }

                eventos_personas4.setText(strCadena);

                repaint();

                strCadena = "";

                int n = 1;

                for(int z=1; z<=90; z++){
                    if(Evento_tipo_dato_select[z] == 2) {
                        strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                    n++;
                    }
                }
                eventos_datos4.setText(strCadena);

                strCadena = "";

                repaint();
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
            }
        }
        if(accion.getSource() == salir){

            Evento_nombre_etiqueta.setVisible(false);
            Evento_tipo_etiqueta.setVisible(false);
            Evento_costo_etiqueta.setVisible(false);
            Evento_fecha_etiqueta.setVisible(false);
            Evento_lugar_etiqueta.setVisible(false);
            Evento_hora_etiqueta.setVisible(false);
            Evento_asientos_etiqueta.setVisible(false);
            Evento_nombre_textfield.setVisible(false);
            Evento_costo_textfield.setVisible(false);
            Evento_fecha_textfield.setVisible(false);
            Evento_lugar_textfield.setVisible(false);
            Evento_hora_textfield.setVisible(false);
            Evento_asientos_textfield.setVisible(false);
            Evento_tipo_menu.setVisible(false);
            registrar.setVisible(false);
            salir.setVisible(false);

            contain = getContentPane();
            contain.removeAll();
            invalidate();
            repaint();

            menu_principal();

            setSize(880,620);
        }
        if(accion.getSource() == Registrar_Botton){


            if(aceptado_genero == 1){
                if(aceptado_tipo == 1){
                    String Ncadena1 = Nombre_de_evento_menu.getText();

                    strCadena = "";

                    int n = 1;

                    for(int z=1; z<=10; z++){
                        if(Ncadena1.equals(Evento_nombre_datos[z])) {

                            Evento_asientos_disp_datos[z] = Evento_asientos_disp_datos[z] - 1;

                            Evento_asientos_ocup_datos[z] = Evento_asientos_ocup_datos[z] + 1;
                            Evento_tipo_registro[a] = Evento_nombre_datos[z];

                            if(Evento_asientos_disp_datos[z] > 0) {

                                setSize(880, 620);
                                this.Datos_Persona.append(Edad[a] +Generos[a] + Evento_tipo[a] + Evento_nombre[a] + Alimentos[a] + Valet[a]  + "\n Eventpo registrado: " + Evento_tipo_registro[a]);
                                JOptionPane.showMessageDialog(null, "Registrado exitosamente");
                                contain = getContentPane();
                                contain.removeAll();
                                invalidate();
                                repaint();
                                aceptado_genero = 0;
                                aceptado_tipo = 0;
                                menu_principal();
                                a++;

                            }
                            if(Evento_asientos_disp_datos[z] <= 0) {
                                JOptionPane.showMessageDialog(null, "No tenemos boletos disponibles");
                                setSize(880, 620);
                                contain = getContentPane();
                                contain.removeAll();
                                invalidate();
                                repaint();
                                aceptado_genero = 0;
                                aceptado_tipo = 0;
                                menu_principal();

                            }
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Favor de ingresar un tipo de evento");
                }
            }

            else{
                JOptionPane.showMessageDialog(null,"Favor de ingresar un genero");
            }

        }
        if(accion.getSource() == salir_registro){


                    setSize(880,620);

                    contain = getContentPane();
                    contain.removeAll();
                    invalidate();
                    repaint();
                    aceptado_genero = 0;
                    aceptado_tipo = 0;
                    menu_principal();


        }
        if(accion.getSource() == Registrar_Botton1){
            strCadena = "";

            int n = 1;

            for(int z=1; z<=90; z++){
                if(Evento_tipo_dato_select[z] == 3) {
                    strCadena +=  "\n" + "evento" + n + "\n" + "\n" +"Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                            n++;
                }
            }
            Eventos_Disponibles.setText(strCadena);

            strCadena = "";
        }
        if(accion.getSource() == Registrar_Botton2){
            strCadena = "";

            int n = 1;

            for(int z=1; z<=90; z++){
                if(Evento_tipo_dato_select[z] == 2) {
                    strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                            n++;
                }
            }
            Eventos_Disponibles.setText(strCadena);

            strCadena = "";

        }
        if(accion.getSource() == Registrar_Botton3){
            strCadena = "";

            int n = 1;

            for(int r=1; r<=90; r++){
                if(Evento_tipo_dato_select[r] == 4) {
                    strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[r] + "\n" + "Lugar del evento: " + Evento_lugar_datos[r]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[r] + "\n" + "Hora del evento: " + Evento_hora_datos[r] + "\n"   +"Costo del evento: " + Evento_costo_datos[r] + "\n" +  "Asientos totales: " + Evento_asientos_totales_datos[r] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[r] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[r] + "\n" ;
                            n++;
                }
            }
            Eventos_Disponibles.setText(strCadena);
            strCadena = "";

        }
        if(accion.getSource() == Registrar_Botton4){
            strCadena = "";

            int n = 1;

            for(int z=1; z<=90; z++){
                if(Evento_tipo_dato_select[z] == 1) {
                    strCadena +=  "\n" + "evento" + n + "\n" + "\n" + "Nombre del evento: " + Evento_nombre_datos[z] + "\n" + "Lugar del evento: " + Evento_lugar_datos[z]+ "\n" + "Fecha del evento: " + Evento_fecha_datos[z] + "\n" + "Hora del evento: " + Evento_hora_datos[z] + "\n"   +"Costo del evento: " + Evento_costo_datos[z] + "\n" + "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n" ;
                            n++;
                }
            }
            Eventos_Disponibles.setText(strCadena);

            strCadena = "";

        }
        if(accion.getSource() == Registrar_Botton5) {

            String Ncadena2 = Nombre_de_evento_menu.getText();

            strCadena = "";

            for (int l = 1; l <= 90; l++) {
                if (Ncadena2.equals(Evento_nombre_datos[l])) {


                    strCadena = "";

                    for (int z = 1; z <= 90; z++) {
                        if (Ncadena2.equals(Evento_nombre_datos[z])) {
                            strCadena += "\n" + "Nombre del evento: " + Evento_nombre_datos[l] + "\n" + "Costo del evento: " + Evento_costo_datos[l] + "\n" + "Fecha del evento: " + Evento_fecha_datos[l] + "\n" + "Lugar del evento: " + Evento_lugar_datos[l] + "\n" + "Hora del evento: " + Evento_hora_datos[l];
                            n++;
                        }
                    }

                    Datos_Evento.setText(strCadena);

                    strCadena = "";

                    for (int z = 1; z <= 90; z++) {
                        if (Ncadena2.equals(Evento_nombre_datos[z])) {
                            strCadena += "\n" + "Asientos totales: " + Evento_asientos_totales_datos[z] + "\n" + "Asientos disponibles: " + Evento_asientos_disp_datos[z] + "\n" + "Asientos ocupados: " + Evento_asientos_ocup_datos[z] + "\n";
                            n++;
                        }
                    }

                    Asientos.setText(strCadena);

                    strCadena = "";
                }
                else{
                    o = 0;
                }
            }
            if(o == 1){

                JOptionPane.showMessageDialog(null,"Evento no encontrado");

            }
        }

        }

    public void focusGained(FocusEvent e){



    }

    public void focusLost(FocusEvent e) {

        String Ncadena = Nombre_TextField.getText();
        int LongitudNcadena = Ncadena.length(), cent = 1;

        for (int i = 0; i < LongitudNcadena; i++) {
            char caracter = Ncadena.charAt(i);
            int CodigoCaracter = (int) caracter;
            if (CodigoCaracter >= 33 && CodigoCaracter <= 64) {
                cent = 0;
            }
            if (CodigoCaracter >= 91 && CodigoCaracter <= 96) {
                cent = 0;
            }
            if (CodigoCaracter >= 123) {
                cent = 0;
            }
        }
        if (cent == 1) {
            Evento_nombre[a] =  "\n" + Ncadena + "\n" ;
        } else {
            JOptionPane.showMessageDialog(null, "*Favor de usar caracteres alfabeticos*");
            Nombre_TextField.setText("");
        }
    }

    public static void main (String args []){
        proyecto opciones = new proyecto();
        opciones.setBounds(100,100,880,620);
        opciones.setVisible(true);
        opciones.setResizable(false);
    }

    void menu_principal(){

        repaint();

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MITICKETMASTER");
        getContentPane().setBackground(new Color(0,0,0));

        //Datos de personas precargados
        //Datos de persona 1
        //Cine 1
        //Deportivo 2
        //Teatro 3
        //Musical 4
        Generos[1] = "\nGenero: Hombre";
        Edad[1] = "\n La edad es: 16-20";
        Evento_nombre[1] = "\nNombre: Adrian Mejia Pelicula";
        Alimentos[1] = "\nAlimentos incluidas" ;
        Valet[1] = "\nValet incluido";
        Evento_tipo[1] = "\nEvento tipo Pelicula";
        tipoeventoint[1] = 1;
        Evento_tipo_registro[1] = "El Hobbit";
        //Datos de persona 2
        Generos[2] = "\nGenero: Hombre";
        Edad[2] = "\n La edad es: 16-20";
        Evento_nombre[2] = "\nNombre: Erik Guijarro Deporte";
        Alimentos[2] = "\nAlimentos incluidas" ;
        Valet[2] = "\nValet incluido";
        Evento_tipo[2] = "\nEvento tipo Deporte";
        tipoeventoint[2] = 2;
        Evento_tipo_registro[2] = "Super Bolw 55";
        //Datos persona 3
        Generos[3] = "\nGenero: Mujer";
        Edad[3] = "\n La edad es: 16-20";
        Evento_nombre[3] = "\nNombre: Rocio Teatro";
        Alimentos[3] = "\nAlimentos incluidas" ;
        Valet[3] = "\nValet incluido";
        Evento_tipo[3] = "\nEvento tipo Teatro";
        tipoeventoint[3] = 3;
        Evento_tipo_registro[3] = "El fantasma de la opera";
        //Datos persona 4
        Generos[4] = "\nGenero: Hombre";
        Edad[4] = "\n La edad es: 16-20";
        Evento_nombre[4] = "\nNombre: Chester Bennington Musical";
        Alimentos[4] = "\nAlimentos incluidas" ;
        Valet[4] = "\nValet incluido";
        Evento_tipo[4] = "\nEvento tipo Musical";
        tipoeventoint[4] = 4;
        Evento_tipo_registro[4] = "Rammstein";
        //Datos persona 5
        Generos[5] = "\nGenero: Mujer";
        Edad[5] = "\n La edad es: 16-20";
        Evento_nombre[5] = "\nNombre: Sandra Quezada Pelicula";
        Alimentos[5] = "\nAlimentos incluidas" ;
        Valet[5] = "\nValet incluido";
        Evento_tipo[5] = "\nEvento tipo Pelicula";
        tipoeventoint[5] = 1;
        Evento_tipo_registro[5] = "El Hobbit";


        menus = new JMenuBar();
        setJMenuBar(menus);

        menu5 = new JMenu("ADMIN");
        menu6 = new JMenu("Eventos");
        Concierto = new JMenu("Musica");
        Deporte = new JMenu("Deporte");
        Teatro = new JMenu("Teatro");
        Peliculas = new JMenu("Pelicula");

        menus.add(menu5);
        menus.add(menu6);

        Registrar = new JMenuItem("Registrar evento");
        Eliminar = new JMenuItem("Eliminar evento");
        ReporteM = new JMenuItem("Reporte de eventos de Musica");
        ReporteT =  new JMenuItem("Reporte de eventos de Teatro");
        ReporteC = new JMenuItem("Reporte de eventos de Pelicula");
        ReporteD = new JMenuItem("Reporte de eventos de Deporte");

        menu5.add(Registrar);
        menu5.add(Eliminar);
        menu6.add(Concierto);
        Concierto.add(ReporteM);
        menu6.add(Deporte);
        Deporte.add(ReporteD);
        menu6.add(Teatro);
        Teatro.add(ReporteT);
        menu6.add(Peliculas);
        Peliculas.add(ReporteC);

        Genero_etiqueta = new JLabel("Genero");
        Genero_etiqueta.setBounds(490,10,100,15);
        Genero_etiqueta.setFont(fuente);
        Genero_etiqueta.setForeground(Color.CYAN);
        add(Genero_etiqueta);

        masc = new JRadioButton("Masculino");
        masc.setBounds(490,35,100,15);
        masc.setFont(fuente);
        add(masc);

        fem = new JRadioButton("Femenino");
        fem.setBounds(490,65,100,15);
        fem.setFont(fuente);
        add(fem);

        Genero = new ButtonGroup();
        Genero.add(masc);
        Genero.add(fem);

        Edad_etiqueta = new JLabel("Edad");
        Edad_etiqueta.setBounds(650,145,100,15);
        Edad_etiqueta.setFont(fuente);
        Edad_etiqueta.setForeground(Color.CYAN);
        add(Edad_etiqueta);

        Edad_menu = new JComboBox();
        Edad_menu.setBounds(650,160,100,20);
        Edad_menu.setFont(fuente);
        add(Edad_menu);

        Edad_menu.addItem("<15");
        Edad_menu.addItem("16-20");
        Edad_menu.addItem("21-30");
        Edad_menu.addItem("31-40");
        Edad_menu.addItem("41-50");
        Edad_menu.addItem(">51");

        Nombre_etiqueta = new JLabel("Nombre");
        Nombre_etiqueta.setBounds(650,65,100,15);
        Nombre_etiqueta.setFont(fuente);
        Nombre_etiqueta.setForeground(Color.CYAN);
        add(Nombre_etiqueta);

        Nombre_TextField = new JTextField("");
        Nombre_TextField.setBounds(650,80,130,19);
        Nombre_TextField.setFont(fuente);
        add(Nombre_TextField);

        Nombre_TextField.addFocusListener(this);

        Nombre_de_evento_etiqueta = new JLabel("Nombre de eventos");
        Nombre_de_evento_etiqueta.setBounds(650,100,130,15);
        Nombre_de_evento_etiqueta.setFont(fuente);
        Nombre_de_evento_etiqueta.setForeground(Color.CYAN);
        add(Nombre_de_evento_etiqueta);

        Nombre_de_evento_menu = new JTextField();
        Nombre_de_evento_menu.setBounds(650,115,130,20);
        Nombre_de_evento_menu.setFont(fuente);
        add(Nombre_de_evento_menu);

        alimento = new JCheckBox("Alimentos");
        alimento.setBounds(650,10,130,20);
        alimento.setFont(fuente);
        add(alimento);

        valet = new JCheckBox("Valet Parking");
        valet.setBounds(650,27,130,20);
        valet.setFont(fuente);
        add(valet);

        Registrar_Botton = new JButton("Registrar");
        Registrar_Botton.setBounds(400,525,100,20);
        add(Registrar_Botton);

        Datos_de_persona_etiqueta = new JLabel("Datos de persona");
        Datos_de_persona_etiqueta.setBounds(650,210,150,15);
        Datos_de_persona_etiqueta.setFont(fuente);
        Datos_de_persona_etiqueta.setForeground(Color.CYAN);
        add(Datos_de_persona_etiqueta);

        Datos_Persona = new JTextArea();
        Datos_Persona.setBounds(650,230,200,150);
        Datos_Persona.setEditable(false);

        add(Datos_Persona);



        Datos_de_eventos_seleccionado_etiqueta = new JLabel("Datos de evento");
        Datos_de_eventos_seleccionado_etiqueta.setBounds(650,390,200,15);
        Datos_de_eventos_seleccionado_etiqueta.setFont(fuente);
        Datos_de_eventos_seleccionado_etiqueta.setForeground(Color.CYAN);
        add(Datos_de_eventos_seleccionado_etiqueta);

        Datos_Evento = new JTextArea();
        Datos_Evento.setBounds(650,410,200,100);
        Datos_Evento.setEditable(false);
        add(Datos_Evento);


        Asientos_etiqueta = new JLabel("Datos de asientos");
        Asientos_etiqueta.setBounds(650,1200,150,15);
        Asientos_etiqueta.setFont(fuente);
        Asientos_etiqueta.setForeground(Color.CYAN);
        add(Asientos_etiqueta);

        Asientos = new JTextArea();
        Asientos.setBounds(2000,2000,200,100);
        Asientos.setEditable(false);
        add(Asientos);



        Eventos_disponibles_etiqueta = new JLabel("Eventos disponibles");
        Eventos_disponibles_etiqueta.setBounds(10,95,150,15);
        Eventos_disponibles_etiqueta.setFont(fuente);
        Eventos_disponibles_etiqueta.setForeground(Color.CYAN);
        add(Eventos_disponibles_etiqueta);

        Eventos_Disponibles = new JTextArea("");
        Eventos_Disponibles.setBounds(10,110,200,405);
        Eventos_Disponibles.setEditable(false);
        add(Eventos_Disponibles);



        Tipo_de_evento_etiqueta = new JLabel("Tipo de evento");
        Tipo_de_evento_etiqueta.setBounds(220,10,130,15);
        Tipo_de_evento_etiqueta.setFont(fuente);
        Tipo_de_evento_etiqueta.setForeground(Color.CYAN);
        add(Tipo_de_evento_etiqueta);

        Evento_cine = new JRadioButton("Cine");
        Evento_cine.setBounds(220,30,100,25);
        Evento_cine.setFont(fuente);
        add(Evento_cine);

        Evento_teatro = new JRadioButton("Teatro");
        Evento_teatro.setBounds(220,60,100,25);
        Evento_teatro.setFont(fuente);
        add(Evento_teatro);

        Evento_deportivo = new JRadioButton("Deportivo");
        Evento_deportivo.setBounds(325,30,100,25);
        Evento_deportivo.setFont(fuente);
        add(Evento_deportivo);

        Evento_musical = new JRadioButton("Concierto");
        Evento_musical.setBounds(325,60,100,25);
        Evento_musical.setFont(fuente);
        add(Evento_musical);

        Grupo_eventos = new ButtonGroup();
        Grupo_eventos.add(Evento_cine);
        Grupo_eventos.add(Evento_teatro);
        Grupo_eventos.add(Evento_deportivo);
        Grupo_eventos.add(Evento_musical);

        Registrar_Botton1 = new JButton("Evento Peliculas");
        Registrar_Botton1.setBounds(10,10,130,20);
        add(Registrar_Botton1);

        Registrar_Botton2 = new JButton("Evento Teatro");
        Registrar_Botton2.setBounds(10,30,130,20);
        add(Registrar_Botton2);

        Registrar_Botton3 = new JButton("Evento Deportivo");
        Registrar_Botton3.setBounds(10,50,130,20);
        add(Registrar_Botton3);

        Registrar_Botton4 = new JButton("Evento Concierto");
        Registrar_Botton4.setBounds(10,70,130,20);
        add(Registrar_Botton4);

        Registrar_Botton5 = new JButton("Verificar evento");
        Registrar_Botton5.setBounds(10,525,130,20);
        add(Registrar_Botton5);

        Registrar.addActionListener(this);
        Eliminar.addActionListener(this);
        ReporteM.addActionListener(this);
        ReporteT.addActionListener(this);
        ReporteC.addActionListener(this);
        ReporteD.addActionListener(this);
        masc.addChangeListener(this);
        fem.addChangeListener(this);
        Evento_musical.addChangeListener(this);
        Evento_teatro.addChangeListener(this);
        Evento_deportivo.addChangeListener(this);
        Evento_cine.addChangeListener(this);
        Edad_menu.addItemListener(this);
        alimento.addChangeListener(this);
        valet.addChangeListener(this);
        Registrar_Botton.addActionListener(this);
        Registrar_Botton1.addActionListener(this);
        Registrar_Botton2.addActionListener(this);
        Registrar_Botton3.addActionListener(this);
        Registrar_Botton4.addActionListener(this);
        Registrar_Botton5.addActionListener(this);
        Nombre_de_evento_menu.addMouseListener(this);

        setFocusable(true);
        addKeyListener(this);

        ImageIcon imagen1 = new ImageIcon("El fantasma de la opera.jpg");
        Etiqueta_imagen_1 = new JLabel(imagen1);
        Etiqueta_imagen_1.setBounds(255,110,150,200);
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(Etiqueta_imagen_1.getWidth(),Etiqueta_imagen_1.getHeight(),Image.SCALE_DEFAULT));
        Etiqueta_imagen_1.setIcon(icono);
        add(Etiqueta_imagen_1);

        ImageIcon imagen2 = new ImageIcon("El hobbit.jpg");
        Etiqueta_imagen_2 = new JLabel(imagen2);
        Etiqueta_imagen_2.setBounds(460,315,150,200);
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(Etiqueta_imagen_2.getWidth(),Etiqueta_imagen_2.getHeight(),Image.SCALE_DEFAULT));
        Etiqueta_imagen_2.setIcon(icono2);
        add(Etiqueta_imagen_2);

        ImageIcon imagen3 = new ImageIcon("Rammstein.jpg");
        Etiqueta_imagen_3 = new JLabel(imagen3);
        Etiqueta_imagen_3.setBounds(410,110,200,200);
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(Etiqueta_imagen_3.getWidth(),Etiqueta_imagen_3.getHeight(),Image.SCALE_DEFAULT));
        Etiqueta_imagen_3.setIcon(icono3);
        add(Etiqueta_imagen_3);

        ImageIcon imagen4 = new ImageIcon("SBLV.jpg");
        Etiqueta_imagen_4 = new JLabel(imagen4);
        Etiqueta_imagen_4.setBounds(255,315,200,200);
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(Etiqueta_imagen_4.getWidth(),Etiqueta_imagen_4.getHeight(),Image.SCALE_DEFAULT));
        Etiqueta_imagen_4.setIcon(icono4);
        add(Etiqueta_imagen_4);


    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

        JOptionPane.showMessageDialog(null,"El boton -Verificar evento- te ayudara a corroborar los datos de tu evento ");

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}