package codesection1.GenericStack;

public class GenericStackMain {
    public static void main(String[] args) {
        GenericStack<Integer> integer = new GenericStack<>();
        integer.push(15);
        integer.push(20);
        integer.push(30);
        System.out.println(integer.peek());
        System.out.println(integer.isEmpty());
        System.out.println("-----------------");

        GenericStack<String> string = new GenericStack<>();

        string.peek();
        System.out.println(string.isEmpty());
    }
}
