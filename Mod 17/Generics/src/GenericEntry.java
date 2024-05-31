public class GenericEntry {
    public static void main(String[] args) {
        ExemploGenericEntry<String> entry = new ExemploGenericEntry<>("Teste");
        System.out.println(entry.getData());

        ExemploGenericEntry<Long> entryLong = new ExemploGenericEntry<>(10L);
        System.out.println(entryLong.getData());
    }
}
