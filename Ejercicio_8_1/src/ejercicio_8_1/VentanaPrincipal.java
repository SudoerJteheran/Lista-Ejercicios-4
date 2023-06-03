/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Jhojan
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{
    //Ventana que pide los datos de una persona
    private Container contenedor;
    private JLabel lblNombre, lblApellido, lblTelefono, lblDireccion;
    private JTextField txtNombre, txtApellido, txtTelefono, txtDireccion;
    private JButton btnAñadir, btnEliminar, btnBorrarLista;
    private ListaPersonas lista;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal(){
        
        lista = new ListaPersonas();
        inicio();
        super.setTitle("Lista de Personas");
        super.setSize(270, 350);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    private void inicio(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        //Establecer Labels y TextFields
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 135, 23);
        txtNombre = new JTextField();
        txtNombre.setBounds(105, 20, 135, 23);

        lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(20, 50, 135, 23);
        txtApellido = new JTextField();
        txtApellido.setBounds(105, 50, 135, 23);

        lblTelefono = new JLabel("Telefono:");
        lblTelefono.setBounds(20, 80, 135, 23);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(105, 80, 135, 23);

        lblDireccion = new JLabel("Direccion:");
        lblDireccion.setBounds(20, 110, 135, 23);
        txtDireccion = new JTextField();
        txtDireccion.setBounds(105, 110, 135, 23);

        //Botones
        btnAñadir = new JButton("Añadir");
        btnAñadir.setBounds(105, 150, 80, 23);
        btnAñadir.addActionListener(this);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(20, 280, 80, 23);
        btnEliminar.addActionListener(this);

        btnBorrarLista = new JButton("Borrar Lista");
        btnBorrarLista.setBounds(120, 280, 120, 23);
        btnBorrarLista.addActionListener(this);

        //Lista
        listaNombres = new JList();
        //Establece que solo se pueda elegir 1 elemento de la lista
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();

        //Scroll de la lista
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190 ,220, 80);
        //Asociamos el scroll a la lista
        scrollLista.setViewportView(listaNombres);

        //Añadimos los elementos al contenedor
        contenedor.add(lblNombre);
        contenedor.add(txtNombre);
        contenedor.add(lblApellido);
        contenedor.add(txtApellido);
        contenedor.add(lblTelefono);
        contenedor.add(txtTelefono);
        contenedor.add(lblDireccion);
        contenedor.add(txtDireccion);
        contenedor.add(btnAñadir);
        contenedor.add(btnEliminar);
        contenedor.add(btnBorrarLista);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent Evento) {
        if(Evento.getSource() == btnAñadir){
            añadirPersona();
        }
        if(Evento.getSource() == btnEliminar){
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if(Evento.getSource() == btnBorrarLista){
            borrarLista();
        }
    }

    //Metodos para los botones
    private void añadirPersona(){
        Persona p = new Persona(txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtTelefono.getText()), txtDireccion.getText());
        lista.añadirPersona(p);
        modelo.addElement(txtNombre.getText()+"-"+txtApellido.getText()+"-"+txtTelefono.getText()+"-"+txtDireccion.getText());
        listaNombres.setModel(modelo);
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    private void eliminarNombre(int indice){
        if (indice >= 0){
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    //Borrar la lista
    private void borrarLista(){
        modelo.removeAllElements();
        lista.borrarLista();
    }
}
