package com.udc.act.actividad3;

public class EmpleadoTemporal extends Empleado {
    private double salarioMensual;
    private int mesesContrato;

    public EmpleadoTemporal(String nombre, double salarioMensual, int mesesContrato) {
        super(nombre);
        this.salarioMensual = salarioMensual;
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensual;
    }

    @Override
    public double calcularBeneficios() {
        return 0; // No aplica bonos ni beneficios
    }
}

