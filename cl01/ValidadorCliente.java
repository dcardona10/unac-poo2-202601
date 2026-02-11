public class ValidadorCliente {
    
    static boolean validarTelefono(Cliente cliente) {
        if (cliente.getTelefono() == null || cliente.getTelefono().isEmpty()) {
            return false;
        }
        if (!cliente.getTelefono().matches("\\d{10}")) {
            return false;
        }
        return true;
    }

    static boolean validarEmail(Cliente cliente) {
        if (cliente.getEmail() == null || cliente.getEmail().isEmpty()) {
            return false;
        }
        if (!cliente.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return false;
        }
        return true;
    }
}
