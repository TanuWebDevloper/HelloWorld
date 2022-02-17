package SongApplication;

	public class Song{
		String name;
		double duration;


//CONSTRUCTOR
public Song(String name , double duration) { 
	
	this.name =name;
	this.duration =duration;
}
//EMPTY_CONSTRUCTOR
public Song() {
	}

public String getName() {
	return name;
	
}

public double getDuration() {
	return duration;
}

//it will return whatever we have in this class
@Override
public String toString() {
	return "Song{" +
			"name='" + name  +
			" , duration =" + duration + '}';

			
}
}


