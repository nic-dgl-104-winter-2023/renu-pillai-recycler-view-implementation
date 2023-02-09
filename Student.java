import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class Student 
{
    private String name,id,subject;
    
    
    public Student(String name,String id, int subject)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
    
    }

    public String getDetails() 
    { 
        return name+" "+id+" "+subject; 
    }
  
  
  public static void main(String[] args) throws FileNotFoundException {
      String name ,id,subject;
      Scanner fileInput = new Scanner(new File("data.txt"));
      while (fileInput.hasNextLine())
      {
          name = fileInput.next();
          id = fileInput.next();
          subject = fileInput.next();
        
          Student st = new Student(name,id,subject);
          st.getDetails();
      }
  }
  
}