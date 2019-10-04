import java.util.List;

public class Model {

     private SaveSystem saveSystem = SaveSystem.getSaveSistem();

     public void addSomething(String somethigName){
         Something something = new Something(somethigName);
         saveSystem.getInfo().add(something);
     }

     public List<Something> getSomethings(){
         return saveSystem.getInfo();
     }


}
