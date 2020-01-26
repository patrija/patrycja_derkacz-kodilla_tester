public class UserMain {
    public static void main(String[] args) {

        User user1 = new User("Grazyna", 45);
        User user2 = new User("Janusz", 55);
        User user3 = new User("Maksymilian", 15);
        User user4 = new User("Jola", 18);
        User user5 = new User("Krzysztof", 25);

        User[] allUsers = new User[] {user1, user2, user3, user4, user5};

        int suma = 0;
        for (int i = 0; i < allUsers.length; i++) {
           // System.out.println(allUsers[i].age);
            suma= suma + allUsers[i].age;
        }

        System.out.println(suma);

        int avg = suma/allUsers.length;
        System.out.println(avg);

        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i].age < avg) {
                System.out.println(allUsers[i].name);
            }
        }
    }
}
