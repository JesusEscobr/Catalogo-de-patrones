# Interpreter

**Categoría:** Comportamiento

**Propósito:** Definir una gramática simple e interpretar sentencias de ese lenguaje.

**Uso Real:** Calculadora que interpreta expresiones matemáticas como "5 + 3".
<<<<<<< HEAD
=======

## Diagrama UML

```mermaid
classDiagram
    class Expresion {
        <<interface>>
        +interpretar()
    }
    class Numero {
        -int valor
        +interpretar()
    }
    class Suma {
        -Expresion izq
        -Expresion der
        +interpretar()
    }
    Expresion <|.. Numero
    Expresion <|.. Suma
    Suma --> Expresion : izq
    Suma --> Expresion : der
```
>>>>>>> fa27711533923cdc89b4ad4604b38f877fa7e4fd
