# Chain of Responsibility

**Categoría:** Comportamiento

**Propósito:** Pasar una solicitud a través de una cadena de manejadores hasta que uno la procese.

**Uso Real:** Sistema de aprobación de gastos donde según el monto se escala a supervisor, gerente o director.
<<<<<<< HEAD
=======

## Diagrama UML

```mermaid
classDiagram
    class Aprobador {
        -String nombre
        -int limite
        -Aprobador siguiente
        +aprobar(monto)
    }
    Aprobador --> Aprobador : siguiente
```
>>>>>>> fa27711533923cdc89b4ad4604b38f877fa7e4fd
