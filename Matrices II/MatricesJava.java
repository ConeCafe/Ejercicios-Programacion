package p1;

public class MatricesJava {

	
	public static void main(String[] args) {
		System.out.println("La matriz es:");
		muestraMatriz(iMatriz());
		System.out.println("\nEjercicio: ");
		System.out.println(coincidenSumasMatriz(iMatriz()));
		System.out.println("\nSegunda parte: \n"+sumaMatrices2(iMatriz()));
		
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
		
		if(matriz.length==1) {
			return true;
		}
		
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
	
	//Otro metodo, aqui invocamos a un metodo que recibe una matriz, dos coordenadas y para ahorrar codigo el tamaño de la matriz
	
	public static Boolean sumaMatrices2(int[][] m) {
		return sumaMatrices2(m, 0, 0, m.length);
	}

	private static Boolean sumaMatrices2(int[][]m, Integer i, Integer j, Integer tam) {
		Boolean res;
		if(tam==1) {
			res = true;
			return res;
		}else {
			res = m[i][j]+m[i+tam-1][j+tam-1]==m[i][j+tam-1]+m[i+tam-1][j]&&
					sumaMatrices2(m, i, j, tam/2) &&
					sumaMatrices2(m, i + tam/2, j, tam/2) &&
					sumaMatrices2(m, i, j + tam/2, tam/2) &&
					sumaMatrices2(m, i + tam/2, j + tam/2, tam/2);
			return res;
		}
	}
	
}
