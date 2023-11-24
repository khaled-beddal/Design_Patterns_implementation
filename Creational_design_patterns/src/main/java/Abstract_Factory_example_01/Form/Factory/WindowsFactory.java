package Abstract_Factory_example_01.Form.Factory;
import Abstract_Factory_example_01.Form.Component;
import Abstract_Factory_example_01.Form.Windows.ButtonWin;
import Abstract_Factory_example_01.Form.Windows.CheckboxWin;
import Abstract_Factory_example_01.Form.Windows.TextFieldWin;

public class WindowsFactory implements AbstractFactory{
    @Override
    public Component createButton(){
        return new ButtonWin();
    }
    @Override
    public Component createTextField(){
        return new TextFieldWin();
    }
    @Override
    public Component createCheckBox(){
        return new CheckboxWin();
    }
}
