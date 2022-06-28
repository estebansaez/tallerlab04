package launcher;
import guis.VentanaPrincipal;
import guis.VentanaSecundaria;

import javax.swing.*;
public class main {
    public static void main (String args[]){
        VentanaPrincipal v1= new VentanaPrincipal();
        v1.setVisible(true);
        VentanaSecundaria v2 = new VentanaSecundaria();
        v2.setVisible(true);
    }
}
