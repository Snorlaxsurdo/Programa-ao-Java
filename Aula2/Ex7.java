package Aula2;

import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        String s,resultado;
        resultado="";
        char milhar,centena,dezena,unidade;
        s= JOptionPane.showInputDialog("Digite a milhar:");
        milhar=s.charAt(0);
        s= JOptionPane.showInputDialog("Digite a centena:");
        centena=s.charAt(0);
        s= JOptionPane.showInputDialog("Digite a dezena:");
        dezena=s.charAt(0);
        s= JOptionPane.showInputDialog("Digite a unidade:");
        unidade=s.charAt(0);
        resultado = new StringBuilder().append(milhar).append(centena).append(dezena).append(unidade).toString();
        JOptionPane.showMessageDialog(null,resultado);
    }
    
}
