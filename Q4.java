class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2 ){
        return n1 + n2;
    }
}

public class Q4 {
    public static void main(String args[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        // int r2 = obj.add(3,4,7);
        // double r3 = obj.add(5.6, 8);
        System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(r3);
    }
}
//method overloading
//in method overloading we can have same method name but
// different parameters.
//even we have same no of parameters but different data type and 
//same method name called method overloading.
