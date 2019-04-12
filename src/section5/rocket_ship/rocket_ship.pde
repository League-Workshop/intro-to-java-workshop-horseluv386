int x = 400; 
int y = 600; 

void setup() {
  size(800, 800);
}

void draw() {
     background(0, 0, 40);
y-=5;
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
noStroke();
fill(#FFFCEA);
  ellipse(90, 70, 100, 100);
fill(#DEDBC9);
  ellipse(87, 78, 20, 20);
  ellipse(105, 57, 15, 15);
  ellipse(55, 47, 10, 10);
fill(#FAFEFF);
  ellipse(283, 502, 5, 5);
  ellipse(557, 230, 5, 5);
  ellipse(480, 600, 5, 5);
}