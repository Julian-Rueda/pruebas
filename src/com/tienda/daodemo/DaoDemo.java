package com.tienda.daodemo;

import com.tienda.dao.ClienteDaoImpl;
import com.tienda.idao.IClienteDao;
import com.tienda.model.Cliente;

public class DaoDemo {

    public static void main(String[] args) {
        // objeto para manipular el dao
        IClienteDao clienteDao = new ClienteDaoImpl();

        // imprimir los clientes
        clienteDao.obtenerClientes().forEach(System.out::println);

        // obtner un cliente
        Cliente cliente = clienteDao.obtenerCliente(0);
        cliente.setUsername("Pardo");
        //actualizar cliente
        clienteDao.actualizarCliente(cliente);

        // imprimir los clientes
        System.out.println("*****");
        clienteDao.obtenerClientes().forEach(System.out::println);
    }
}