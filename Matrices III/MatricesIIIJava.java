package p1;

public class MatricesIIIJava {

	
	public static void main(String[] args) {
		System.out.println("La matriz es:");
		muestraMatriz(iMatriz());
		System.out.println("\nEjercicio: ");
		System.out.println(cuentaUnos(iMatriz()));
		
	}
	
	public static int[][] iMatriz() {
		int matriz [][] = new int [4][4];
		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		matriz[0][3] = 0;
		matriz[1][0] = 0;
		matriz[1][1] = 0;
		matriz[1][2] = 0;
		matriz[1][3] = 1;
		matriz[2][0] = 1;
		matriz[2][1] = 0;
		matriz[2][2] = 1;
		matriz[2][3] = 0;
		matriz[3][0] = 0;
		matriz[3][1] = 0;
		matriz[3][2] = 1;
		matriz[3][3] = 1;
		
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
	
	public static Integer cuentaUnos(int[][] m) {
		return cuentaUnos(m, 0, 0, m.length, 0);
	}
	//Este método se puede modificar para que en vez de 1 busque otro tipo de elementos en una matriz y reduciendo la complejidad del algoritmo.
	private static Integer cuentaUnos(int[][] m, Integer i, Integer j, Integer tam, Integer res) {
		Integer c = res;
		if(tam==1) {
			if(m[i][j]==1) {
				c++;
			}
			return c;
		}
		else {
			
			
			return  cuentaUnos(m, i, j, tam/2, c) +
					cuentaUnos(m, i + tam/2, j, tam/2, c) +
					cuentaUnos(m, i, j + tam/2, tam/2, c) +
					cuentaUnos(m, i + tam/2, j + tam/2, tam/2, c);	
			
		}		
		
	}
	
	
}
