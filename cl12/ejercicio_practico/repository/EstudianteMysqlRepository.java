package ejercicio_practico.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ejercicio_practico.domain.Estudiante;

public class EstudianteMysqlRepository implements EstudianteRepository {

    Connection connection;

    public EstudianteMysqlRepository() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/unac_2026_01", "root", "Mysql123#");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void guardar(Estudiante estudiante) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO estudiante VALUES (?, ?)");
            statement.setString(1, estudiante.getId());
            statement.setString(2, estudiante.getNombre());
            statement.executeUpdate();
            System.out.println("Estudiante guardado en base de datos: " + estudiante.getNombre());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Estudiante> buscarTodos() {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM estudiante");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String nombre = resultSet.getString("nombre");
                estudiantes.add(new Estudiante(id, nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    @Override
    public Estudiante buscarPorId(String id) {
        Estudiante estudiante = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM estudiante WHERE id = ?");
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                estudiante = new Estudiante(id, nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiante;
    }
}