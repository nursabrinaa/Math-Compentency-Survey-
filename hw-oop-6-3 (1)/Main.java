public class Main {
    // Application code
    public static void main(String args[]) {
       
        DSchoolList dl = new DSchoolList();
        
        School utp1 = new School();
        utp1.setName("Universiti Teknologi Sabrina");
        dl.addSchool(utp1);
        
        School utp2 = new School();
        utp2.setName("Universiti Teknologi Winwin");
        dl.addSchool(utp2);
        
        dl.display();
    }
    
    
}
