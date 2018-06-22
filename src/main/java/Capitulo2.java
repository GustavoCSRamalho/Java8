import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static  java.util.Comparator.naturalOrder;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class Capitulo2 {

    public static void main(String... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
//        usuarios.add(user1);
//        usuarios.add(user2);
//        usuarios.add(user3);
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("-----");

//        usuarios.removeIf(u -> u.getPontos() > 160);
//        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("------ 123123");

        Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));

        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

        usuarios.sort(comparing(Usuario::getNome).reversed());
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("-----123123");


        List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");

        palavras.sort(naturalOrder());
        palavras.forEach(u -> System.out.println(u));

        usuarios.sort(comparing(Usuario::getNome));


        Function<String,Usuario> criadorDeUsuario = Usuario::new;

        Usuario usuario1 = criadorDeUsuario.apply("TEste");
        Usuario usuario2 = criadorDeUsuario.apply("Lucas");
        Usuario usuario3 = criadorDeUsuario.apply("Carlos");


        System.out.println("---- 1");

        usuarios.subList(0,1).forEach(u -> System.out.println(u.getNome()));

        System.out.println("---- 2");

        usuarios.stream().filter(u -> u.getPontos() > 150).forEach(u -> System.out.println(u.getNome()));

        System.out.println("---- 1");

        List<Integer> pontos = usuarios.stream().map(u -> u.getPontos()).collect(toList());

        pontos.forEach(System.out::println);

        System.out.println("---------------------------0");



//
//        double pontuacaoMedia = usuarios.stream().mapToInt(Usuario::getPontos)
//            .average().getAsDouble();
//
//        System.out.println(pontuacaoMedia);
//
//        System.out.println("~~~~~~~~~~~~~~~");
//
//        int total = usuarios.stream().reduce(0, (atual, u) -> atual + u.getPontos());

//        System.out.println("Total = "+total);


        System.out.println("~~~~~~~~~~~~~~~");

        IntStream.iterate(1, x -> x + 1).limit(10).forEach(System.out::println);




    }

}

