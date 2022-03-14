package assignment2;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {0,0,0,0,0,0,0,0,0,0};
		int bonus[];
		bonus=new int[15];
		for(int i=0;i<15;i++) {
			bonus[i]+=1;
		}
		int bestScores[]= {25,30,42,70,21};
		for(int j=0;j<5;j++) {
			System.out.printf("%d\t",bestScores[j]);
		}
	}

}
