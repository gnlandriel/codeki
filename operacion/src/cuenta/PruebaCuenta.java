package cuenta;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.crearCuenta();
        cuenta1.ingresar(1000);
        cuenta1.retirar(1000);
        cuenta1.extraccionRapida(300);
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();
    }
}
