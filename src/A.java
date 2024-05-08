
public class A {
    int a, b, c, sum;
    
    public void add (int x, int y){
        a = x;
        b = y;
        sum = x + y;

        System.out.println("The sum of the two numbers is: "+sum);
    }
    
    public void add (int x, int y, int z){
        a = x;
        b = y;
        c = z;
        sum = x + y + z;

        System.out.println("The sum of three numbers is: "+sum);
    }
    public void print(){
        System.out.println("Class A is running");
    }
}
