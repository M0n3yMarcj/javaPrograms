/* Marcus Mitchell
GEEN 163 02/13/2017
Write a program with a GUI that calculates if a ball is thrown at a certain 
angle and speed will it hit a specific target at a random distance. 
*/


import javax.swing.*; 

public class TargetProgram extends javax.swing.JFrame implements 
                           java.awt.event.ActionListener {
   
   double goal = Math.random()*100.0;

   JLabel angle = new JLabel ("Enter the angle to hit at "+ goal);// ask user for angle  
   JTextField degrees = new JTextField();// stores the string user inputs 
   
   JLabel velocity = new JLabel (" Enter the speed");//ask user for the speed
   JTextField speed = new JTextField();// stores the string user inputs 

   
   JButton launch = new JButton ("Throw"); //displays a "Throw" button
   
   JLabel answer = new JLabel();//displays the answer
   
   public TargetProgram (){
      setSize(900, 80);   //sets the frame size 
   
      java.awt.Container pane = getContentPane();
      javax.swing.BoxLayout setup = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.X_AXIS);
      //this statement displayes the text across the x axis
      
      setLayout (setup);
      pane.add(angle);
      pane.add(degrees);
      pane.add(velocity);
      pane.add(speed);
      pane.add(launch);
      pane.add(answer);
   
      
      launch.addActionListener(this); //when pressed, program will run the actionPerformed method
   
      setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); //closes the program
   
      setVisible(true); //this statement allows the user to see the content in the GUI interface
      
         
   }
   
   public void actionPerformed( java.awt.event.ActionEvent oskie){
      double distance, g, radians, Degrees, Speed;//initialized these variables
      g = 32.174; //define what g is
      
      Degrees= Double.parseDouble(degrees.getText()); //converts input from user to a double
   
      Speed = Double.parseDouble(speed.getText()); //converts input from user to a double
   
      radians = Degrees * Math.PI/180;
         
      distance = (Speed*Speed)*(Math.sin(2* radians))/g; 
      
      if (Math.abs(distance - goal) < 0.5) { //if distance - goal is less than 0.5 then "Hit!" will display
         answer.setText("Ball will land at " + distance + " Hit!");
      
      }
      else { //if distance - goal is greater than 0.5 then "Miss :(" will display
         answer.setText("Ball will land at " + distance + " Miss :( ");
            
      }
            
   }   
   
   public static void main(String [] oskie) {
   
      TargetProgram prog = new TargetProgram ();
   
   
   }







}