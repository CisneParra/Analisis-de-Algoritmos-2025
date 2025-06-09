# 📊 Análisis de Algoritmos

Este repositorio contiene material **teórico y práctico** sobre **Análisis de Algoritmos**, incluyendo apuntes de clase, presentaciones y talleres implementados en **Java**. Ideal para repasar conceptos, practicar problemas clásicos y documentar tu avance en la asignatura.

---

## 📑 Tabla de Contenidos

- [Teoría por Semanas (1‑7)](#-teoría-por-semanas-1‑7)
- [Algoritmos y Talleres](#-algoritmos-y-talleres)
- [Tecnologías Usadas](#-tecnologías-usadas)
- [Bibliografía y Recursos Útiles](#-bibliografía-y-recursos-útiles)

---

## 📘 Teoría por Semanas (1‑7)

### Semana 1 – Fundamentos y Modelos

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


* Modelos de cómputo como RAM.
* Técnicas clásicas: divide y vencerás, voraces, programación dinámica.

### Semana 2 – Insertion Sort y Análisis Básico

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

* Implementación y análisis de **Insertion Sort** en Java.
* Introducción a notaciones: Θ (caso exacto), O (peor caso), Ω (mejor caso).

### Semana 3 – Diseño de Algoritmos

* Metodología de diseño: pensar primero, codificar después.
* Caso práctico: problema del máximo subarreglo.

  * Fuerza bruta: O(n²)
  * Divide y vencerás: O(n log n)

### Semana 4 – Notación Asintótica Formal

* Definiciones formales: O, Ω, Θ, o, ω.
* Comparación de funciones con crecimiento distinto.

### Semana 5 – Profundización

* Repaso de los tipos de notación con ejemplos reales.
* Comparación visual entre algoritmos.

### Semana 6 – Costos de Control

* Costo de estructuras: secuencias, if‑else, bucles y anidados.
* Costos compuestos (sumas y productos por anidamiento).

### Semana 7 – Consolidación

#### Tipos de Análisis:
- **Teórico**: Basado en notaciones matemáticas y conteo de operaciones.
- **Empírico**: Usa pruebas reales y cronómetros.
- **Híbrido**: Combina teoría y pruebas para análisis más completos.

#### Factores que influyen en la eficiencia:
- Tiempo de ejecución.
- Uso de memoria.
- Costos computacionales de operaciones clave.

#### Ejemplo de análisis:
Para un algoritmo que suma los elementos de una lista de n elementos:
python
def suma(lista):
    total = 0
    for elemento in lista:
        total += elemento
    return total

Este algoritmo tiene una complejidad **Θ(n)** porque itera una sola vez sobre todos los elementos.


* Aplicación práctica de notaciones.
* Evaluación de eficiencia sin ejecutar el código.

---

## ⚙️ Algoritmos y Talleres

| Carpeta del Taller           | Tema                           |
| ---------------------------- | ------------------------------ |
| `01-regla-del-limite/`       | Límites y notación O           |
| `02-fibonacci-recursivo/`    | Recursividad exponencial       |
| `03-codificacion-algoritmo/` | Estilo de codificación en Java |
| `04-insertion-sort/`         | Ordenamiento básico            |
| `05-maximo-subarreglo/`      | Análisis fuerza bruta y D&C    |
| `...`                        | Más temas en desarrollo        |

---

## 🛠️ Tecnologías Usadas

* **Lenguaje:** Java
* **IDE sugerido:** Visual Studio Code o IntelliJ IDEA
* **Versión recomendada:** JDK 17+

---

## 📚 Bibliografía y Recursos Útiles

* **CLRS** – *Introduction to Algorithms* (Cormen, Leiserson, Rivest, Stein)
* [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
* [VisuAlgo](https://visualgo.net/) – Visualizador interactivo de algoritmos
* [The Algorithms – Java](https://github.com/TheAlgorithms/Java)
* [GeeksforGeeks](https://www.geeksforgeeks.org/fundamentals-of-algorithms/)

---


**Creado con 💻 por Antonella del Cisne Parra Carrión**
