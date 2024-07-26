import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitle("Curso JS");
        curso1.setDescription("Aprender JS");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitle("Curso Java");
        curso2.setDescription("Aprender Java");
        curso2.setCargaHoraria(92);

        Curso curso3 = new Curso();
        curso3.setTitle("Curso Python");
        curso3.setDescription("Aprender Python");
        curso3.setCargaHoraria(10);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Git e GitHub");
        mentoria1.setDescription("Aprendendo a utilizar a ferramenta git");
        mentoria1.setDataMentoria(LocalDate.now().plusDays(7));

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitle("Docker");
        mentoria2.setDescription("Aprendendo a utilizar a ferramenta docker");
        mentoria2.setDataMentoria(LocalDate.now().plusDays(14));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev raulDev = new Dev("Raul");
        raulDev.inscreverNoBootcamp(bootcamp);
        raulDev.exibirCursos();


    }
}