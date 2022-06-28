package datos;
import java.io.*;

public class DatosEstudiantes {
    public void lectorArchivo(){
        FileReader archivo;
        BufferedReader lector;
        try {
            archivo=new FileReader("C:\\Users\\Esteban Saez\\Desktop\\ICC264.txt");
            if(archivo.ready()){
                lector=new BufferedReader(archivo);
                String cadena;
                while ((cadena=lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("El archivo no se puede visualizar");
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static String[] rutDesplegables(){
        String datos = leerArchivo();
        String[] ruts= {"", "20583773619", "20968025420", "22456736720", "21029594120", "20886090920", "19809314918", "20787295420",
        "20919321320", "20081365019", "20584002819", "20302902019", "20652598319","20915656320", "20079931318", "20617429319","20923634620", "20366482618"};
        return ruts;
    }

    public static String leerArchivo() {
        String direccionArchivo = "C:\\Users\\Esteban Saez\\Desktop\\ICC264.txt";
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return textoArchivo;
    }
}