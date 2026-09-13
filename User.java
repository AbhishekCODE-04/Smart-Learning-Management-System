class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
