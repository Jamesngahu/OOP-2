package association_abstraction_composition;

public class MainApplication {
    public static void main(String[] args) {

        Admin curAdmin = new Admin(1738, "James", "S3m@jng@");

        User curUser = new User(1808, "Ngatika");

        curAdmin.performOperation(new Update());

        curUser.performOperation(new View());


    }

}
