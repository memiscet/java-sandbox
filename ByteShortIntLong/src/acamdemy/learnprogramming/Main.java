package acamdemy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue= 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        int myInt=2_147_483_647;
        System.out.println("Integer Minimum Value ="+myMinIntValue);
        System.out.println("Integer Maximum Value ="+myMaxValue);

        System.out.println("Integer Busted Minimum Value ="+( myMinIntValue-1));
        System.out.println("Integer Busted Maximum Value ="+(myMaxValue+1));
        System.out.format( "myInt is %d ",myInt );
    }
}
