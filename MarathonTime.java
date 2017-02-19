/*Marcus Mitchell 
GEEN 163 2/3/2017
This program displays a GUI interface that calculates the expected time
a person is suppose to complete a marathon after they've entered their
pace time.
*/

public class MarathonTime extends javax.swing.JFrame implements 
                           java.awt.event.ActionListener {
                           
javax.swing.JLabel minutes = new javax.swing.JLabel("Please input the pace minutes "); 
   //statement asks user to input to input pace minutes
   
   javax.swing.JTextField min = new javax.swing.JTextField();
   //this statement holds the string the user inputs 
   
   javax.swing.JLabel seconds = new javax.swing.JLabel("Please input the pace seconds");
   //ask user to input the pace seconds
      
   javax.swing.JTextField sec = new javax.swing.JTextField(); 
   //this statement holds the string the user inputs 

   javax.swing.JButton calc = new javax.swing.JButton("Calculate");
   // button appears for user to calculate 
   
   javax.swing.JLabel answer = new javax.swing.JLabel();
   // this statement displays the answer 
                                                                             

                         
public MarathonTime (){
      setSize(900, 80);   //sets the frame size 
   
      java.awt.Container pane = getContentPane();
      javax.swing.BoxLayout setup = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.X_AXIS);
      //this statement displayes the text across the x axis
      
      setLayout (setup);
      pane.add(minutes);
      pane.add(min);
      pane.add(seconds);
      pane.add(sec);
      pane.add(calc);
      pane.add(answer);
      
      
      calc.addActionListener(this); //when pressed, the calc button will calculate 
   
      setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
   
      setVisible(true); //this statement allows the user to see the content in the GUI interface
      
         
   
   }
                           
   public void actionPerformed( java.awt.event.ActionEvent e){
      double paceTime, raceTime, raceHour, raceMin;//initialized variables
      
      int raceHours, raceMins;//initialized variables
          
      raceHour =  Double.parseDouble(sec.getText());
      //this statement takes string from amount and turns it into a double

      
      raceMin = Double.parseDouble(min.getText());   
      //this statement takes string from amount and turns it into a double
       
      //calculations 
      paceTime = (raceHour/60)+ raceMin;
      raceTime = paceTime * 26.2;
      raceHour = (int)(raceTime / 60.0);
      raceMin = (int)((raceTime/60.0 - raceHour)*60.0);
      
      raceHours = (int)raceHour; //cuts off the decimal and converts to an int

      raceMins = (int)raceMin; //cuts off the decimal and converts to an int
      
      answer.setText("Race time in hours : minutes" + raceHours + ": " + raceMins);
      // displays answer 

      
   }
       



   public static void main(String [] oskie) {
   
      MarathonTime prog = new MarathonTime();
   
   }                           
                           
                           
                           
                           
                           
                           
                           
    
    
    
    
    
    
    }
