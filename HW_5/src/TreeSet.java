import java.util.Comparator;

public class TreeSet {
    public static void main(String[] args) {

        Comparator<FullName> firstNameComparator = Comparator.comparing(FullName::getFirstName);
        java.util.TreeSet<FullName> fullNameSet = new java.util.TreeSet<>(firstNameComparator);

        fullNameSet.add(new FullName("Mr", "Nobody"));
        fullNameSet.add(new FullName("John", "Lenon"));
        fullNameSet.add(new FullName("Irina", "Irkina"));

        for (FullName fullName : fullNameSet) {
            System.out.println(fullName);
        }
    }
}
