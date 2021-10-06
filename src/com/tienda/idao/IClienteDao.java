package com.tienda.idao;

import java.util.List;

import com.tienda.model.Cliente;

public interface IClienteDao {
    //acceder a la base de datos

    public boolean registrarCliente(Cliente cliente);
    public List<Cliente> obtenerClientes();
    public Cliente obtenerCliente(int id);
    public boolean actualizarCliente(Cliente cliente);
    public boolean eliminarCliente(Cliente cliente);
}