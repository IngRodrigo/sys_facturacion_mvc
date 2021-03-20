package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Conexion;
import model.ConsultasSql;
import model.Usuario;
import view.AccesoView;
import view.CiudadesView;
import view.MenuPrincipal;
import view.UsuariosOperaciones;

public final class Controller implements ActionListener{
    private ResultSet resulset;
    UsuariosOperaciones vistaUsuario = new UsuariosOperaciones();
    MenuPrincipal vistaMenu = new MenuPrincipal();
    CiudadesView vistaCiudades = new CiudadesView();
    
    /** Login **/
    AccesoView vistaAcceso = new AccesoView();
    /**
     Modelos
     **/
    
    Conexion conexion = new Conexion();
    public Controller() {
        iniciarSistema();
        listenner();
    }

    public void iniciarSistema() {
/*        vistaMenu.setTitle("Sistema");
        vistaMenu.setExtendedState(Frame.MAXIMIZED_BOTH);
        vistaMenu.setVisible(true);*/
    vistaAcceso.setTitle("Acceso al sistema");
    vistaAcceso.setVisible(true);
    }

    private void listenner() {
        
        vistaMenu._menu_usuarios_operaciones.addActionListener(this);
        vistaMenu._menu_herramientas_configuraciones_ciudades.addActionListener(this);
        vistaUsuario._usuario_btn_guardar.addActionListener(this);
        vistaCiudades._ciudades_btn_guardar.addActionListener(this);
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaMenu._menu_usuarios_operaciones) {
            cargarComnos("Usuarios", vistaUsuario._usuario_combo_ciudades);
            resulset=conexion.consultaSelect(ConsultasSql.getUsuarios());
            utilidades.Utilidades.cargarTabla(resulset, vistaUsuario._usuario_tabla, "usuarios");
            conexion.closeConexion();
            controlarAperturaVentanas(vistaUsuario, "Usuarios");
        }

        if (e.getSource() == vistaMenu._menu_herramientas_configuraciones_ciudades) {
            vistaCiudades.setClosable(true);
            try {
                resulset=conexion.consultaSelect("select * from ciudades");
                utilidades.Utilidades.cargarTabla(resulset, vistaCiudades._ciudades_tabla, "ciudades");
                conexion.closeConexion();
            } catch (Exception esql) {
                System.out.println("Error al intentar traer ciudades: "+esql);
                conexion.closeConexion();
            }
            controlarAperturaVentanas(vistaCiudades, "Ciudades");
        }
        if (e.getSource() == vistaCiudades._ciudades_btn_guardar) {
            System.out.println("Insertar ciudad");
        }
        /*
            OPERACIONES FORMULARIO USUARIOS
        **/
        if (e.getSource() == vistaUsuario._usuario_btn_guardar) {
            validarDatosUsuario();
        }
    }

    public void controlarAperturaVentanas(JInternalFrame inter, String titulo) {
        boolean mostrar = true;
        inter.setTitle(titulo);
        inter.setClosable(true);
        String Nombre = inter.getTitle();
        for (int a = 0; a < vistaMenu.escritorio.getComponentCount(); a++) {     // verificar si es instancia de algun componente que ya este en el jdesktoppane
            if (inter.getClass().isInstance(vistaMenu.escritorio.getComponent(a))) {
                JOptionPane.showMessageDialog(null, "La ventana " + Nombre + " que interta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
                System.out.println("esta instancia, no se debe mostrar");
                inter.toFront();
                vistaMenu.escritorio.moveToFront(inter);
                mostrar = false;

            } else {
                System.out.println("no lo es, puede mostrarse");
            }
        }
        if (mostrar) {
            vistaMenu.escritorio.add(inter);

        }
        inter.show();
    }

    private void cargarComnos(String formulario, JComboBox combo) {

        if (formulario.equals("Usuarios")) {
            String sql = "select * from ciudades";
            this.resulset = conexion.consultaSelect(sql);
            combo.removeAllItems();
            try {
                while (resulset.next()) {
                    combo.addItem(resulset.getString("descripcion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.closeConexion();
        }
    }

    private void validarDatosUsuario() {
        Usuario usuario = new Usuario();
        try {
            if (comprobarCamposVacios(vistaUsuario._usuarios_txt_nombre)) {
                JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacio");
            } else {
                usuario.setNombre(vistaUsuario._usuarios_txt_nombre.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_apellido)) {
                JOptionPane.showMessageDialog(null, "El campo apellido no puede estar vacio");
            } else {
                usuario.setApellido(vistaUsuario._usuario_txt_apellido.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_user_name)) {
                JOptionPane.showMessageDialog(null, "El campo nombre de usuario no puede estar vacio");
            } else {
                usuario.setUserName(vistaUsuario._usuario_txt_user_name.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_password) && comprobarCamposVacios(vistaUsuario._usuario_txt_rep_password)) {
                JOptionPane.showMessageDialog(null, "El campo contraseña no puede estar vacio");
            } else {
                if (vistaUsuario._usuario_txt_password.getText().equals(vistaUsuario._usuario_txt_rep_password.getText())) {
                    usuario.setPassword(vistaUsuario._usuario_txt_password.getText());
                    insertarNuevoUsuario(usuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales");
                }
            }

        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
        }
    }

    private boolean comprobarCamposVacios(JTextField campo) {
        boolean resultado = true;
        if (campo.getText().isEmpty()) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    private void insertarNuevoUsuario(Usuario usuario) {
        try {
             
        } catch (Exception e) {
        }
    }
}
