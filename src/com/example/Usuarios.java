package com.example;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<Usuario> usuarios = new ArrayList();

    public void anadirUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Muestra por pantalla la lista del ArrayList de Usuarios en memoria.
     */
    public void listarUsuarios() {
        for(Usuario usuario: usuarios) {
            System.out.println(usuario.toString());
        }
    }

    /**
     * recibe un correo electrónico y comprueba si está registrado o no
     * @param correoElectronico
     * @return
     */
    public boolean correoElectronicoExiste(String correoElectronico) {
        for(int i=0; i<usuarios.size(); i++) {
            if(usuarios.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico))
                return true;
        }
        return false;
    }
}
