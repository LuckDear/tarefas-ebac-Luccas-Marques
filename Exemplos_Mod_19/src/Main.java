import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class classe = Produto.class;

        System.out.println(classe);

        Produto prod = new Produto();
        Class classe1 = prod.getClass();
        System.out.println(classe1);

        try {
            Constructor cons = classe.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields){
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }
            Method[] method = prod1.getClass().getDeclaredMethods();
            for (Method m : method){
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);

                System.out.println("Executando metodos");
                if (m.getName().startsWith("get")){
                    System.out.println(m.invoke(prod1));
                }else {
                    for (Class classesTypes : m.getParameterTypes()){
                        if (classesTypes.equals(String.class)){
                            System.out.println(m.invoke(prod1, "Luccas"));
                        } else if (classesTypes.equals(Long.class)) {
                            System.out.println(m.invoke(prod1,1l));
                        }else {
                            System.out.println(m.invoke(prod1, 2d));
                        }
                    }

                }

            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}