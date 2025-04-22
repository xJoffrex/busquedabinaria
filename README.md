
# Práctica de Métodos de Búsqueda Binaria

## 📌 Información General

- **Título:** Práctica de Algoritmos de Búsqueda Binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Steve Brito
- **Fecha:** 3-21-25
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa la **Búsqueda Binaria** en Java para buscar una persona dentro de un arreglo de objetos `Persona`, basándose en el atributo **edad**. Además, se realiza un ordenamiento **manual** de los elementos utilizando el **Método de Inserción** para asegurar que el arreglo esté ordenado antes de la búsqueda.

Durante la ejecución, el programa muestra:
- El arreglo en cada búsqueda, las posiciones de **bajo**, **alto**, y el **valor de centro**.
- El **elemento encontrado** o **no encontrado**.
- Indica si se buscará en el subarreglo de la **derecha** o **izquierda**.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
Ingrese cantidad de personas del listado: 9
Ingrese Persona:
Nombre: Pablo
Edad: 4
Ingrese Persona:
Nombre: Maria
Edad: 5
Ingrese Persona:
Nombre: Juan
Edad: 18
Ingrese Persona:
Nombre: David
Edad: 60
Ingrese Persona:
Nombre: Mateo
Edad: 25
Ingrese Persona:
Nombre: Diego
Edad: 12
Ingrese Persona:
Nombre: Ana
Edad: 8
Ingrese Persona:
Nombre: Alicia
Edad: 9
Ingrese Persona:
Nombre: Jaime
Edad: 40

Valor de la persona a buscar por edad: 18
```

---

## 🔧 Salida Esperada

```plaintext
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60
bajo=0 alto=8 centro=4 valorCentro=12 --> DERECHA
18 | 25 | 40 | 60
bajo=5 alto=8 centro=6 valorCentro=25 --> IZQUIERDA
18 |
bajo=5 alto=5 centro=5 valorCentro=18 --> ENCONTRADO
La persona con la edad 18 es Pablo
```

---

## 📄 Archivos del Proyecto

- `Persona.java`: Clase que define los atributos `nombre` y `edad`.
- `BusquedaBinaria.java`: Implementación de la búsqueda binaria.
- `App.java`: Clase principal que gestiona la entrada del usuario y coordina la ejecución del programa.

---

## 📝 Notas

- **Edad ingresada:** La edad de las personas debe ser **no negativa**.
- **Ordenamiento:** El arreglo de personas es ordenado usando el **Método de Inserción** antes de ejecutar la búsqueda binaria.
- **Búsqueda Binaria:** Solo funciona si el arreglo está **ordenado**. 

