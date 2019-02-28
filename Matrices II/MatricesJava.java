package p1;

public class MatricesJava {

	
	public static void main(String[] args) {
		System.out.println("La matriz es:");
		muestraMatriz(iMatriz());
		System.out.println("\nEjercicio: ");
		System.out.println(coincidenSumasMatriz(iMatriz()));
		
	}
	
	public static int[][] iMatriz() {
		int matriz [][] = new int [4][4];
		matriz[0][0] = 17;
		matriz[0][1] = 23;
		matriz[0][2] = 12;
		matriz[0][3] = 30;
		matriz[1][0] = 37;
		matriz[1][1] = 43;
		matriz[1][2] = 4;
		matriz[1][3] = 22;
		matriz[2][0] = 20;
		matriz[2][1] = 63;
		matriz[2][2] = 5;
		matriz[2][3] = 10;
		matriz[3][0] = 8;
		matriz[3][1] = 51;
		matriz[3][2] = 16;
		matriz[3][3] = 21;
		
		return matriz;
	}
	
	public static void muestraMatriz(int [][] m) {
		for(int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				System.out.print(m[x][y] + "\t");
				if(y == m[x].length - 1) {
					System.out.print("\n");
				}
			}
		}
	}
	
	public static boolean coincidenSumasMatriz(int [][] matriz) {
		if(matriz.length==2) {
			if (matriz[0][0] + matriz[1][1] == matriz[0][1]+ matriz[1][0]) {
				return true;
			}
			else return false;
		}
		else {
			if(matriz[0][0] + matriz[matriz.length-1][matriz.length-1] == matriz[0][matriz.length-1]+ matriz[matriz.length-1][0]) {
				int[][] m1 = new int[matriz.length/2][matriz.length/2];
				int[][] m2 = new int[matriz.length/2][matriz.length/2];
				int[][] m3 = new int[matriz.length/2][matriz.length/2];
				int[][] m4 = new int[matriz.length/2][matriz.length/2];
				Integer index = 0;
				
				for(int x=0;x<matriz.length/2;x++) {
					for(int y=0;y<matriz.length/2;y++) {
						m1[x][y]=matriz[x][y];
					}
				}
				System.out.print("\n");
				for(int x=matriz.length/2;x<matriz.length;x++) {
					Integer b = 0;
					for(int y=0;y<matriz.length/2;y++) {
						m2[index][b]=matriz[x][y];
						b++;
						
					}
					index++;
				}
				index = 0;
				
				
				for(int x=0;x<matriz.length/2;x++) {
					Integer b = 0;
					for(int y = matriz.length/2;y<matriz.length;y++) {
						m3[index][b]=matriz[x][y];
						b++;
					}
					index++;
				}
				index = 0;
				
				for(int x = matriz.length/2;x<matriz.length;x++) {
					Integer b = 0;
					for(int y=0;y<matriz.length/2;y++) {
						m4[index][b]=matriz[x][y];
						b++;
					}
					index++;
				}
				index = 0;
				if(coincidenSumasMatriz(m1) && coincidenSumasMatriz(m2) && coincidenSumasMatriz(m3) && coincidenSumasMatriz(m4)) {
					
					return true;
				}
				else return false;
			}
			else return false;
		}
		
	}

	
}
