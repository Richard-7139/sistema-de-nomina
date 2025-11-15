/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.udc.act.actividad3;

/**
 *
 * @author LENOVO84
 */
public abstract class Empleado { //Debe ser abstracta para que no se pueda instanciar, ya que no se pueden crear empleados genéricos sin tipo.
    protected String nombre;
    protected double salarioBruto; //Salario antes de impuestos

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    

}
