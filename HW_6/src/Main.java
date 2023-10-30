import java.util.LinkedList;
import java.util.Queue;


class ClubSecurity {

    private final Queue<Visitor> queue = new LinkedList<>();


    public void addVisitor(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.name() + " is in queue.");
    }


    public void checkAgeAndApprove() {


        while (!queue.isEmpty()) {
            Visitor visitor = queue.poll();
            if (visitor.age() >= 21) {
                System.out.println(visitor.name() + " age approved, have fun!");
            } else {
                System.out.println(visitor.name() + " grow up! Chao");
            }
        }
    }

    record Visitor(String name, int age) {
    }


    public static void main(String[] args) {
        ClubSecurity security = new ClubSecurity();

        Visitor visitor1 = new Visitor("Den", 25);
        Visitor visitor2 = new Visitor("Sasha", 19);
        Visitor visitor3 = new Visitor("Gena Bukin", 40);

        security.addVisitor(visitor1);
        security.addVisitor(visitor2);
        security.addVisitor(visitor3);

        security.checkAgeAndApprove();
    }

}


