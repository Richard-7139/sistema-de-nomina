package com.udc.act.actividad3;

public class EmpleadoPorComision extends Empleado {
    private double salarioBase;
    private double porcentajeComision;
    private double ventas;
    private int aniosEnEmpresa;

    public EmpleadoPorComision(String nombre, double salarioBase, double porcentajeComision, double ventas, int aniosEnEmpresa) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.porcentajeComision = porcentajeComision;
        this.ventas = ventas;
        this.aniosEnEmpresa = aniosEnEmpresa;
    }

    @Override
    public double calcularSalarioBruto() {
        if (ventas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }
        return salarioBase + (ventas * porcentajeComision);
    }

    @Override
    public double calcularBeneficios() {
        double beneficios = 0;
        if (ventas > 20_000_000) {
            beneficios += ventas * 0.03; // Bono 3%
        }
        beneficios += 1_000_000; // Bono alimentación
        return beneficios;
    }
}
