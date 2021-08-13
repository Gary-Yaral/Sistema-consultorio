
package consultorio;

import java.io.File;
import java.io.IOException;
public class Archivo {
    /* Propiedad de la clase */
    File archivo;
    
    /*Método para crear un archivo */
    public void crear(String carpeta, String nombreArchivo) throws IOException{
        archivo = new File(carpeta+"/"+nombreArchivo);        
        if(!archivo.exists()){ archivo.createNewFile();}
    }
    
}
