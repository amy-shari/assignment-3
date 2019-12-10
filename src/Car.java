/********************************************************************
 * Programmer:	Amy Mann
 * Class:  CS30S
 *
 * Assignment: AxQy
 *
 * Description: Class file for the car class
 *	each car object has a fuel efficiency measured in litres per 100 km
 *	each car object has a fuel property, how much gas is in the tank 
 *	measured in litres.
 *	You are to determine what methods are needed and implement  them
 *	in an efficient manner.
**************************************************************************/


// import libraries as needed here

public class Car {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
        private int litrePer100km = 0;         // this is the litres per 100km
        private int nFuelInTank = 0;           // this is the amount of fuel in the tank
        
    //*** Constructors ***
    
    /*****************************************
    * Description: default constructor
    * 
    * ****************************************/
        public Car(){
            this.litrePer100km = 0;        // sets value of litrePer100km to zero
            this.nFuelInTank = 0;          // sets value of nFuelInTank to zero
        }
    /*****************************************
    * Description: initialized constructor
    * 
    * Interface:
    * 
    * @param        litrePer100km : integer, the amount of litres per 100km traveled
    * @param        nFuelInTank : integer, the amount of fuel in the tank
    * 
    * @return       any return value will be noted here
    * ****************************************/
        public Car(int litrePer100km, int nFuelInTank){
            
            this.litrePer100km = litrePer100km;
            this.nFuelInTank = nFuelInTank;
        }
    //*** Getters ***
    
    //*** Setters ***
    
} // end of public class
