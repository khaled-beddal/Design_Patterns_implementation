package Abstract_Factory_example_01.Form.Factory;
import Abstract_Factory_example_01.Form.Component;
import Abstract_Factory_example_01.Form.Mac.ButtonMac;
import Abstract_Factory_example_01.Form.Mac.CheckboxMac;
import Abstract_Factory_example_01.Form.Mac.TextFieldMac;


public class MacFactory implements AbstractFactory{
    @Override
    public Component createButton(){
        return new ButtonMac();
    }
    @Override
    public Component createTextField(){
        return new TextFieldMac();
    }
    @Override
    public Component createCheckBox(){
        return new CheckboxMac();
    }
}
