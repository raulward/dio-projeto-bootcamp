import java.util.Objects;

public abstract class Conteudo {

    public String title;
    public String description;
    protected static final double XP_PADRAO = 10d;

    public Conteudo() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(title, conteudo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public abstract double calcularXP();

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
