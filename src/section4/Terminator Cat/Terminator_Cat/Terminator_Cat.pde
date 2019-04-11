int x = 565;
int y = 275;
int acceleration = 5;
PImage catPic;
void setup(){
  size(800, 600);
  catPic = loadImage("cat.jpeg");
    catPic.resize(800, 600);
   background(catPic);
}
void draw(){
    fill(100, 0, 0);
    noStroke();
  ellipse(x, y, 30, 35);
  ellipse(x-123, y-11, 30, 35);
if (keyPressed){
    x-=2*acceleration;
  y+=2*acceleration;
  }
 if(y>600){
   background(catPic);
 y=275;
 x=565;
 }
}