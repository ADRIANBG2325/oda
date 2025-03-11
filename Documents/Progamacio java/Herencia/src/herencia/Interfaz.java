package herencia;



import static herencia.Ventanas.usu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener{
    JPanel panel;
    static String usu,pass;
      JTextField usuario,jtusuario;
    JPasswordField password,pspassword;
    JOptionPane mensaje;
    public static void main(String []args){
        Interfaz obj=new Interfaz(); 
    }
    public Interfaz (){
     
        add(ingresarUsuario());
        add(Contraseña());
        
        add(jtaUsuario());
        add(jpfContraseña());
        inicializador();    
         usuario = new JTextField (2);
usuario.addActionListener( this);
password=new JPasswordField(15);
password.addActionListener(this);
add(usuario);
add(password);
    }
    private void inicializador (){
        setSize(400,200);
    setLayout(null);
    setTitle("login");
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JLabel ingresarUsuario(){
        JLabel usuario=new
                JLabel("nombre de usuario");
        usuario.setBounds(30,30,200,20);
       return usuario;
    }
    private JLabel Contraseña(){
        JLabel contraseña =new
         JLabel("Contraseña");
        contraseña.setBounds(30,80,200,20);
                return contraseña;        
    }
    public JTextField jtaUsuario(){
        JTextField usuario =newJTextField();
        usuario.setBounds(200,30,150,20);
        usuario.setToolTipText("ingrerse de nombrede usuario");
        return usuario;
    }
    /*public JPanel componentes(){
   panel = new JPanel();
    panel.setLayout(null);
    this.getContentPane() .add(panel);
    JLabel etiqueta = new JLabel("ingresa tu usuarioo y contraseña");
    etiqueta.setBounds(10,10,400,200);
    panel.add(etiqueta);
    etiqueta.setFont(new Font("chiller",3,30));
    return panel;*/

   private JPasswordField jpfContraseña(){
    JPasswordField contraseña =new JPasswordField();
contraseña.setBounds(200,80,150,20);
contraseña.setEchoChar('-');
contraseña.setToolTipText("ingrese contraseña");
return contraseña;
}
    public void actionPerformed(ActionEvent e){
        usu=usuario.getText();
        pass=password.getText();
        
        if(usu.equals("")|| pass.equals("")){
            mensaje.showMessageDialog(null,"tienes que llenar todos los datos ");
        }else if(usu.equals("abg")&& pass.equals("123")){
            
         //   Bienvenido b =new Bienvenido ();
            Final obj= new Final();
            
            
                    
        }else{
            mensaje.showMessageDialog(null,"usuario o contraseña incorrectos");{   
        }
            
        }
    }
}