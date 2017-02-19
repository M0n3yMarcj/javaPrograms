/*Marcus Mitchell
2/16/2017 GEEN 163
I am suppose to build a program that gently lands a rockets by 
adding a throttle method. 
*/


public class MyGame extends Lander {
       public double throttle(double altitude, double speed, double fuel){
       
              double burn = 0.0; //0 to 100, rate to burn the fuel
               
              if (altitude <= 5200 && speed > 300){ 
              
              burn = 15;
              }else if (altitude <= 4000 || speed <= 150){
              
              burn = 21.95;
              }else if (speed >50 || altitude <= 2700){
              
              burn = 14.50003;
              }
               
              
              return burn; 
      
      
       }


      public static void main(String [] oskie){
             MyGame program = new MyGame();
      
      }

}