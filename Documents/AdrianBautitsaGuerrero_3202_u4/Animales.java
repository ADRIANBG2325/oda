package zoologico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;
public final class Animales extends JFrame {
    int f,x,g,tol,numA;
     String m,l,c,d;
      //String jirafa = null;
      int jirafa,pandas,tigre,lion,tortuga,dinosaulo;
     byte r;
                //String tigre = null;
                byte criasj,criasp,criast,criasto,criasl,criasd;
    // String con=null;
     byte con=0,vacj,vact,vacup,vacl,vacto,vacd,tolv; 
     JTextField [] cri;
     byte crias []=new byte  [2];
     byte cria[]=new byte[3];
    public static void main(String[] args) {
       
        
                  Animales a = new Animales();
                  

    }
    
    
    public  Animales(){
             
        
         
            Panel();
        
           // oda();
           
           
    }
    @SuppressWarnings("empty-statement")
    public void Panel(){
         String til[]={"Ani", "crias", "vacunas", "total"};
        byte k=0;
        try{
        f=Integer.parseInt(JOptionPane.showInputDialog("cuantos tipos de animales son. Minimo 3,Maximo 6"));
        int t,s;
          //throw new IllegalArgumentException("El número de tipos de animales debe estar entre 3 y 6.");
                  
           }catch(ArithmeticException ae){
               System.out.print(("error al ingresar numero"));
           }
           switch (f){
               case 3:
            jirafa=Byte.parseByte(JOptionPane.showInputDialog("numero de jirafas"));
              pandas =Byte.parseByte(JOptionPane.showInputDialog("Numero de pandas"));
            tigre=Byte.parseByte(JOptionPane.showInputDialog("Numero de tigres"));   
            
            
                    numA=jirafa+tigre+pandas;
                  do{
                  r=Byte.parseByte(JOptionPane.showInputDialog("tipo de cria"));  
                   
                  if (r==1){
                      for (f=0;f==criasj;){
                      criasj=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de jirafa")); 
                      
                       vacj = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                     
                 
                      }
                     
        
                  }else
                      if(r==2){
                          for (f=0;f==criasp;){
                      criasp=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de pandas")); 
                      
                       vacup = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                          }
                      }else 
                          if (r==3){
                             for (f=0;f==criast;){
                      criast=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tigre")); 
                      
                       vact = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                             }
                          }
                   tol=criasj+criasp+criast;
                 con = Byte.parseByte(JOptionPane.showInputDialog("continuar"));
            }while (con==1);
                 
                  for (k=0;k<4;k++){
                      System.out.print(til[k]+"\t");
                  }
                  System.out.print("\n");
             tolv=(byte) (vacj+vacup+vact);
             System.out.print(numA+"\t"+tol+"\t"+tolv );
                  break;
                                    

                  
                  
                  
           
                  
                 
  
              
            
               case 4:
              try{
                  
               
           
                jirafa=Byte.parseByte(JOptionPane.showInputDialog("numero de jirafas"));
              pandas =Byte.parseByte(JOptionPane.showInputDialog("Numero de pandas"));
            tigre=Byte.parseByte(JOptionPane.showInputDialog("Numero de tigres"));   
            tortuga=Byte.parseByte(JOptionPane.showInputDialog("numero de tortugas"));
              }catch(NumberFormatException nfe){
                 System.out.print("tipo de formato erroneo");
                 }
             numA=jirafa+tigre+pandas+tortuga;
              do{
                  r=Byte.parseByte(JOptionPane.showInputDialog("tipo de cria"));  
                   
                  if (r==1){
                      for (f=0;f==criasj;){
                      criasj=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de jirafa")); 
                      
                       vacj = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                     
                 
                      }
                     
        
                  }else
                      if(r==2){
                          for (f=0;f==criasp;){
                      criasp=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de pandas")); 
                      
                       vacup = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                          }
                      }else 
                          if (r==3){
                             for (f=0;f==criast;){
                      criast=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tigre")); 
                      
                       vact = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                             }
                          }else
                              if(r==4){
                                  criasto=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tortuga")); 
                      
                       vacto = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                              }
                                  
                   tol=criasj+criasp+criast+criasto;
                 con = Byte.parseByte(JOptionPane.showInputDialog("continuar"));
            }while (con==1);
                 
                  for (k=0;k<4;k++){
                      System.out.print(til[k]+"\t");
                  }
                  System.out.print("\n");
             tolv=(byte) (vacj+vacup+vact+vacto);
             System.out.print(numA+"\t"+tol+"\t"+tolv );
            
            
            
            
            
            
            
            
            break;
               case 5:
                
                   
                     jirafa=Byte.parseByte(JOptionPane.showInputDialog("numero de jirafas"));
              pandas =Byte.parseByte(JOptionPane.showInputDialog("Numero de pandas"));
            tigre=Byte.parseByte(JOptionPane.showInputDialog("Numero de tigres"));   
            tortuga=Byte.parseByte(JOptionPane.showInputDialog("numero de tortugas"));
            lion=Byte.parseByte(JOptionPane.showInputDialog("numero de leones"));
            numA=jirafa+tigre+pandas+tortuga+lion;
              do{
                  r=Byte.parseByte(JOptionPane.showInputDialog("tipo de cria"));  
                   
                  if (r==1){
                      for (f=0;f==criasj;){
                      criasj=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de jirafa")); 
                      
                       vacj = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                     
                 
                      }
                     
        
                  }else
                      if(r==2){
                          for (f=0;f==criasp;){
                      criasp=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de pandas")); 
                      
                       vacup = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                          }
                      }else 
                          if (r==3){
                             for (f=0;f==criast;){
                      criast=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tigre")); 
                      
                       vact = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                             }
                          }else
                              if(r==4){
                                  criasto=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tortuga")); 
                      
                       vacto = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                              }else
                                   if (r==5){
                                     criasl=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de leon")); 
                      
                       vacl = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS"));   
                                   }
                                  
                   tol=criasj+criasp+criast+criasto+criasl;
                 con = Byte.parseByte(JOptionPane.showInputDialog("continuar"));
            }while (con==1);
                 
                  for (k=0;k<4;k++){
                      System.out.print(til[k]+"\t");
                  }
                  System.out.print("\n");
             tolv=(byte) (vacj+vacup+vact+vacto+vacl);
             System.out.print(numA+"\t"+tol+"\t"+tolv );
             break;
               case 6:
                   
                        jirafa=Byte.parseByte(JOptionPane.showInputDialog("numero de jirafas"));
              pandas =Byte.parseByte(JOptionPane.showInputDialog("Numero de pandas"));
            tigre=Byte.parseByte(JOptionPane.showInputDialog("Numero de tigres"));   
            tortuga=Byte.parseByte(JOptionPane.showInputDialog("numero de tortugas"));
            lion=Byte.parseByte(JOptionPane.showInputDialog("numero de leones"));
            dinosaulo=Byte.parseByte(JOptionPane.showInputDialog("numero de dinosaurios"));
             numA=jirafa+tigre+pandas+tortuga+lion+dinosaulo;
                        
              do{
                  r=Byte.parseByte(JOptionPane.showInputDialog("tipo de cria"));  
                   
                  if (r==1){
                      for (f=0;f==criasj;){
                      criasj=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de jirafa")); 
                      
                       vacj = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                     
                 
                      }
                     
        
                  }else
                      if(r==2){
                          for (f=0;f==criasp;){
                      criasp=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de pandas")); 
                      
                       vacup = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                          }
                      }else 
                          if (r==3){
                             for (f=0;f==criast;){
                      criast=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tigre")); 
                      
                       vact = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                             }
                          }else
                              if(r==4){
                                  criasto=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de tortuga")); 
                      
                       vacto = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS")); 
                      
                              }else
                                   if (r==5){
                                     criasl=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de leon")); 
                      
                       vacl = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS"));   
                                   }else
                                       if(r==6){
                                           criasd=Byte.parseByte(JOptionPane.showInputDialog("numero de crias de dinosaulo")); 
                      
                       vacd = Byte.parseByte(JOptionPane.showInputDialog("numero de VACUNAS"));  
                                       }
                                  
                   tol=criasj+criasp+criast+criasto+criasl+criasd;
                 con = Byte.parseByte(JOptionPane.showInputDialog("continuar"));
            }while (con==1);
                 
                     try{
                 
                  for (k=0;k==4;k++){
                      System.out.print(til[k]+"\t");
                  }
                     }catch(ArithmeticException ae){
                         System.out.print("error con el arreglo");
                         
                     }
                  System.out.print("\n");
             tolv=(byte) (vacj+vacup+vact+vacto+vacl+vacd);
             System.out.print(numA+"\t"+tol+"\t"+tolv );
                  break;
               default:
           
           }
           }
    }



   

    
    

