import  javax .swing. JOptionPane; 
public class SuperC {
public void bienvenido  (){

    JOptionPane.showMessageDialog(null,"Bienvenido "+ Datos()+ " A esta super class veremos como se utiliza la herencia en java ");
}
private String Datos (){
    
    String a;
    a=String.valueOf(JOptionPane.showInputDialog("dame tu nombre "));
    
    return a;
}
}