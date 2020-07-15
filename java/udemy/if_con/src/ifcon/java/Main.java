package ifcon.java;
public class Main {
	public static void main(String[] args) {
	boolean gameOver=false;
	int score=5000;
	int levelComp=5;
	int bonus=1000;
	if (score<500 || levelComp<5){
        System.out.println("your score was less than 500 & you can't pass the level");
    }
	else if (score<1000 && levelComp==5){
		System.out.println("score is less than 1000, try hard!");
	}
	else if(score==1000 && gameOver!=true){
		System.out.println("your score is 1000, PASSED!");
	}
	else {
		System.out.println("PASSED!bonus will be added");
		int finalScore=(score-1000)/2;
		System.out.println("bouns point is:"+finalScore);
	}
    }
}

//OUTPUT-->
//PASSED!bonus will be added
//bouns point is:2000
