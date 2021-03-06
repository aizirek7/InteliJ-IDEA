package newInterface;

public class Animal implements GetInfo{
    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void eating(){
        System.out.println("I'm eating");
    }

    @Override
    public void getInfo() {
        System.out.println("My id: " + id);
    }
}
