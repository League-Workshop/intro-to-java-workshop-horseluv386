PImage rain;
int y = 0;
void setup(){
  size(800, 800);
  rain = loadImage("rain_pic.jpeg");
  rain.resize(800, 800);
}
void draw(){
  y++;
  background(rain);
  fill(#4858FF);
    ellipse(400, y, 10, 10);
  fill(#5F3705);
    rect(mouseX, 700, 75, 100);
}