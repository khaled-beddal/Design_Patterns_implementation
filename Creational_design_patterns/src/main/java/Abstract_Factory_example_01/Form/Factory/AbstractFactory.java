package Abstract_Factory_example_01.Form.Factory;
import Abstract_Factory_example_01.Form.Component;

public interface AbstractFactory {
    public Component createButton(); 
    public Component createTextField(); 
    public Component createCheckBox(); 
}
