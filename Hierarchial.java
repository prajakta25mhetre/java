class Engineering{
    void displayClgName(){
        System.out.println("this departmen is from ICMS");
    }
}
class Computer extends Engineering{
    void Compdisplay(){
        System.out.println("computer display");
    }
}
class Mechanical extends Engineering{
    void Mecdisplay(){
        System.out.println("Mechnical display");
    }
}
class Civil extends Engineering{
    void Civdisplay(){
        System.out.println("Civil display");
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.displayClgName();
        comp.Compdisplay();
        
        Mechanical mec = new Mechanical();
        mec.displayClgName();
        mec.Mecdisplay();

        
    }
    
}
