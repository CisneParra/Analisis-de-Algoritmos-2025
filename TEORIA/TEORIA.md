# 📊 Análisis de Algoritmos

Este repositorio contiene material teórico y práctico sobre **Análisis de Algoritmos**, incluyendo apuntes de clase, presentaciones, y talleres por unidad temática. Ideal para repasar conceptos, practicar y documentar tu avance en la asignatura.

---

## 📂 Estructura del Repositorio

```plaintext
📁 Analisis-de-Algoritmos/
├── README.md
├── teoria/                   # Apuntes, presentaciones y material de clase
├── talleres/                # Talleres prácticos por semana o tema
│   ├── 01-regla-del-limite/
│   ├── 02-fibonacci-recursivo/
│   ├── 03-codificacion-algoritmo/
│   └── ...
```

---

## 📘 Teoría por Unidades

### 🔹 Unidad 1: Fundamentos

#### ¿Qué es un algoritmo?
Un algoritmo es un conjunto finito y ordenado de instrucciones que permite resolver un problema. Debe ser:
- **Finito**: debe tener un número limitado de pasos.
- **Claro**: sin ambigüedades.
- **Eficiente**: ejecutable en tiempo razonable.
- **Definido**: sus pasos deben ser precisos.
- **Productivo**: debe generar una salida a partir de una entrada.

#### ¿Por qué analizamos algoritmos?
- Comparar métodos alternativos.
- Estimar el comportamiento sin ejecutarlo.
- Evaluar la eficiencia temporal y espacial.

---

### 🔹 Unidad 2: Notación Asintótica

Las notaciones asintóticas describen el comportamiento del algoritmo a medida que la entrada crece:

| Notación | Significado | Describe |
|----------|-------------|----------|
| 𝑶(g(n)) | Cota superior | Peor caso |
| Ω(g(n)) | Cota inferior | Mejor caso |
| Θ(g(n)) | Cota ajustada | Caso promedio / comportamiento exacto |

#### Ejemplo:
Para un algoritmo de búsqueda lineal:
- 𝑶(n): en el peor caso revisa todos los elementos.
- Ω(1): en el mejor caso encuentra el resultado al primer intento.
- Θ(n): comportamiento promedio revisando n/2 elementos.

---

### 🔹 Unidad 3: Análisis de Algoritmos

#### Tipos de Análisis:
- **Teórico**: Basado en notaciones matemáticas y conteo de operaciones.
- **Empírico**: Usa pruebas reales y cronómetros.
- **Híbrido**: Combina teoría y pruebas para análisis más completos.

#### Factores que influyen en la eficiencia:
- Tiempo de ejecución.
- Uso de memoria.
- Costos computacionales de operaciones clave.

#### Ejemplo de análisis:
Para un algoritmo que suma los elementos de una lista de `n` elementos:
```python
def suma(lista):
    total = 0
    for elemento in lista:
        total += elemento
    return total
```
Este algoritmo tiene una complejidad **Θ(n)** porque itera una sola vez sobre todos los elementos.

---

## 📚 Bibliografía y Recursos Útiles

- **CLRS** – *Introduction to Algorithms* (Cormen, Leiserson, Rivest, Stein).
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- [VisuAlgo](https://visualgo.net/) – Visualizador interactivo de algoritmos.
- [The Algorithms (GitHub)](https://github.com/TheAlgorithms) – Implementaciones de algoritmos en varios lenguajes.
- [GeeksforGeeks](https://www.geeksforgeeks.org/fundamentals-of-algorithms/) – Artículos explicativos y ejemplos.
