
package messagedialog;
import javax.swing.JOptionPane;

public class MessageDialog {

   
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null,"hellow world");
        int choice=JOptionPane.showConfirmDialog(null,"Do you want quit?","Quit",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            String firstName=JOptionPane.showInputDialog(null,"Enter your Email Name :");
        String Password=JOptionPane.showInputDialog(null,"Enter your Password");
        String a="2";
        if(Password==a){
            JOptionPane.showMessageDialog(null,"Welcome");
        }
        else{
             JOptionPane.showMessageDialog(null,"wrong password","warning",JOptionPane.ERROR_MESSAGE);
        }
        }
        
       
    }
    
}
