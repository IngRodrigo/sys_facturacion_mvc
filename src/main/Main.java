
package main;

import controller.Controller;
import model.datos.UsuarioDAO;

public class Main {

    public static void main(String[] args) {
        Controller controller= new Controller();
        System.out.println(UsuarioDAO.SQL_SELECT_USUARIOS);
    }
    
}
