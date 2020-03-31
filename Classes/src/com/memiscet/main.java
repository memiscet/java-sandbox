package com.memiscet;

public class main {
    public static void main(String[] args) {

        Car porche = new Car();
        porche.setColor("Blue");
        porche.setDoors( 4 );
        porche.setEngine( "V8" );
        porche.setModel( "Carrera" );
        porche.setWheels( 4 );
        porche.setId( 1 );

        Car lambo = new Car();
        lambo.setColor("Blue");
        lambo.setDoors( 4 );
        lambo.setEngine( "V8" );
        lambo.setModel( "Carrera" );
        lambo.setWheels( 4 );
        lambo.setId( 2 );
        System.out.println(porche.equals( porche ));

    }
}
