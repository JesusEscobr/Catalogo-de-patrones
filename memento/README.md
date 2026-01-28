# Memento

**Categoría:** Comportamiento

**Propósito:** Guardar y restaurar el estado de un objeto sin exponer su estructura interna.

**Uso Real:** Editor de texto con función de deshacer (Ctrl+Z) que guarda versiones anteriores del documento.
<<<<<<< HEAD
=======

## Diagrama UML

```mermaid
classDiagram
    class Memento {
        -String estado
    }
    class Editor {
        -String contenido
        +escribir(texto)
        +guardar() Memento
        +restaurar(memento)
    }
    Editor --> Memento : crea/usa
```
>>>>>>> fa27711533923cdc89b4ad4604b38f877fa7e4fd
