import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public String getName() {
        return name;
    }

    public Set<Conteudo> getMentorias() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosInscritos.remove(conteudo.get());
            conteudosConcluidos.add(conteudo.get());
        } else {
            System.out.println("Voce nao está matriculado em nenhum curso.");
        }
    }

    public double calcularTotalXP() {
        return conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public void exibirCursos() {
        if (!conteudosInscritos.isEmpty()) {
            conteudosInscritos.forEach(System.out::println);
        } else {
            System.out.println("Sem cursos cadastrados para este usuário.");
        }

    }

}
