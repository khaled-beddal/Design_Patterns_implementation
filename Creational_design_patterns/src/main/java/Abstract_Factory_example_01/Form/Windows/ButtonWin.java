package Abstract_Factory_example_01.Form.Windows;
import Abstract_Factory_example_01.Form.Component;

public class ButtonWin implements Component{
    @Override 
    public void show(){
        System.out.println("ButtonWin");
    }
}
