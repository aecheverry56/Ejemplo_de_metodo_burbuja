# Método burbuja

El método burbuja es un algoritmo que ordena una lista comparando números que están uno al lado del otro.

Si el número de la izquierda es mayor que el de la derecha, se intercambian. Este proceso se repite hasta que todos los números queden en orden.

## Ejemplo

El programa comienza con este arreglo:

```text
[5, 3, 8, 4, 2]
```

Primero compara `5` y `3`. Como `5` es mayor, los intercambia:

```text
[3, 5, 8, 4, 2]
```

Después continúa comparando los demás pares vecinos. En cada recorrido, el número más grande que falta por ordenar avanza hacia el final.

Al terminar, el arreglo queda ordenado de menor a mayor:

```text
[2, 3, 4, 5, 8]
```

El programa también termina antes si hace un recorrido sin intercambios, porque eso indica que la lista ya está ordenada.
