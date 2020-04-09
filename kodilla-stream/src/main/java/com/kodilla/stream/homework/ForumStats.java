package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
       double avg = UsersRepository.getUserList()
                .stream()
                .filter(a->a.getAge() >= 40)
                .mapToInt(n->n.getNumberOfPosts())
                .average()
               .getAsDouble();
        //System.out.println(avg);

       double avg2  = UsersRepository.getUserList()
               .stream()
               .filter(a->a.getAge() < 40)
               .mapToInt(u->u.getNumberOfPosts())
               .average()
               .getAsDouble();
        //System.out.println(avg2);
        System.out.println("Srednia liczba postow uzytkownikow w wieku powyzej lub rownym 40 lat wynosi: " + avg + " Srednia liczba postow uzytkownikow w wieku ponizej 40 lat wynosi: " + avg2);

    }
}
