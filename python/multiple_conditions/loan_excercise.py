amount = input ("Ingrese monto: ")

match int(amount):
    case 3000:
        due_date = 12
        print ("Usted tiene para pagar:")
        print (str(due_date) + " meses.")
    case 5000:
        due_date = 24
        print ("Usted tiene para pagar:")
        print (str(due_date) + " meses.")
    case 9000:
        due_date = 36
        print ("Usted tiene para pagar:")
        print (str(due_date) + " meses.")
    case 12000:
        due_date = 48
        print ("Usted tiene para pagar:")
        print (str(due_date) + " meses.")
    case default:
        print ("Monto no válido, se aceptan montos de 3000, 5000, 9000 y 12000 USD")