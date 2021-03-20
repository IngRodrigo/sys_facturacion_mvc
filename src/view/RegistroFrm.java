package view;


import clases.Icono;
import clases.Validaciones;
import clases.encoder;
import clases.usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Somos Programadores Facebook
 * https://web.facebook.com/developers08062019
 */
public class RegistroFrm extends javax.swing.JFrame {

    private String imgPathIniciarSesion = "/icons/enter.png";
    private String imgPathLogo = "/icons/logo.png";
    private String imgPathUserIocn = "/icons/usuario.png";
    private String imgPathPassword = "/icons/candado.png";
    private String imgPathCorreo = "/icons/correo.png";
    private String imgPathTelefono = "/icons/telefono.png";
  //  private BD mBd;
    private encoder mEncoder;
    private Validaciones mValidaciones;

    public RegistroFrm() {
        initComponents();
//        mBd = new BD("login", "root", "");
        mEncoder = new encoder();
        mValidaciones = new Validaciones();
        this.setSize(778, 581);
        loadIocns();
        setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void loadIocns() {
        Icono imgInicioSesionIcon = new Icono(pnlRegistrar, imgPathIniciarSesion);
        pnlRegistrar.add(imgInicioSesionIcon).repaint();
        pnlRegistrar.setOpaque(false);
        pnlRegistrar.setBorder(null);
        pnlRegistrar.setBackground(new Color(0, 0, 0, 64));

        Icono imgUser = new Icono(pnlUsuario, imgPathUserIocn);
        pnlUsuario.add(imgUser).repaint();
        pnlUsuario.setOpaque(false);
        pnlUsuario.setBorder(null);
        pnlUsuario.setBackground(new Color(0, 0, 0, 64));

        Icono imgNombre = new Icono(pnlIconNombre, imgPathUserIocn);
        pnlIconNombre.add(imgNombre).repaint();
        pnlIconNombre.setOpaque(false);
        pnlIconNombre.setBorder(null);
        pnlIconNombre.setBackground(new Color(0, 0, 0, 64));

        Icono imgApellidoPaterno = new Icono(pnlApellidoPaterno, imgPathUserIocn);
        pnlApellidoPaterno.add(imgApellidoPaterno).repaint();
        pnlApellidoPaterno.setOpaque(false);
        pnlApellidoPaterno.setBorder(null);
        pnlApellidoPaterno.setBackground(new Color(0, 0, 0, 64));

        Icono imgApellidoMaterno = new Icono(pnlApellido_materno, imgPathUserIocn);
        pnlApellido_materno.add(imgApellidoMaterno).repaint();
        pnlApellido_materno.setOpaque(false);
        pnlApellido_materno.setBorder(null);
        pnlApellido_materno.setBackground(new Color(0, 0, 0, 64));

        Icono imgPassword = new Icono(pnlPassword, imgPathPassword);
        pnlPassword.add(imgPassword).repaint();
        pnlPassword.setOpaque(false);
        pnlPassword.setBorder(null);
        pnlPassword.setBackground(new Color(0, 0, 0, 64));

        Icono imgPasswordConfirm = new Icono(pnlConfirmaPassword, imgPathPassword);
        pnlConfirmaPassword.add(imgPasswordConfirm).repaint();
        pnlConfirmaPassword.setOpaque(false);
        pnlConfirmaPassword.setBorder(null);
        pnlConfirmaPassword.setBackground(new Color(0, 0, 0, 64));

        Icono imgCorreo = new Icono(pnlCorreo, imgPathCorreo);
        pnlCorreo.add(imgCorreo).repaint();
        pnlCorreo.setOpaque(false);
        pnlCorreo.setBorder(null);
        pnlCorreo.setBackground(new Color(0, 0, 0, 64));

        Icono imgTelefono = new Icono(pnlTelefono, imgPathTelefono);
        pnlTelefono.add(imgTelefono).repaint();
        pnlTelefono.setOpaque(false);
        pnlTelefono.setBorder(null);
        pnlTelefono.setBackground(new Color(0, 0, 0, 64));

        cbMostrar.setOpaque(false);
        cbMostrar.setBorder(null);
        cbMostrar.setBackground(new Color(0, 0, 0, 64));

        cbMostrarConfirm.setOpaque(false);
        cbMostrarConfirm.setBorder(null);
        cbMostrarConfirm.setBackground(new Color(0, 0, 0, 64));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        pnlRegistrar = new javax.swing.JPanel();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlIconNombre = new javax.swing.JPanel();
        pnlApellidoPaterno = new javax.swing.JPanel();
        txtApellidoMaterno = new javax.swing.JTextField();
        pnlApellido_materno = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pnlUsuario = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        pnlPassword4 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlPassword = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        pnlConfirmaPassword = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        pnlTelefono = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        pnlPassword8 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pnlCorreo = new javax.swing.JPanel();
        jTextField20 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        cbMostrar = new javax.swing.JCheckBox();
        cbMostrarConfirm = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(86, 168, 240));

        lblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro");

        pnlRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        txtApellidoPaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(102, 102, 102));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Apellido paterno");

        pnlIconNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlIconNombreLayout = new javax.swing.GroupLayout(pnlIconNombre);
        pnlIconNombre.setLayout(pnlIconNombreLayout);
        pnlIconNombreLayout.setHorizontalGroup(
            pnlIconNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlIconNombreLayout.setVerticalGroup(
            pnlIconNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlApellidoPaterno.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlApellidoPaternoLayout = new javax.swing.GroupLayout(pnlApellidoPaterno);
        pnlApellidoPaterno.setLayout(pnlApellidoPaternoLayout);
        pnlApellidoPaternoLayout.setHorizontalGroup(
            pnlApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlApellidoPaternoLayout.setVerticalGroup(
            pnlApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        txtApellidoMaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(102, 102, 102));

        pnlApellido_materno.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlApellido_maternoLayout = new javax.swing.GroupLayout(pnlApellido_materno);
        pnlApellido_materno.setLayout(pnlApellido_maternoLayout);
        pnlApellido_maternoLayout.setHorizontalGroup(
            pnlApellido_maternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlApellido_maternoLayout.setVerticalGroup(
            pnlApellido_maternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Apellido materno");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));

        pnlUsuario.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 102, 102));

        pnlPassword4.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlPassword4Layout = new javax.swing.GroupLayout(pnlPassword4);
        pnlPassword4.setLayout(pnlPassword4Layout);
        pnlPassword4Layout.setHorizontalGroup(
            pnlPassword4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPassword4Layout.setVerticalGroup(
            pnlPassword4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Contraseña");

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUsuarioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUsuarioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Usuario");

        pnlPassword.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Contraseña");

        pnlConfirmaPassword.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlConfirmaPasswordLayout = new javax.swing.GroupLayout(pnlConfirmaPassword);
        pnlConfirmaPassword.setLayout(pnlConfirmaPasswordLayout);
        pnlConfirmaPasswordLayout.setHorizontalGroup(
            pnlConfirmaPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlConfirmaPasswordLayout.setVerticalGroup(
            pnlConfirmaPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Confirmar contraseña");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Telefono");

        pnlTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(102, 102, 102));

        pnlPassword8.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlPassword8Layout = new javax.swing.GroupLayout(pnlPassword8);
        pnlPassword8.setLayout(pnlPassword8Layout);
        pnlPassword8Layout.setHorizontalGroup(
            pnlPassword8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPassword8Layout.setVerticalGroup(
            pnlPassword8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Contraseña");

        javax.swing.GroupLayout pnlTelefonoLayout = new javax.swing.GroupLayout(pnlTelefono);
        pnlTelefono.setLayout(pnlTelefonoLayout);
        pnlTelefonoLayout.setHorizontalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTelefonoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlTelefonoLayout.setVerticalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTelefonoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlCorreo.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlCorreoLayout = new javax.swing.GroupLayout(pnlCorreo);
        pnlCorreo.setLayout(pnlCorreoLayout);
        pnlCorreoLayout.setHorizontalGroup(
            pnlCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlCorreoLayout.setVerticalGroup(
            pnlCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Correo");

        lblInicioSesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setText("Regresar al inicio de sesión");
        lblInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioSesionMouseClicked(evt);
            }
        });

        cbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarActionPerformed(evt);
            }
        });

        cbMostrarConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarConfirmActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblRegistro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlIconNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnlApellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInicioSesion))))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(cbMostrar))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnlConfirmaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMostrarConfirm))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRegistro)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlIconNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlApellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMostrar)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlConfirmaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbMostrarConfirm))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicioSesion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesionMouseClicked
        this.dispose();
        AccesoView mLoginFrm = new AccesoView();
        mLoginFrm.setVisible(true);
    }//GEN-LAST:event_lblInicioSesionMouseClicked

    private void pnlRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseClicked
      /*  if (!txtNombre.getText().trim().equals("") && !txtApellidoMaterno.getText().trim().equals("") && !txtApellidoPaterno.getText().trim().equals("")
                && !txtCorreo.getText().trim().equals("") && !txtUsuario.getText().trim().equals("") && !txtTelefono.getText().trim().equals("")
                && !txtPassword.getText().trim().equals("") && !txtPasswordConfirm.getText().trim().equals("")) {
            if (mValidaciones.ValidarEmail(txtCorreo.getText().trim())) {
                if (txtPassword.getText().trim().equals(txtPasswordConfirm.getText().trim())) {
                    if (txtTelefono.getText().length() == 10) {
                        usuario mUsuario = new usuario();
                        mUsuario.setNombre(txtNombre.getText().trim());
                        mUsuario.setApellido_materno(txtApellidoMaterno.getText().trim());
                        mUsuario.setApellido_paterno(txtApellidoPaterno.getText().trim());
                        mUsuario.setContrasena(mEncoder.ecnode(txtPassword.getText().trim()));
                        mUsuario.setTelefono(txtTelefono.getText().trim());
                        mUsuario.setUsuario(txtUsuario.getText().trim());
                        mUsuario.setCorreo(txtCorreo.getText().trim());
                        
                        if (mBd.Conectar()) {
                            if (mBd.AddUser(mUsuario)) {
                                JOptionPane.showMessageDialog(null, "Alta usuario exitosa!");
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "Error al conectar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Número de telefono inválido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "las contraseñas no coinciden");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo es inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        }*/

    }//GEN-LAST:event_pnlRegistrarMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarActionPerformed
        if (cbMostrar.isSelected()) {
            txtPassword.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarActionPerformed

    private void cbMostrarConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarConfirmActionPerformed
        if (cbMostrarConfirm.isSelected()) {
            txtPasswordConfirm.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtPasswordConfirm.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroFrm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFrm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFrm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFrm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbMostrar;
    private javax.swing.JCheckBox cbMostrarConfirm;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlApellidoPaterno;
    private javax.swing.JPanel pnlApellido_materno;
    private javax.swing.JPanel pnlConfirmaPassword;
    private javax.swing.JPanel pnlCorreo;
    private javax.swing.JPanel pnlIconNombre;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlPassword4;
    private javax.swing.JPanel pnlPassword8;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlTelefono;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
