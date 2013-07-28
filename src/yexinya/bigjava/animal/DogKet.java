package yexinya.bigjava.animal;

import java.awt.Color;

public class DogKet extends Dog{
Color color;
public DogKet(){
	this(Color.black);
}

public DogKet(Color c){
	super("DogKet");
	color =c;
}


}
