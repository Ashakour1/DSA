package LinkedStack;
public class Main {
    public static void main(String[] args) {
        Linkedstack<String> names = new Linkedstack<>();

        names.push("abdi");
        names.push("ali");
        names.push("moha");
        names.push("Hassan");
        names.push("ahmed");

        System.out.println("\nsearch(Abdi) :" + names.searchElement("moha") );




    }
}