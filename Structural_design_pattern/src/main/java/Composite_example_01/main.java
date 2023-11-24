package Composite_example_01;

public class main {
    
    public static void main(String[] args){
        
        ArithmeticExpression firstNum = new NumericOP(1);
     
        ArithmeticExpression addOp = new CompOp(new NumericOP(1), new NumericOP(2), '+');
        ArithmeticExpression miltOp = new CompOp(new NumericOP(3), addOp, '*');
        System.out.println(miltOp.getValue());
        
    }
    
}

abstract class ArithmeticExpression {

    public abstract int getValue();
    
}


class NumericOP extends ArithmeticExpression {
   int value;
   
   public NumericOP (int value){
       this.value = value;
   }
            
   @Override 
   public int getValue(){
       return value;
   }
}


class CompOp extends ArithmeticExpression {
    ArithmeticExpression firstOp;
    ArithmeticExpression secondOp;
    char sign; 
    
    
    public CompOp(ArithmeticExpression firstOp , ArithmeticExpression secondOp , char sign){
        this.firstOp = firstOp;
        this.secondOp = secondOp;
        this.sign = sign;
    }
    
    
    @Override 
    public int getValue(){
        switch(sign) {
            case '+' : 
                return firstOp.getValue() + secondOp.getValue();
                
            case '-' : 
                return firstOp.getValue() - secondOp.getValue();
                
            case '*' : 
                return firstOp.getValue() * secondOp.getValue();
                
            case '/' : 
                return firstOp.getValue() / secondOp.getValue();
               
            default :
                throw new RuntimeException("Unkown sign");
        
        }
    }
        
}