package com.udc.act.actividad3;

public abstract class Empleado { //Debe ser abstracta para que no se pueda instanciar, ya que no se pueden crear empleados genéricos sin tipo.
    protected String nombre;
    protected double salarioBruto; //Salario antes de impuestos

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios();

    public double calcularDeducciones(double bruto){
        double SSYPension = bruto * 0.04; //Seguro Social y Pensión 
        double arl = bruto * 0.00522; //En este caso, usaremos el ARL de riesgo 1
        return SSYPension + arl;
    }


    

}
