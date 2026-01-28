# Template Method

**Categoría:** Comportamiento

**Propósito:** Definir el esqueleto de un algoritmo permitiendo que las subclases redefinan ciertos pasos.

**Uso Real:** Proceso de generación de reportes donde el formato (PDF, Excel) cambia pero los pasos generales son iguales.
<<<<<<< HEAD
=======

## Diagrama UML

```mermaid
classDiagram
    class Reporte {
        +generar()
        +obtenerDatos()
        +formatear()
    }
    class ReportePDF {
        +formatear()
    }
    Reporte <|-- ReportePDF
```
>>>>>>> fa27711533923cdc89b4ad4604b38f877fa7e4fd
