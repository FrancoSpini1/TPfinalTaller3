package franco.tp.medico;

import java.io.*;
import java.util.*;

public class Medico {
    private Map<String, String> medico = new HashMap<>(); // Inicialización directa
    private final String ArchivoMedicos = "medicos y especialidades.txt";

    // Método para obtener el mapa de médicos y especialidades
    public Map<String, String> getMedico() {
        if (medico.isEmpty()) {
            cargarMedicosDesdeArchivo();
        }
        return medico;
    }

    // Método privado para cargar datos desde el archivo
    private void cargarMedicosDesdeArchivo() {
        File archivo = new File(ArchivoMedicos);

        if (!archivo.exists()) {
            System.out.println("El archivo " + ArchivoMedicos + " no existe.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String especialidad = partes[1].trim();
                    medico.put(nombre, especialidad);
                } else {
                    System.out.println("Línea mal formada: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + ArchivoMedicos + ": " + e.getMessage());
        }
    }
}
