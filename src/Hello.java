public class Hello {
public String string;
public Integer integer;
public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.format( "Hello %s you are %d years old.\n","Memis",32);
        int myFirstNumber = (10+5)+(2*10);
        System.out.println(myFirstNumber);
        int mySecondNumber=12,myThirdNumber=6;
        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;
         System.out.format("myTotal is %d \n",myTotal);
  int myLastOne = 1000-myTotal;
    System.out.format("myLastOne is %d \n",myLastOne);
}
}
