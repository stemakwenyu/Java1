
public class App {

   
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle();
        car cr = new car();
        
        Vehicle veh2 =  cr;
        
        veh2.design();
        cr.ride();
        
    }
    
}
