# Visitor

**Categoría:** Comportamiento

**Propósito:** Separar operaciones de la estructura de objetos, permitiendo agregar nuevas operaciones sin modificar las clases.

**Uso Real:** Sistema de nómina que calcula impuestos diferentes para empleados y contratistas sin modificar sus clases.

## Diagrama UML

```mermaid
classDiagram
    class Empleado {
        -String nombre
        -double salario
        +aceptar(visitor)
    }
    class Visitor {
        <<interface>>
        +visitar(empleado)
    }
    class CalculadoraImpuestos {
        +visitar(empleado)
    }
    Visitor <|.. CalculadoraImpuestos
    Empleado --> Visitor : acepta
```
