
package consultorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Horas {
    
    public static void main(String args[]){
        buscarHoras("C:\\Hospital\\Citas.txt","2021-08-15");
    }
    
    public static void buscarHoras(String ruta,String fechaSeleccionada){
        
        BufferedReader br = null;
        FileReader fr = null;
        String linea;
        try{
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            ArrayList horas = new ArrayList();
            while((linea = br.readLine()) != null){
                Object[] datos = new Object[9];
                int i = 0;
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");

                while(cadenaDeTexto.hasMoreTokens()){  
                    String token = cadenaDeTexto.nextToken();
                    datos[i] = token;
                    i++;
                }
                
                if(datos[5].toString().equals(fechaSeleccionada)){
                   horas.add(datos[6].toString());
                }
            }
            
            int longitud = horas.size();
            for(int i = 0; i < longitud; i++){
                System.out.println(horas.get(i));
            }
            
        }catch(IOException e){
            System.out.println("Error al buscar horas disponibles" + e.getMessage());
        }finally{
            try{
                br.close();
            }catch(IOException e){
            System.out.println("Error al buscar horas disponibles" + e.getMessage());
            }
        }
    }
}
