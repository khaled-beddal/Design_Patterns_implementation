package Abstract_Factory_example_01.Form.Windows;
import Abstract_Factory_example_01.Form.Component;

public class TextFieldWin implements Component{
    @Override 
    public void show(){
        System.out.println("TextFieldWin");
    }
}