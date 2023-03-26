package CreationalDesignPattern.Singleton;

public class Singleton {
    //data member
    static Singleton instance = null;

    //Constructor private
    private Singleton(){

    }

    //
    static Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return instance;
    }

    //Demo Method
    public void sayHello(){
        System.out.println("Singleton Class");
        System.out.println(instance);
    }
}
