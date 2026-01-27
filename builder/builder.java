package builder;

class Computadora {
    private String cpu;
    private String ram;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}

class BuilderPC {
    public Computadora build() {
        Computadora pc = new Computadora();
        pc.setCpu("Intel");
        pc.setRam("16GB");
        return pc;
    }
}
