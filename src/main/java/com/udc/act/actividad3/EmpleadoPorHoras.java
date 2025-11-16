package com.udc.act.actividad3;

public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    private double horasTrabajadas;
    private int aniosEnEmpresa;
    private boolean aceptaFondoAhorro;

    public EmpleadoPorHoras(String nombre, double tarifaHora, double horasTrabajadas, int aniosEnEmpresa, boolean aceptaFondoAhorro) {
        super(nombre);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
        this.aniosEnEmpresa = aniosEnEmpresa;
        this.aceptaFondoAhorro = aceptaFondoAhorro;
    }

    @Override
    public double calcularSalarioBruto() {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        double horasBase = Math.min(horasTrabajadas, 40);
        double horasExtra = Math.max(horasTrabajadas - 40, 0);
        return (horasBase * tarifaHora) + (horasExtra * tarifaHora * 1.5);
    }

    @Override
    public double calcularBeneficios() {
        // No hay bonos, pero puede haber fondo de ahorro (no se suma al neto)
        return 0;
    }

    @Override
    public double calcularDeducciones(double bruto) {
        double deducciones = super.calcularDeducciones(bruto);
        if (aniosEnEmpresa > 1 && aceptaFondoAhorro) {
            deducciones += bruto * 0.02; // Fondo de ahorro voluntario
        }
        return deducciones;
    }
}