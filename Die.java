/*
 * Name : Harpreet Kaur
 * Student number: A00245132
 * Description: Getter Setter class that replicates dice class
 */



public class Die {

// declares variables which defines dice 
	
// describe dice type or name
String die_name;

// describe no of slides
int no_of_sides;

// describe current upward side or random number
int curr_side_up;;



//default constructor(without arguments)
Die(){
	this.die_name="d6";
	this.no_of_sides=6;
	this.curr_side_up=(int)(Math.random()*no_of_sides) + 1;
}

//single parameter constructor(no_of_sides is argument)
Die(int no_of_sides){
	this.no_of_sides=no_of_sides;
	this.curr_side_up=(int)(Math.random()*no_of_sides) + 1;
	this.die_name="d"+no_of_sides;
}

//2-parameterized constructor(no_of_sides and die_name are arguments )
Die(int no_of_sides,String die_name){
	this.no_of_sides=no_of_sides;
	this.die_name=die_name;
	this.curr_side_up=(int)(Math.random()*no_of_sides) + 1;
}

// accessors and mutators

// a getter method to fetch the dice_name 
public String getDie_name() {
	return die_name;
}

// a setter method that assign a value to the die_name variable 
public void setDie_name(String die_name) {
	this.die_name = die_name;
}

//a getter method to fetch the no_of_sides 
public int getNo_of_sides() {
	return no_of_sides;
}

//a setter method that assign a value to the no_of_sides variable 
public void setNo_of_sides(int no_of_sides) {
	this.no_of_sides = no_of_sides;
}

//a getter method to fetch the curr_side_up
public int getCurr_side_up() {
	return curr_side_up;
}

//a setter method that assign a value to the curr_side_up variable 
public void setCurr_side_up(int curr_side_up) {
	this.curr_side_up = curr_side_up;
}

//roll method generating random value
void roll() {
	curr_side_up = (int)(Math.random()*no_of_sides) + 1;
	System.out.println("The new value is "+curr_side_up);
	
}


}
