class Reporte:
    def generar(self):
        self.obtener_datos()
        self.formatear()

    def obtener_datos(self):
        print("Obteniendo datos...")

    def formatear(self):
        pass


class ReportePDF(Reporte):
    def formatear(self):
        print("Formato PDF")
