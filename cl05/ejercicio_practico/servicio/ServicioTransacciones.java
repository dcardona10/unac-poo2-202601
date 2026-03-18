package ejercicio_practico.servicio;

import ejercicio_practico.dominio.*;
import ejercicio_practico.exception.PINIncorrectoException;

public class ServicioTransacciones {

    public void validarUsuario(Tarjeta tarjeta, String pin) throws PINIncorrectoException {
        if (!pin.equals(tarjeta.getPin())) {
            throw new PINIncorrectoException("El PIN ingresado es incorrecto.");
        }
    }
    
    public void realizarTransaccion(Transaccion transaccion) {
        // Lógica para realizar una transacción entre cuentas o tarjetas
    }
}
