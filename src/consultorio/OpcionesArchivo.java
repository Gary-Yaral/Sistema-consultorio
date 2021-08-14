
package consultorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class OpcionesArchivo {
    int contador = 0;
    public void eliminar(String ruta){
        File archivo = new File(ruta);
        if(archivo.exists()){
            if(archivo.delete()){
                JOptionPane.showMessageDialog(null,"Se elimino");
            }
        }    
    }
    
    public int calcularSiguienteIndice(String ruta){
        FileReader fr= null;
        BufferedReader br = null;
        String linea = "";
        try{
            fr = new FileReader(ruta);
            br =new BufferedReader(fr);
            ArrayList datos = new ArrayList();
            while((linea = br.readLine()) != null){        
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");
                int i = 0;
                Object[] indices = new Object[9];
                while(cadenaDeTexto.hasMoreTokens()){
                    String token = cadenaDeTexto.nextToken();
                    indices[i] = token;
                    i++;
                }
                
                datos.add(indices[0]);
                
            }
            
            int ultimoIndice = datos.size() - 1;
            String contadorInterno = String.valueOf(datos.get(ultimoIndice));
            int contador = Integer.valueOf(contadorInterno) + 1;
            return contador;
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no fué encontrado al contar registros");
        }catch(IOException e){
              System.out.println("Error al contar registros: " + e.getMessage());  
        }  finally{
            try{
                br.close();
            }catch(IOException e){
                System.out.println("Error al contar registros: " + e.getMessage());
            }
        }
        return 0;
    }
    
    public void cambiarNombre(String rutaNueva,String rutaVieja){
        File archivoAnterior = new File(rutaVieja);
        File archivoNuevo = new File(rutaNueva);
        if(archivoAnterior.exists() && archivoNuevo.exists()){
            if(archivoAnterior.delete()){ 
                if(archivoNuevo.renameTo(archivoAnterior)){
                    JOptionPane.showMessageDialog(null,"Hemos eliminado la cita");
                }
            }
        }
    }
    
    public void modificar(String ruta, String temporal, String id){
        FileReader fr= null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String linea;
        
        try{
            fr = new FileReader(ruta);
            fw = new FileWriter(temporal);
            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);
            String lectura = "";
            String contenido = "";
            while((linea = br.readLine()) != null){
                int i = 0;
                Object[] datos = new Object[9];
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");
                
                while(cadenaDeTexto.hasMoreTokens()){
                    String token = cadenaDeTexto.nextToken();
                    datos[i] = token;
                    i++;
                }
                
                if(!datos[0].equals(id)){
                    bw.write(linea);
                    bw.flush();
                    bw.newLine();
                }
            }           
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }catch(IOException e){
           System.out.println("Error encontrado: "+ e.getMessage());
        }finally{
            try{
                br.close();
                bw.close();
                
               
            }catch(IOException e){
                System.out.println("Error al cerrar buffer: "+ e.getMessage());
            }
        }
    }
    
    public void eliminarRegistro(String ruta, String temporal, String id){
        String indiceSiguiente = String.valueOf(calcularSiguienteIndice(ruta));
        if(!id.equals(indiceSiguiente)){
            modificar(ruta, temporal, id);
            cambiarNombre(temporal,ruta);
        }else{
            JOptionPane.showMessageDialog(null,"Debes seleccionar una cita");
        }
    }
    
}
