import javax.print.event.PrintEvent;

public class abcd {

public static void main(String[] args) {

    rectangle r = new rectangle();
    r.read(10.200);
    r.show();
    r.getPI();
    
    circle c = new circle();
    c.read(10.200);
    c.show();
    c.getPI();
    
}

}

abstract class shape{

    Double rectangle;
    Double circle;
    Double Pi = 3.14;
    abstract void getPI();  
}
        
        class rectangle extends shape{
            
            public void read (Double rectangle) {
                this.rectangle = rectangle; 
            }
            public void show(){
                System.out.print("area of rectangle = ");
            }
            void getPI(){

                System.out.println(2*Pi*rectangle);
            }
            
        }
        
        class circle extends shape{
            
            public void read (Double circle) {
                this.circle = circle; 
            }
            public void show(){
                System.out.print("Area of circle = ");
                
            }
            
            void getPI(){
        
                System.out.println(Pi*circle*circle);
            }
        }