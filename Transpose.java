package assignment1;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,5,4},{3,7,9},{2,5,8}};
		int m[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=a[j][i];
			}
		}
		System.out.println("The Matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The Transposed Matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
