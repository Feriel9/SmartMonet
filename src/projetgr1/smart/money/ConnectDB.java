/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgr1.smart.money;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fehim
 */
public class ConnectDB {

    public static Connection connectDataB() {
        Connection con = null;
        try {
            // TODO
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:EtudiantApp.sqlite");

        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {

        }
        return con;
    }

}
