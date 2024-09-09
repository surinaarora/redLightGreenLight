/*
@Author: Surina Arora 
@Date: October 31 2023 
@Description: Depending on the traffic conditions at an intersection, 
this program declares whether or not you are able to make a left turn, right turn, 
go straight, or have to stop, with specific rules which apply to the day of the week.  
*/

class redLightGreenLight {
   public static void main (String [] args){

//Variable Declaration and Initialization
   
   //flexible, not constant  
   boolean advanceLight = false; 
   boolean greenLight = true; 
   boolean oncomingTraffic = true;
   int dayOfTheWeek = 5;
  
   //constant  
   boolean straight = false;
   boolean right = false; 
   boolean left = false; 
   boolean stop = false; 
   
//Program Output 
   
   System.out.printf("Advanced Light = %s\n", advanceLight);
   System.out.printf("Green Light = %s\n", greenLight);
   System.out.printf("Oncoming traffic = %s\n", oncomingTraffic); 
   System.out.printf("The day of the week is = %d\n", dayOfTheWeek);
   
   System.out.println("==================================="); 
     
//Program Execution 

   //left turns, only allowed mon-fri
   if (dayOfTheWeek == 6 ||dayOfTheWeek == 7){
      left = false; 
   }else{
      left = true;
      
   //left turn with advance light on and off, with conditions 
   if (advanceLight){
      left = true;
   }
   
   else if (advanceLight == false){ 
      if (oncomingTraffic){ 
         left = false; // if there is oncoming traffic, you can not make a left turn 
      }else{
         left = true; // no oncoming traffic, left turn allowed 
      }
   
      if (greenLight){ 
         left = true; // green light, left turn allowed 
      }else{
         left = false; // no green light, left turn not allowed 
      }
     }
   }
       
//right turns, not allowed mon-fri 
   if (dayOfTheWeek >= 1 && dayOfTheWeek <= 5){
      right = false; 
   }else{
      right = true; 
   }
   
   if (greenLight){
      right = true; //green light, make the right turn
   }else{
      right = false; // no green light, can not make the right turn
   }
    
//can go straight if the light is green 
   if (greenLight){
      straight = true;
   } 
   
// if there is a red light, you stop 
   if (advanceLight == false && greenLight == false && oncomingTraffic == false){
      stop = true; 
   }
  
//Program Output

   System.out.printf("You can make a left = %s\n", left); 
   System.out.printf("You can make a right = %s\n", right); 
   System.out.printf("You can go straight = %s\n", straight); 
   System.out.printf("You must stop = %s\n", stop); 
   
   }//end main
}//end program