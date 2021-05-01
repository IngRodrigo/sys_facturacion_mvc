package controller;

import com.toedter.calendar.JDateChooser;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Conexion;
import model.CadenasSentenciasSql;
import model.Usuario;
import model.domain.Ciudad;
import utilidades.Utilidades;
import view.AccesoView;
import view.CiudadesView;
import view.MenuPrincipal;
import view.UsuariosOperaciones;

public final class Controller implements ActionListener, MouseListener {

    private ResultSet resulset;
    UsuariosOperaciones vistaUsuario = new UsuariosOperaciones();
    MenuPrincipal vistaMenu = new MenuPrincipal();
    CiudadesView vistaCiudades = new CiudadesView();

    /**
     * Login *
     */
    AccesoView vistaAcceso = new AccesoView();
    /**
     * Modelos
     *
     */

    Conexion conexion = new Conexion();

    /*Objeto usuario*/
    Usuario usuarioLogueado = new Usuario();

    public Controller() {
        iniciarSistema();
        listenner();
    }

    public void iniciarSistema() {
        /*      vistaMenu.setTitle("Sistema");
        vistaMenu.setExtendedState(Frame.MAXIMIZED_BOTH);
        vistaMenu.setVisible(true);*/
        try {
            cargarComnos("login", vistaAcceso._acceso_nombre_usuario);
        } catch (Exception e) {
            Utilidades.EscribirLog("ERROR", "Al intentar traer lista de usuarios se produjo la exepción: " + e);
            mensajeValidacion("No se pudo establecer conexión con la base de datos");
        }
        vistaAcceso.setTitle("Acceso al sistema");
        vistaAcceso.setLocationRelativeTo(null);
        vistaAcceso.setVisible(true);
    }

    private void listenner() {
        vistaAcceso._acceso_btn_acceder.addActionListener(this);

        vistaMenu._menu_usuarios_operaciones.addActionListener(this);
        vistaMenu._menu_herramientas_configuraciones_ciudades.addActionListener(this);
        vistaMenu._menu_btn_salir.addActionListener(this);

        vistaUsuario._usuario_btn_guardar.addActionListener(this);
        vistaCiudades._ciudades_btn_guardar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaAcceso._acceso_btn_acceder) {
            String usuario = vistaAcceso._acceso_nombre_usuario.getSelectedItem().toString();
            String password = vistaAcceso._acceso_contrasena.getText();

            if (usuario.isEmpty()) {
                mensajeValidacion("El nombre de usuario no puede estar vacio");
            }
            if (password.isEmpty()) {
                mensajeValidacion("El campo contraseña no puede estar vacio");
            }

            if (comprobarUsuario(usuario, password)) {
                vistaAcceso.setVisible(false);
                irAlMenuPrincipal();
            }
        }

        if (e.getSource() == vistaMenu._menu_usuarios_operaciones) {
            cargarComnos("Operaciones Usuario", vistaUsuario._usuario_combo_ciudades);
            resulset = conexion.consultaSelect(CadenasSentenciasSql.getUsuarios());
            utilidades.Utilidades.cargarTabla(resulset, vistaUsuario._usuario_tabla, "usuarios");
            conexion.closeConexion();
            controlarAperturaVentanas(vistaUsuario, "Usuarios");
        }

