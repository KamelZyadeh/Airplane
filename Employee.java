package kamel;

public class Employee extends Human implements Epam {

    public void Developer(){
        System.out.println("Im a c-sharp developer");
    }
    public void Janitor(){
        System.out.println("Im a janitor");
    }


    public double salary;
    public int ID;
    public String position;
}
