import org.code.neighborhood.*;
 public class SmileyFacePainter extends MuralPainter {

   // when drawSmileyFace is called the SmileyFacePainter will drawCirlce and drawFace. 
public void drawSmileyFace() {
  drawCircle();
  drawFace();
  drawTongue();
}
// Draws the outter circle for the smiley face
public void drawCircle(){
if (canMove()){  
  move();
    move();
  move();
turnRight();
  move();
  turnLeft();
}
 
  paintLine("black" ,10 );
  turnRight();
  move();
  paintLine("black", 1);
  turnLeft();
  move();
  turnRight();
  paintLine("black", 10);
  turnRight();
  move();
  turnLeft();
  paintLine("black" , 1);
  turnRight();
  move();
  paintLine("black" , 10);
  turnRight();
  move();
  paintLine("black" , 1);
  turnLeft();
  move();
  turnRight();
  paintLine("black" , 10);
  turnRight();
  move();
  paintLine("black" , 1);
 
  
  }
// Draws the details of the face like the eyes and smile
public void drawFace(){
// if the painter can move, it will move 2 times, turn right, then move another 2 times. 
  if(canMove()){
   move();
   move();
   turnRight();
   move();
   move();   
 }
  paintLine("black", 3);
  turnAround();
  move();
  move();
  move();
  turnRight();
  // if the painter can move, it will move 5 times then turn right
  if(canMove()){
    move();
    move();
    move();
    move();
    move();
    turnRight();
  }
paintLine("black", 3);
  turnLeft();
  move();
  move();
  turnRight();
  move();
  move();
  paintLine("black", 1);
  turnRight();
  move();
  paintLine("black" ,1);
  turnLeft();
  move();
  turnRight();
  paintLine("black", 6);
  turnRight();
  move();
  paintLine("black", 1);
  turnLeft();
  move();
  paintLine("black", 1);
 // while the painter can move, it will move forward until it can't move forward anymore.
  while (canMove()){
    move();  
  }
  turnLeft();
// while the painter can move, it will move forward until it can't move forward anymore.
  while (canMove()){
    move();
  }
}
//Paints the tongue of the smiley face.
   public void drawTongue(){    
turnLeft();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
  move();
  move();
  move();
  paintLine("red", 1);
  turnAround();
  move();
  move();
  turnLeft();
  move();
  paintLine("red", 1);
  turnLeft();
  move();
  paintLine("red", 1);
   }


  
   
   
}
