package ejercicio_practico;

import java.util.List;
import java.util.Scanner;

import ejercicio_practico.domain.Estudiante;
import ejercicio_practico.repository.EstudianteMysqlRepository;
import ejercicio_practico.repository.EstudianteRepository;
import ejercicio_practico.service.EstudianteService;

public class Main {
    
    public static void main(String[] args) {

        EstudianteRepository estudianteRepository = new EstudianteMysqlRepository();
        EstudianteService estudianteService = new EstudianteService(estudianteRepository);

        int opcion = -1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de Estudiantes");

        while(opcion != 0) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante por ID");
            System.out.println("0. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estudiante: ");
                    String id = scan.next();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scan.next();
                    Estudiante nuevoEstudiante = new Estudiante(id, nombre);
                    estudianteService.guardarEstudiante(nuevoEstudiante);
                    System.out.println("Estudiante agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("Lista de Estudiantes:");
                    List<Estudiante> estudiantes = estudianteService.buscarTodosEstudiantes();
                    estudiantes.forEach(est -> System.out.println("ID: " + est.getId() + ", Nombre: " + est.getNombre()));
                    break;
                case 3:
                    System.out.print("Ingrese el ID del estudiante a buscar: ");
                    String eid = scan.next();
                    Estudiante estudiante = estudianteService.buscarEstudiantePorId(eid);
                    if (estudiante != null) {
                        System.out.println("Estudiante encontrado:");
                        System.out.println("ID: " + estudiante.getId() + ", Nombre: " + estudiante.getNombre());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }
}
