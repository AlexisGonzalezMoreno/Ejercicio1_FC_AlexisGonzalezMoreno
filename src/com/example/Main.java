package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "usuarios.csv", linea;
        Usuarios usuarios = new Usuarios();
        boolean todoCorrecto = true;
        int contarLineas = 1, lineasCorrectas = 0, lineasIncorrectas = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            linea = br.readLine();
            while (linea != null) {
                Usuario usuario = new Usuario();
                String[] fields = linea.split(",");
                usuario.setCorreoElectronico(fields[0]);
                usuario.setNombre(fields[1]);
                usuario.setUsuario(fields[2]);
                if (usuarios.correoElectronicoExiste(usuario.getCorreoElectronico())) {
                    System.err.println("Línea " + contarLineas + ": email duplicado '" + fields[0] + "'.");
                    todoCorrecto = false;
                    lineasIncorrectas++;
                }
                if (!usuario.getCorreoElectronico().contains("@") || !usuario.getCorreoElectronico().contains(".")) {
                    System.err.println("Línea " + contarLineas + ": email '" + fields[0] + "' incorrecto.");
                    todoCorrecto = false;
                    lineasIncorrectas++;
                }
                if (todoCorrecto) {
                    usuarios.anadirUsuario(usuario);
                    lineasCorrectas++;
                }
                linea = br.readLine();
                contarLineas++;
                todoCorrecto = true;
            }
            usuarios.listarUsuarios();
            System.out.println("Líneas procesadas correctamente " + lineasCorrectas + " e incorrectamente " + lineasIncorrectas);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
