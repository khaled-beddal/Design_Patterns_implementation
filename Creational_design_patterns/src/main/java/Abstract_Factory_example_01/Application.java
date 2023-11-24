package Abstract_Factory_example_01;

import Abstract_Factory_example_01.Form.Component;
import Abstract_Factory_example_01.Form.Factory.AbstractFactory;

public class Application {
    
    public void run(AbstractFactory factory) {
        Component button    = factory.createButton();
        Component textField = factory.createTextField();
        Component checkbox  = factory.createCheckBox();

        button.show();
        textField.show();
        checkbox.show();
    }
}
