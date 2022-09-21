age = input("Ingresa tu edad: ")
if int(age) > 17:
    print("Eres MAYOR de edad, bienvenido...")
    quantity = input("Ingresa la cantidad de litros de bebida que deseas ordenar: ")

    if int(quantity) <= 4:
        print("Su orden ha sido enviada")
    else:
        print("La cantidad solicitada es demasiado alta")
else:
    print("Usted es menor de edad. La orden ha sido cancelada")