import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    public Mentoria() {
        super();

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria (" +
                "dataMentoria=" + dataMentoria +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ')';
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

}
