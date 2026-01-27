class Flyweight:
    _modelos = {}
    def __new__(cls, nombre):
        if nombre not in cls._modelos:
            cls._modelos[nombre] = super().__new__(cls)
        return cls._modelos[nombre]