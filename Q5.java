class Calculator{
    int num = 5;
    public int add(int n1, int n2){
        System.out.println(num);
        return n1 + n2;
    }
}

public class Q5 {
    public static void main(String args[]){
        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
//stack and heap
//last in first out called stack memory.
//every method have there own stack.
//stack have two column and multiple rows.