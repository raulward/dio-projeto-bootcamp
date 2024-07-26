public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
        super();
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso (" +
                "title=" + title + '\'' +
                ". cargaHoraria='" + cargaHoraria +
                ", description='" + description + '\'' +
                ')';
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
