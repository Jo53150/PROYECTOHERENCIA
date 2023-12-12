package model;

public class Conserje extends Trabajador {

    public Conserje(int idTrabajador, String nombre, String apellido, int antiguedad, int ht) {
        super(idTrabajador, nombre, apellido, antiguedad, ht);
    }

    public Conserje() {
    }
    
    private double sueldo;
    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() * 10;
        return this.sueldo;
    }
}
