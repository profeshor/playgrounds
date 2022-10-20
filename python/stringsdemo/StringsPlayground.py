# Declaration
from decimal import Decimal
from tokenize import Double


name = "Pablo Perez Martinez"
print ("Hola " + name)
# Split
splitedName = name.split(' ')
print ("Hola " + splitedName[0])
# Lower Case
sentence = 'THIS SHOULD BE CONVERTED TO LOWER CASE'
print (sentence.lower())
# upper case
lowerSentence = "this will be displayed in upper case"
print(lowerSentence.upper())
# Trim
sentenceWithSpaces = "       Test trim string        "
print(sentenceWithSpaces.strip())
# Length
print(len(sentenceWithSpaces))
# Replace
print(sentence.replace('THIS', 'ESTO'))

name2 = "Pablo Perez"
print('\nname2 == name : ')
print(name2 == name)
print("name2 != name : ")
print(name2 != name)
print("name2 > name : ")
print(name2 > name)
print("name2 <= name : ")
print(name2 <= name)

# Conversions
intNumber = 13
strVal = str(intNumber)
decimalVal = Decimal("23.231432")
convertedStr = "{:.2f}".format(decimalVal);
print("{:.2f}".format(decimalVal))