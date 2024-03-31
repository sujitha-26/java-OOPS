package playingWithObj_utilityclass;

public class students{

	public static int Totalmarks(student std1) {
		int totalmarks=std1.mark1+std1.mark2;
		//System.out.println(std.mark1+std.mark2);
		return totalmarks;
	}
	public static int Avgmarks(student std) {
		int Avgmarks=(std.mark1+std.mark2)/2;
		//System.out.println(std.mark1+std.mark2);
		return Avgmarks;
	}
	public static int Maxmarks(student std) {
		if(std.mark1>std.mark2) 
			return std.mark1;
		else if(std.mark1==std.mark2)
			return 0;
		else
			return std.mark2;
	}
	public static int Minmarks(student std) {
		if(std.mark1<std.mark2) 
			return std.mark1;
		else if(std.mark1==std.mark2)
			return 0;
		else
			return std.mark2;
	}

}
