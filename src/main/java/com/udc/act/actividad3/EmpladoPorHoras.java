package com.udc.act.actividad3;

public class EmpladoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    private int horasExtras;

    public EmpladoPorHoras(String nombre, double tarifaPorHora, int horasTrabajadas, int horasExtras) {
        super(nombre);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
    }



    
    
}
