package com.udc.act.actividad3;

public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;
    private int aniosEnEmpresa;

    public EmpleadoAsalariado(String nombre, double salarioMensual, int aniosEnEmpresa) {
        super(nombre);
        this.salarioMensual = salarioMensual;
        this.aniosEnEmpresa = aniosEnEmpresa;
    }

    @Override
    public double calcularSalarioBruto(){
        return salarioMensual;
    }
    
    @Override
    public double calcularBeneficios() {
        double beneficios = 0;
        if (aniosEnEmpresa >= 5) {
            beneficios = salarioMensual * 0.1; // 10% del salario mensual como beneficio
        }
        return beneficios;
    }
    
}