        if (e.getSource() == vistaMenu._menu_herramientas_configuraciones_ciudades) {
            vistaCiudades.setClosable(true);
            Utilidades.cargarTabla(vistaCiudades._ciudades_tabla, "Ciudades");
          /*  try {
                resulset = conexion.consultaSelect("select * from ciudades");
                utilidades.Utilidades.cargarTabla(resulset, vistaCiudades._ciudades_tabla, "ciudades");
                conexion.closeConexion();
            } catch (Exception esql) {
                System.out.println("Error al intentar traer ciudades: " + esql);
                conexion.closeConexion();
            }*/
          
            controlarAperturaVentanas(vistaCiudades, "Ciudades");
        }
        if (e.getSource() == vistaMenu._menu_btn_salir) {
            salirDelSistema();
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

        if (formulario.equals("Operaciones Usuario")) {
            String ciudad = CadenasSentenciasSql.TodasLasCiudades();
            this.resulset = conexion.consultaSelect(ciudad);
            vistaUsuario._usuario_combo_ciudades.removeAllItems();
            try {
                while (resulset.next()) {
                    vistaUsuario._usuario_combo_ciudades.addItem(resulset.getString("descripcion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.closeConexion();

            String pais = CadenasSentenciasSql.TodosLosPaises();
            this.resulset = conexion.consultaSelect(pais);
            vistaUsuario._usuario_combo_paises.removeAllItems();
            try {
                while (resulset.next()) {
                    vistaUsuario._usuario_combo_paises.addItem(resulset.getString("descripcion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.closeConexion();

            String tipo_usuario = CadenasSentenciasSql.TodosLosTipos();
            this.resulset = conexion.consultaSelect(tipo_usuario);
            vistaUsuario._usuario_combo_tipo.removeAllItems();
            try {
                while (resulset.next()) {
                    vistaUsuario._usuario_combo_tipo.addItem(resulset.getString("descripcion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.closeConexion();
        }
        if (formulario.equals("login")) {
            String sql = CadenasSentenciasSql.getUsuarios();
            this.resulset = conexion.consultaSelect(sql);
            combo.removeAllItems();
            try {
                while (resulset.next()) {
                    combo.addItem(resulset.getString("user"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.closeConexion();
        }
    }

    private void validarDatosUsuario() {
        //  Usuario usuario = new Usuario();
        try {
            /* if (comprobarCamposVacios(vistaUsuario._usuarios_txt_nombre)) {
                mensajeValidacion("El campo nombre no puede estar vacio");
            } else {
                usuario.setNombre(vistaUsuario._usuarios_txt_nombre.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_apellido)) {
                mensajeValidacion("El campo apellido no puede estar vacio");
            } else {
                usuario.setApellido(vistaUsuario._usuario_txt_apellido.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_user_name)) {
                mensajeValidacion("El campo nombre de usuario no puede estar vacio");
            } else {
                usuario.setUserName(vistaUsuario._usuario_txt_user_name.getText());
            }
            if (comprobarCamposVacios(vistaUsuario._usuario_txt_password) && comprobarCamposVacios(vistaUsuario._usuario_txt_rep_password)) {
                mensajeValidacion("El campo contraseña no puede estar vacio");
            } else {
                if (vistaUsuario._usuario_txt_password.getText().equals(vistaUsuario._usuario_txt_rep_password.getText())) {
                    usuario.setPassword(vistaUsuario._usuario_txt_password.getText());
                    insertarNuevoUsuario(usuario);
                } else {
                    mensajeValidacion("Las contraseñas no son iguales");
                }
            }*/
            String fechaNacimiento = getFechaView(vistaUsuario._usuarios_date);

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

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    private void mensajeValidacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private boolean comprobarUsuario(String usuario, String password) {
        String sql = CadenasSentenciasSql.getUsuario(usuario, password);
        boolean response = false;
        try {
            this.resulset = conexion.consultaSelect(sql);
            while (this.resulset.next()) {
                this.usuarioLogueado.setId(this.resulset.getInt("idUsuario"));
                this.usuarioLogueado.setNombre(this.resulset.getString("nombre"));
                this.usuarioLogueado.setApellido(this.resulset.getString("apellido"));
                this.usuarioLogueado.setUserName(this.resulset.getString("user"));
            }
            System.out.println("Usuario logueado = " + this.usuarioLogueado.toString());
            Utilidades.EscribirLog("OK", "Usuario logueado: " + this.usuarioLogueado.toString());
            response = true;
            return response;
        } catch (Exception e) {
            System.out.println("Al intentar comprobar los datos del usuario se produjo: " + e);
            Utilidades.EscribirLog("ERROR", "Al intentar comprobar los datos del usuario se produjo: " + e);
            response = false;
        }
        return response;
    }

    private void irAlMenuPrincipal() {
        abrirVentana(vistaMenu, "Principal");
    }

    private void abrirVentana(Frame ventana, String titulo) {
        ventana.setTitle(titulo);
        if (titulo.equals("Principal")) {
            ventana.setExtendedState(Frame.MAXIMIZED_BOTH);
            vistaMenu._fecha_menu_principal.setText(Utilidades.fechaActualParaTitulos());
        }
        ventana.setVisible(true);
    }

    private void salirDelSistema() {
       mensajeConfirmacion("Estas seguro que desea salir del sistema");
    }

    private String getFechaView(JDateChooser date) {
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        if (date.getDate() != null) {
           // System.out.println(Formato.format(date.getDate()));
            return Formato.format(date.getDate());
        } else {
            return null;
        }
    }

    private void mensajeConfirmacion(String mensaje) {
        int respuesta=JOptionPane.showConfirmDialog(null, mensaje);
        //System.out.println("respuesta = " + respuesta);
        if(respuesta==0){
            System.exit(0);
        }
    }
}
