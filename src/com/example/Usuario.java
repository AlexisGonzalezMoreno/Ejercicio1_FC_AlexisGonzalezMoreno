package com.example;

public class Usuario {
    private String correoElectronico;
    private String nombre;
    private String usuario;

    public Usuario() { }

    public Usuario(String correoElectronico, String nombre, String usuario) {
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "correoElectronico='" + correoElectronico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
