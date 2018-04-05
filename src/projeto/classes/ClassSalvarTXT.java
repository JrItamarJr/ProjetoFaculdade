
package projeto.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ClassSalvarTXT {
    
    
     private String user;

         public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    public String Salvar(){
        
         try {
             FileWriter fw = new FileWriter("login.txt");
             PrintWriter pw = new PrintWriter(fw);
             pw.print(this.user);
             pw.flush();
             pw.close();
             fw.close();
             
             
         } catch (IOException ex) {
         }
        
        return null;
    }


       
    
}
