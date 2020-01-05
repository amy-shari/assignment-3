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
    
        private double litrePer100km = 0.0;         // this is the litres per 100km
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
    * ****************************************/
        public Car(int litrePer100km, int nFuelInTank){
            this.litrePer100km = litrePer100km;
            this.nFuelInTank = nFuelInTank;
        }
    //*** Getters ***
    
       /*****************************************
        * Description: gets the amount of fuel in tank
        * 
        * @return nFuelInTank : int, amount of fuel in tank
        * 
        * ****************************************/
            public int getFuelLevel(){                
                return this.nFuelInTank;
            } 
            
        /*****************************************
        * Description: gets the litre per 100km
        * 
        * @return litrePer100km : double, gets litres per 100km
        * 
        * ****************************************/
            public double getKPL(){                
                return this.litrePer100km;
            } 
            
        /*****************************************
        * Description: gets the litre per 100km
        * 
        * @return distanceToEmptyTank : double, gets the amount of litres until tank is empty
        * 
        * ****************************************/
            public double getDistance(){
                double distanceToEmptyTank = 0.0;   // distance until tank is empty

                distanceToEmptyTank = this.nFuelInTank / this.litrePer100km * 100;
                
                return distanceToEmptyTank;
            }  // end getDistance
        
    //*** Setters ***
    
        /*****************************************
        * Description:  sets the amount of fuel in tank
        * 
        * Interface:
        * 
        * @param        nFuelInTank: int, n amount of fuel in tank
        *****************************************/
            public void gasUp(int nFuelInTank){
                this.nFuelInTank = nFuelInTank;
            } // end gasUp 
            
        /*****************************************
        * Description:  sets the KPL
        * 
        * Interface:
        * 
        * @param        litrePer100km: double, the fuel efficiency measure in KPL
        *****************************************/
            public void setKPL(double litrePer100km){
                this.litrePer100km = litrePer100km;
            } // end gasUp  
            
        /*****************************************
        * Description:  sets fuel level when you drive
        * 
        * Interface:
        * 
        * @param        distanceDriven: int, the amount of distance driven
        *****************************************/
            public void drive(int distanceDriven){
                int fuelUsed = 0;           // the amount of fuel used
                fuelUsed = (int) (distanceDriven / 100 * litrePer100km);  // equation to calculate fuel used
                nFuelInTank = nFuelInTank - fuelUsed;       // calculates the updated fuel in tank
            } // end gasUp     
            
} // end of public class
