package com.tienda.model;

public class Cliente {
    private int id;
    private String nombre =null;
    private int cedula;
    private int edad;
    private String username;
    private String password;
    private String privilegio;
    private int activo;
    private String direccion =null;
    private String correo =null;
    private int telefono;




    public Cliente() {
        super();
    }
    public Cliente(int id,
                   int cedula,
                   int edad,
                   int activo,
                   int telefono,
                   String nombre,
                   String username,
                   String password,
                   String privilegio,
                   String direccion,
                   String correo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.privilegio = privilegio;
        this.activo = activo;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.getNombre()+" "
                +this.getUsername()+" "+this.getPassword()+" "
                +this.getPrivilegio()+" "+this.getActivo()+" "
                +this.getCedula()+" "+this.getEdad()+" "
                +this.getCorreo()+" "+this.getDireccion()+" "
                +this.getTelefono()+" "+this.getId();
    }
}