/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *Clase que maneja todas las operaciones relacionadas con los clientes
 * @author Alejandroo
 */
public class ClienteDAO {
    private Connection conn;
    
    /**
     *Inserta un nuevo cliente en la base de datos de la aplicacion
     * @param datosCliente
     */
    public void anadirCliente(Cliente datosCliente) {
        conn = ConexionBBDD.getConnection();
        String sql = "INSERT into cliente values (" + "'"+datosCliente.getDNI()+"'" + ","+"'"+datosCliente.getNombre()+"'"+","+"'"+datosCliente.getApellidos()+"'"+","+"'"+datosCliente.getTelefono()+"'"+","+"'"+datosCliente.getDireccion()+"'"+","+"'"+datosCliente.getEmail()+"'" +")";

        try {
            Statement stm = conn.createStatement();
            int result = stm.executeUpdate(sql);
            
            if(result >0 ) {
                JOptionPane.showMessageDialog(null, "La inserción se realizó correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar añadir un cliente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        }
    }
    
    /**
     *Elimina un cliente de la base de datos de la aplicacion
     * @param datosCliente
     */
    public void eliminarCliente(Cliente datosCliente){
        conn =ConexionBBDD.getConnection();
        String sql = "delete from cliente where DNI= '" + datosCliente.getDNI() + "'";
        try {
            Statement stm = conn.createStatement();
            int result = stm.executeUpdate(sql);
            
            if(result >0 ) {
                JOptionPane.showMessageDialog(null, "Se ha borrado correctamente al cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar borrar un cliente");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
    }
    
    /**
     *Modifica los datos de un cliente de la base de datos de la
     * aplicacion
     * @param datosCliente
     */
    public void modificarCliente(Cliente datosCliente) {
        conn = ConexionBBDD.getConnection();
        String sql = "update cliente set DNI = '" +datosCliente.getDNI()+"',nombre='"+
        datosCliente.getNombre() +"',apellidos ='"+datosCliente.getApellidos()+
        "',telefono ='"+datosCliente.getTelefono()+"',direccion='"+datosCliente.getDireccion()
                +"',email ='"+datosCliente.getEmail()+"' where dni = '"+datosCliente.getDNI()
                +"'";
        
        try {
            Statement stm = conn.createStatement();
            int result = stm.executeUpdate(sql);
            
            if(result >0 ) {
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar modificar un cliente");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
    }
    
    /**
     *Muestra todos los clientes almacenados en la base de datos de 
     * nuestra aplicacion
     * @throws SQLException
     */
    public void mostrarCliente() throws SQLException{
        conn = ConexionBBDD.getConnection();
        String sql = "select * from cliente";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        //FALTA MOSTRAR LOS RESULTADOS
        //EN LA TABLA
    }
}
