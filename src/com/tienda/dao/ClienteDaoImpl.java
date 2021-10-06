package com.tienda.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tienda.idao.*;
import com.tienda.model.Cliente;
import com.tienda.database.Conexion;

public class ClienteDaoImpl implements IClienteDao {

    //registrar cliente


    @Override
    public boolean registrarCliente(Cliente cliente) {
        boolean registrar = false;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO cliente values (NULL,'"+cliente.getUsername()+""
                + "','"+cliente.getPrivilegio()+"','"+cliente.getActivo()+""
                + "','"+cliente.getNombre()+ "','"+cliente.getCedula()+""
                + "','"+cliente.getEdad()+"','"+cliente.getCorreo()+""
                + "','"+cliente.getDireccion()+"','"+cliente.getTelefono()+"')";

        try {
            con=Conexion.obtenerConexion();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }



    //lista de tipo cliente
    List<Cliente> clientes;

    public List<Cliente> obtener() {
        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM CLIENTE ORDER BY ID";

        List<Cliente> listaCliente= new ArrayList<Cliente>();

        try {
            co= Conexion.obtenerConexion();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Cliente c=new Cliente();
                c.setId(rs.getInt(1));
                c.setUsername(rs.getString(2));
                c.setPassword(rs.getString(3));
                c.setPrivilegio(rs.getString(4));
                c.setActivo(rs.getInt(5));
                c.setNombre(rs.getString(6));
                c.setCedula(rs.getInt(7));
                c.setEdad(rs.getInt(8));
                c.setCorreo(rs.getString(9));
                c.setDireccion(rs.getString(10));
                c.setTelefono(rs.getInt(11));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaCliente;
    }

    //inicializar los objetos cliente y añadirlos a la lista
    public ClienteDaoImpl() {
        clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente(0,12,31234,4234,523,"","Javier", "pedro21","234","4234","423423");
        Cliente cliente2 = new Cliente(1,12,123,324,234,"ewf","dfv","sdv","ewf","Lillian","juan213");
        clientes.add(cliente1);
        clientes.add(cliente2);
    }

    //obtener todos los clientes
    @Override
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    //obtener un cliente por el id
    @Override
    public Cliente obtenerCliente(int id) {
        return clientes.get(id);
    }


    //actualizar un cliente
    @Override
    public boolean actualizarCliente(Cliente cliente) {
        Connection connect= null;
        Statement stm= null;

        boolean actualizar=false;

        String sql="UPDATE CLIENTE SET username='"+cliente.getUsername()+"', " +
                "password='"+cliente.getPassword()+"', privilegio='"+cliente.getPrivilegio()+
                "activo='"+cliente.getActivo()+"', nombre='"+cliente.getNombre()+
                "cedula='"+cliente.getCedula()+"', edad='"+cliente.getEdad()+
                "correo='"+cliente.getCorreo()+"', direccion='"+cliente.getDireccion()+
                "telefono='"+cliente.getTelefono()+"', " +" WHERE ID="+cliente.getId();
        try {
            connect=Conexion.obtenerConexion();
            stm=connect.createStatement();
            stm.execute(sql);
            actualizar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    //eliminar un cliente por el id
    @Override
    public boolean eliminarCliente(Cliente cliente) {
        Connection connect= null;
        Statement stm= null;

        boolean eliminar=false;

        String sql="DELETE FROM CLIENTE WHERE ID="+cliente.getId();
        try {
            connect=Conexion.obtenerConexion();
            stm=connect.createStatement();
            stm.execute(sql);
            eliminar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

}

