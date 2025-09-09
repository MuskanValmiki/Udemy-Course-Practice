class Computer{
    public void playMusic(){
        System.out.println("Music Playing.");
    }

    public String getMePen(int cost){
        // if(cost >= 10)
        //     return "Pen";
        // else
        //     return "Nothing";
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class Q3 {
    public static void main(String args[]){
        Computer comp = new Computer();
        comp.playMusic();
        // String str = comp.getMePen(2);
        String str = comp.getMePen(10);
        System.out.println(str);
    }
}
//methods
//classes have data and behavior we can do this with the 
//help of method
