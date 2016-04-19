
package MB;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author CAEN
 */
@ManagedBean
@RequestScoped
public class MBSubeArchivo {

//    private UploadedFile file;
// 
//    public UploadedFile getFile() {
//        return file;
//    }
// 
//    public void setFile(UploadedFile file) {
//        this.file = file;
//    }
//     
//    public void upload() {
//        if(file != null) {
//            
//          try (InputStream input = file.getInputstream()) {
//        Files.copy(input, new File("/", file.getFileName()).toPath());
//      
//            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
//            FacesContext.getCurrentInstance().addMessage(null, message);
//        
//    }
//    catch (IOException e) {
//         FacesMessage message = new FacesMessage("Is NOT Succesful", file.getFileName() + " is not uploaded.");
//            FacesContext.getCurrentInstance().addMessage(null, message);
//    }    
//        
//        
//        
//        }
//    }
//    
    
   
    
      private final String destination="C:\\Users\\INE\\Desktop\\";
 
    public void upload(FileUploadEvent event) {  
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
             FacesMessage message = new FacesMessage("Is NOT Succesful", event.getFile().getFileName() + " is not uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
 
    }  
 
    public void copyFile(String fileName, InputStream in) {
           try {
               OutputStream out = new FileOutputStream(new File(destination + fileName));
              
                int read = 0;
                byte[] bytes = new byte[1024];
              
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                in.close();
                out.flush();
                out.close();
              
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }
    
    
}
