import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição: curso java");
        curso1.setCargaHoraria(8);
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscriverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas ->" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteúdos Concluidos Lucas ->" + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Lucas ->" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("=======");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscriverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João ->" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos João ->" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Lucas ->" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}