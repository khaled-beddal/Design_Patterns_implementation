package Abstract_Factory_example_01.Form.Windows;
import Abstract_Factory_example_01.Form.Component;

public class CheckboxWin implements Component{
    @Override 
    public void show(){
        System.out.println("CheckboxWin");
    }
}