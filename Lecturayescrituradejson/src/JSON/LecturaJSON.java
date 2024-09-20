package JSON;

import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileReader;
import java.io.IOException;

public class LecturaJSON {
    public static void main(String[] args) {
        // Leer el archivo JSON
        try (FileReader reader = new FileReader("producto.json")) {
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject producto = new JSONObject(tokener);

            // Obtener valores del JSON
            int id = producto.getInt("id");
            String nombre = producto.getString("nombre");
            double precio = producto.getDouble("precio");

            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: " + precio);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
