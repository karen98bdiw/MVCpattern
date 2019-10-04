public class Controller {

    View view = new View();
    Model model = new Model();

    public void execute(){
        model.addSomething("first");
        model.addSomething("second");

        for (int i = 0 ; i < model.getSomethings().size();i++){
            view.showSomething(model.getSomethings().get(i));
        }
    }

}
