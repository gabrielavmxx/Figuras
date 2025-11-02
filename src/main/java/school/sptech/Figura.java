package school.sptech;

abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(){
        this.cor = cor;
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return String.format("Cor: %s | Espessura: %d", cor, espessura);
    }

    public abstract Double calcularArea();
}
