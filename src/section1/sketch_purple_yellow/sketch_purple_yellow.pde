void setup(){
size(800, 800);  
}
void draw(){
fill(#9B52CB);
ellipse(400, 400, 400, 400);
if(mousePressed){
  fill(#F5DC20);
}else{
  fill(#9B52CB);
}
ellipse(400, 400, 400, 400);
}