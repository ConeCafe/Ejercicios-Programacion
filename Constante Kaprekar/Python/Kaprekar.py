
def ordenaND(num):
    temp = 9
    acum = 0
    copia = 0
    
    while(temp >= 0):
        copia = num
        while(copia > 0):
            if(copia % 10 == temp):
                acum = acum * 10 + copia % 10
                
            copia = copia//10
            
        temp = temp - 1
        
    return acum

def ordenaNA(num):
    temp = 0
    acum = 0
    copia = 0
    
    while(temp<10):
        copia = num
        while(copia > 0):
            if(copia % 10 == temp):
                acum = acum * 10 + copia % 10
                
            copia = copia//10
            
        temp=temp+1
        
    return acum

def Kap(num):
    return KapI(num, 0)

def KapI(num, c):
    a = ordenaND(num)
    b = ordenaNA(num)
    contador = c
    
    while(a<1000):
        a = a * 10
        
    if(a-b==6174):
        return contador
    if(a-b==0):
        print("No se pudo realizar la operacion. El numero debe tener al menos dos digitos diferentes")
        return 0
    else:
        contador = contador + 1
        return KapI(a-b, contador)

numero = int(input("Introduce un numero menor o igual a 9999: "))
print(Kap(numero))