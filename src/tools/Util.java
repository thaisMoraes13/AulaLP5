/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07431666128
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
        
    }
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            //instanceof limpar feito com isso
            if (componentes[i] instanceof JTextField) {
            ( (JTextField) componentes[i]).setText("");
            
        }
             if (componentes[i] instanceof JComboBox) {
            ( (JComboBox) componentes[i]).setSelectedIndex(-1);
            
        }
    }
    }
    public static void mensagem(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
    }
    
    public static boolean perguntar(String cad) {
        //se ele pressionou no sim é true, se não é false
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
    //static para nao instanciar a classe
    public static int strToInt(String num){
        return Integer.valueOf(num); //classe sapinho
    }
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    public static double intToDouble(String num) {
        return 0;
    }
    public static String intToStr(double num) {
        return "";
    }
    public static Date strToDate(String data) {
        return null;
    }
    public static String dateToStr(Date data){
        return "";
    }
    
    // primeiro commit - Pacotes tools e view. Util.java finalizado.
    // segundo commit - Tela principal e Telas dos cadastros finalizados
    //terceiro commit - Telas de cadasto usando o Util.java
    
}
