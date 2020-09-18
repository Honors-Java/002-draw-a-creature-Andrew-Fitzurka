void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
  //Creature's Body
  stroke(0);
  fill(200);
    rect(198, 165, 300, 10);
  
  //Creature's Head
  fill(171, 230, 231);
    ellipse(200, 143, 100, 34);
  
  //Creature's Eyes
  fill(0);
    ellipse(182, 138, 10, 10);
    ellipse(213, 138, 10, 10);
    ellipse(164, 143, 10, 10);
    ellipse(193, 145, 10, 10);
    ellipse(197, 133, 10, 10);
    ellipse(205, 149, 10, 10);
    ellipse(242, 142, 10, 10);
    ellipse(223, 149, 10, 10);
    ellipse(229, 137, 10, 10);
    ellipse(178, 151, 10, 10);
  
  //Creature's Pupils
  stroke(255);
    point(183, 140);
    point(211, 140);
    point(165, 145);
    point(179, 153);
    point(193, 147);
    point(197, 135);
    point(204, 152);
    point(221, 151);
    point(227, 139);
    point(240, 144);
  
  //Creature's Mouth
  stroke(0);
    line(190, 154, 203, 158);
    line(203, 158, 217, 154);

  //Creature's Left Arm
  stroke(0);
    line(48, 170, 19, 198);
    line(19, 198, 41, 233);
    line(68, 170, 39, 198);
    line(39, 198, 61, 233);

  //Creature's Right Arm  
    line(348, 170, 379, 198);
    line(379, 198, 355, 233);
    line(327, 170, 358, 198);
    line(358, 198, 335, 233);
  
  //Creature's Left-side Joints
  stroke(0);
  fill(150);
    ellipse(30, 200, 19.8, 19.8);
    ellipse(367, 200, 19.8, 19.8);
    ellipse(57, 165, 20, 20);
    ellipse(338, 165, 20, 20);

  //Creature's Right-side Joints  
  fill(0);
    ellipse(30, 200, 10, 10);
    ellipse(367, 200, 10, 10);
    ellipse(57, 165, 10, 10);
    ellipse(338, 165, 10, 10);
  stroke(255);
    point(29.5, 200);
    point(367, 200);
    point(56.48, 165);
    point(338, 165);

  //Creature's Left Claw/Finger Appendages
  stroke(0);
  fill(127, 0, 0);
  quad(48, 253, 38, 233, 64, 233, 74, 253);
    stroke(0, 0, 255);
    line(49, 253, 69, 270);
    line(69, 270, 54, 253);
    line(59, 253, 79, 270);
    line(79, 270, 64, 253);
    line(70, 244, 82, 251);
    line(82, 251, 83, 265);
    line(83, 265, 85, 248);
    line(85, 248, 67, 240);
  
  //Creature's Right Claw/Finger Appendages
  stroke(0);
  quad(350, 253, 359, 233, 333, 233, 323, 253);
    stroke(0, 0, 255);
    line(349, 253, 329, 270);
    line(329, 270, 344, 253);
    line(339, 253, 319, 270);
    line(319, 270, 334, 253);
    line(326, 245, 315, 251);
    line(315, 251, 314, 265);
    line(314, 265, 312, 248);
    line(312, 248, 328, 242)
}