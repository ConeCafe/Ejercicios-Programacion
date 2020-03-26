
import Foundation


var matriz = [[1,1,1,0], [1,0,1,0], [0,0,0,1], [1,0,0,1]]

func cuentaUnos(arg0:[[Int]])->Int{
    /*
     arg0 = matriz
     i = fila
     j = columna
     tam = tamaño matriz
     res = acumulador
     */
    return cuentaUnos(arg0: arg0, i: 0, j: 0, tam: arg0.count, res: 0)
}

private func cuentaUnos(arg0:[[Int]], i:Int, j:Int, tam:Int, res:Int)->Int{
    var c = res
    
    //En caso de que la matriz sea de un único elemento
    if tam == 1{
        if arg0[i][j]==1{
            //Si el elemento es un uno, se suma al acumulador
            c+=1
        }
        return c
    }else{
        //Se divide la matriz en submatrices
        return cuentaUnos(arg0: arg0, i: i, j: j, tam: tam/2, res: c) +
            cuentaUnos(arg0: arg0, i: i + tam/2, j: j, tam: tam/2, res: c) +
            cuentaUnos(arg0: arg0, i: i, j: j + tam/2, tam: tam/2, res: c) +
            cuentaUnos(arg0: arg0, i: i + tam/2, j: j + tam/2, tam: tam/2, res: c)
    }
    
}

print(cuentaUnos(arg0: matriz))
