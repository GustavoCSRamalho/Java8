import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Capitulo2_1 {

    public static void main(String[] args) throws IOException {

        Usuario user1 = new Usuario("Paulo Silveira", 150, true);
        Usuario user2 = new Usuario("Rodrigo Turini", 120, true);
        Usuario user3 = new Usuario("Guilherme Silveira", 90);
        Usuario user4 = new Usuario("Sergio Lopes", 120);
        Usuario user5 = new Usuario("Adriano Almeida", 100);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5);


        List<Usuario> filtradosOrdenados = usuarios.parallelStream().filter(u -> u.getPontos() > 100)
                .sorted(Comparator.comparing(Usuario::getNome)).collect(toList());

        filtradosOrdenados.stream().map(Usuario::getNome).forEach(System.out::println);



















        //
////        Map<Integer, List<Usuario>> pontuacao = new HashMap<>();
////        for(Usuario u: usuarios) { pontuacao.computeIfAbsent(u.getPontos(), user -> new ArrayList<>()).add(u);
////        }
//
//        Map<Boolean, List<Usuario>> moderadores = usuarios.stream().collect(partitioningBy(Usuario::isModerador));
////
//        System.out.println(moderadores);
//
//        Map<Boolean, List<String>> nomes = usuarios.stream().collect(
//                partitioningBy(Usuario::isModerador,mapping(Usuario::getNome,toList())));
////
//        System.out.println(nomes);
//
//        Map<Boolean, Integer> soma = usuarios.stream().collect(
//                partitioningBy(Usuario::isModerador,summingInt(Usuario::getPontos)));
////
//        System.out.println(soma);






//        List<String> list =
//                Files.list(Paths.get("/home/gustavo.castro/Documents")).map(u -> u.toString()).
//                        filter(u -> u.toString().endsWith(".txt")).
//                        collect(Collectors.toList());
//        list.forEach(System.out::println);
    }
}
