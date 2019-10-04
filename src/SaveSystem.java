import java.util.ArrayList;
import java.util.List;

public class SaveSystem {

     //it may be db,or file system - > it will be only one for all system

    private static SaveSystem instance = new SaveSystem();

    private List<Something> info;

    public static SaveSystem  getSaveSistem(){
        return instance;
    }

    private SaveSystem(){
        info = new ArrayList<>();
    }

    public List<Something> getInfo(){
        return info;
    }




}
