package com.lilpoof;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Completo");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso Completo JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria curso Java");
        mentoria.setDescricao("Mentoria dedicada ao curso Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo para formação Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPoof = new Dev();
        devPoof.setNome("Poof");
        devPoof.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Poof:" + devPoof.getConteudosInscritos());
        devPoof.progredir();
        devPoof.progredir();
        devPoof.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Poof:" + devPoof.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Poof:" + devPoof.getConteudosConcluidos());
        System.out.println("XP:" + devPoof.calcularTotalXp());

        System.out.println("-------");

        Dev devShiras = new Dev();
        devShiras.setNome("Shiras");
        devShiras.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Shiras:" + devShiras.getConteudosInscritos());
        devShiras.progredir();
        devShiras.progredir();
        devShiras.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Shiras:" + devShiras.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Shiras:" + devShiras.getConteudosConcluidos());
        System.out.println("XP:" + devShiras.calcularTotalXp());

        System.out.println("-------");

        Dev devHanbo = new Dev();
        devHanbo.setNome("Hanbo");
        devHanbo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Hanbo:" + devHanbo.getConteudosInscritos());
        devHanbo.progredir();
        devHanbo.progredir();
        devHanbo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Hanbo:" + devHanbo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Hanbo:" + devHanbo.getConteudosConcluidos());
        System.out.println("XP:" + devHanbo.calcularTotalXp());

    }

}