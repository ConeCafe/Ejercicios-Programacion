string = input("Introduce una cadena de texto: ")
clave = 6  
    
def cifrado(texto):
    acum = 0
    cif= ""
    for i in texto:
        acum = ord(i)+clave
        

        cif = cif+chr(acum)

    return cif

def descifrado(texto):
    acum = 0
    cif= ""
    for i in texto:
        acum = ord(i)-clave
        

        cif = cif+chr(acum)


    return cif

print(cifrado(string))
textocif=cifrado(string)
print(descifrado(textocif))
