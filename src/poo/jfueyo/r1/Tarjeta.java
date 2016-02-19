/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.r1;

/**
 *
 * @author jesus_ignacio_159
 */
public class Tarjeta {
    Banco banco;
    
    String numeroDeTarjeta;
    String nombreEnLaTarjeta;
    String direccionDeLaTarjeta;
    String fechaDeExpiracion;
    String codigoDeSeguridad;
    
    Cuenta cuenta;
    Usuario usuario;
    Bitacora bitacora;
    
    public Tarjeta(Banco banco,String ndt, String nelt, String ddlt, String fde, String cds, Cuenta cuenta, Usuario usuario, Bitacora bitacora ) {
        
    }
    
}
