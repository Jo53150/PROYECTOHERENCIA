package model;

public class Funcionario extends Trabajador {

    public Funcionario(int idTrabajador, String nombre, String apellido, int antiguedad, int ht) {
        super(idTrabajador, nombre, apellido, antiguedad, ht);
    }

    public Funcionario() {
    }
    
        private double sueldo;
    
    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() * 25;
        return this.sueldo;
    }
}
