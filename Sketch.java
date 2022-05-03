import processing.core.PApplet;

public class Sketch extends PApplet {

  int intBirdX1 = 100;
  int intBirdX2 = 170;
  int intBirdY = 80;
  String strMessage = "";
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
  	// size call (ratio is 1.5:1)
    size(900, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(196, 212, 201);

    drawRainbow(450, 600);
    drawSun(800, 100, 100, 255, 245, 130);
  	
    fill(60, 171, 86);
    rect(0, height * 7/8, width, height * 1/8);

    fill(155, 118, 83);
    quad(width * 29/60, height * 7/8, width * 31/60, height * 7/8, width * 3/5, height, width * 2/5, height);   

    if(mousePressed){
      noStroke();
      fill(255, 255, 255);
      ellipse(mouseX, mouseY-5, 70, 40);
      ellipse(mouseX-30, mouseY, 70, 30);
      ellipse(mouseX + 30, mouseY, 70, 30);
      stroke(0);
    }

    if(keyPressed){
      fill(0,0,0);
      arc(200, 500, 80, 60, 0, PI, CHORD);
      rect(165, 515, 70, 15);
      fill(255, 221, 71);
      arc(200, 500, 70,60, PI, TWO_PI);
    }

    if(keyPressed){
      if(key == 'n'){
        background(5, 49, 98);
        drawRainbow(450, 600);
        fill(5, 49, 98);
        ellipse(450, 600 * 20/16, width * 4/15, height);
        fill(228, 223, 217);
        ellipse(800, 100, 100, 100);
        
        fill(60, 171, 86);
        rect(0, height * 7/8, width, height * 1/8);
    
        fill(155, 118, 83);
        quad(width * 29/60, height * 7/8, width * 31/60, height * 7/8, width * 3/5, height, width * 2/5, height); 

        fill(228, 223, 217);
        ellipse(50, 175, 5, 5);
        fill(228, 223, 217);
        ellipse(100, 50, 5, 5);
        fill(228, 223, 217);
        ellipse(180, 150, 5, 5);
        fill(228, 223, 217);
        ellipse(250, 90, 5, 5);
        fill(228, 223, 217);
        ellipse(375, 90, 5, 5);
        fill(228, 223, 217);
        ellipse(400, 190, 5, 5);
        fill(228, 223, 217);
        ellipse(500, 65, 5, 5);
        fill(228, 223, 217);
        ellipse(550, 150, 5, 5);  
      }
    }

    if(keyPressed){
      if(keyCode == UP){
        intBirdY--;
      }
      else if(keyCode == DOWN){
        intBirdY++;
      }
      else if(keyCode == LEFT){
        intBirdX1--;
        intBirdX2--;
      }
      else if(keyCode == RIGHT){
        intBirdX1++;
        intBirdX2++;
      }
    }
    noFill();
    arc(intBirdX1, intBirdY, 70, 40, PI, TWO_PI);
    arc(intBirdX2, intBirdY, 70, 40, PI, TWO_PI);

    fill(255, 255, 255);
    textSize(18);
    text(strMessage, 15, 550);

    fill(0,0,0);
    rect(mouseX-8, mouseY, 16, 2);
    rect(mouseX, mouseY-8, 2, 16);
  }

  /**
   * Draws a rainbow to the screen where the location is given
   * @param RainbowX The x-value of the location of the rainbow
   * @param RainbowY The y-value of the location of the rainbow
   * 
   */
  public void drawRainbow(float RainbowX, float RainbowY){
    fill(239, 115, 113);
    ellipse(RainbowX, RainbowY * 14/16, width * 2/3, height);
    fill(248, 181, 129);
    ellipse(RainbowX, RainbowY * 15/16, width * 3/5, height);
    fill(253, 230, 151);
    ellipse(RainbowX, RainbowY * 16/16, width * 8/15, height);
    fill(151, 186, 129);
    ellipse(RainbowX, RainbowY * 17/16, width * 7/15, height);
    fill(132, 146, 184);
    ellipse(RainbowX, RainbowY * 18/16, width * 2/5, height);
    fill(168, 148, 186, 255);
    ellipse(RainbowX, RainbowY * 19/16, width * 1/3, height);
    fill(196, 212, 201);
    ellipse(RainbowX, RainbowY * 20/16, width * 4/15, height);

    noStroke();
    fill(196, 212, 201);
    rect(RainbowX - width * 1/3, RainbowY * 14/16, 601, height);
    stroke(0, 0, 0);
  }
  /**
   * Draws a sun to the screen where the location, size, and colour is given
   * @param SunX The x-value of the location of the sun
   * @param SunY The y-value of the location of the sun
   * @param SunSize The size of the sun (diameter of the circle)
   * @param r The red value of the colour of the sun
   * @param g The green value of the colour of the sun
   * @param b The blue value of the colour of the sun
   * 
   */
  public void drawSun(float SunX, float SunY, float SunSize, int r, int g, int b){
    fill(r, g, b);
    ellipse(SunX, SunY, SunSize, SunSize);

    line(SunX, SunY - SunSize * 5/9, SunX, SunY - SunSize * 5/6);
    line(SunX, SunY + SunSize * 5/9, SunX, SunY + SunSize *  5/6);
    line(SunX + SunSize * 5/9, SunY, SunX + SunSize * 5/6, SunY);
    line(SunX - SunSize * 5/9, SunY, SunX - SunSize * 5/6, SunY);
    line(SunX + SunSize * 5/12, SunY - SunSize * 5/12, SunX + SunSize * 25/36, SunY - SunSize * 25/36);
    line(SunX + SunSize * 5/12, SunY + SunSize * 5/12, SunX + SunSize * 25/36, SunY + SunSize * 25/36);
    line(SunX - SunSize * 5/12, SunY - SunSize * 5/12, SunX - SunSize * 25/36, SunY - SunSize * 25/36);
    line(SunX - SunSize * 5/12, SunY + SunSize * 5/12, SunX - SunSize * 25/36, SunY + SunSize * 25/36);
  }
  
  public void mouseMoved(){
    ellipse(800-20, 100-20, 10, 10);
    ellipse(800+20, 100-20, 10, 10);
    noFill();
    arc(800, 100, 80, 50, 0, PI, CHORD);
  }

  public void mouseDragged(){
    noStroke();
    fill(70,135,255);
    rect(mouseX-60, mouseY+5, 120, height);
    stroke(0);

    fill(0,0,0);
    ellipse(800-20, 100-20, 10, 10);
    ellipse(800+20, 100-20, 10, 10);
    noFill();
    arc(800, 100+20, 80, 50, PI, TWO_PI, CHORD);
  }

  public void keyTyped(){
    strMessage += key;
  }
}