# 05 **Validador de Números Amigos**

Un número amigo es aquel que tiene exactamente dos divisores distintos diferentes de 1 y él mismo. Por ejemplo, 6 es un número amigo porque sus únicos divisores son 2 y 3. Escribe un programa que:

- Solicite al usuario un rango de números (inicio y fin)
- Encuentre todos los números amigos dentro de ese rango
- Para cada número amigo encontrado, muestre también sus divisores

pasos:
- pido al usuario que ingrese el primer numero que es el inicio del rango y luego otro que sea el final del ranfo
- en base a los datos ingresados por el usuario, hago un for para empezar un bucle 
- dentro del for hago un if en el cual introduzco una condicion de que el numero tenga como reciduo = 0 y que mande un print que diga el numero en el que va y los divisores que cumplan con esta condicion, si no es asi, entonces, que no muestre nada y se repita el for 