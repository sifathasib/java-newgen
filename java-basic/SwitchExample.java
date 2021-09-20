public class SwitchExample{
	public static void main(String args[]){
		String levelString = "Expert";
		int level ;
		switch(levelString){
			case "Beginner": 
				level=1;
				break;
			case "Intermediate": 
				level = 2;
				break;
			case "Expert": 
				level = 3;
				break;
			default: level =0;
		}
		System.out.println("your level is :"  + level);
	}	

}
