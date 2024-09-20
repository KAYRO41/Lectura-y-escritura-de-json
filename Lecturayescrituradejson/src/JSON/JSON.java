package JSON;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraJSON {
    public static void main(String[] args) {
        // Crear un objeto JSON
        JSONObject producto = new JSONObject();
        producto.put("id", 101);
        producto.put("nombre", "Camiseta");
        producto.put("precio", 19.99);

        // Crear un arreglo JSON
        JSONArray tallas = new JSONArray();
        tallas.put("S");
        tallas.put("M");
        tallas.put("L");

        // Añadir el arreglo al objeto JSON
        producto.put("tallasDisponibles", tallas);

        // Escribir el objeto JSON en un archivo
        try (FileWriter file = new FileWriter("producto.json")) {
            file.write(producto.toString(4)); // 4 para la indentación
            System.out.println("Archivo JSON escrito con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
