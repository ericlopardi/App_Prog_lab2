/*
 * Eric Lopardi (eif833)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public class Lab2 {

    public static void main( String[] args ) {

        Fleet unitedFederation = new Fleet( "United Federation of Planets" );

        try {
            unitedFederation.loadStarships( "src/data" );

        }catch( Exception e ) {
            // this is a try/catch which will show any errors to the console (more on these in coming weeks!)
            e.printStackTrace();
        }

        System.out.println( unitedFederation );

    }

}