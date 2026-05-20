package ejemplo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlClienteRepository implements ClienteRepository {

    @Override
    public void guardar(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unac_2026_01", "root", "Mysql123#");
            PreparedStatement ps = con.prepareStatement("INSERT INTO cliente VALUES (?, ?)");
            ps.setString(1, cliente.getId());
            ps.setString(2, cliente.getNombre());
            ps.executeUpdate();
            System.out.println("Cliente guardado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al guardar el cliente: " + ex.getMessage());
        }
    }
    
}
