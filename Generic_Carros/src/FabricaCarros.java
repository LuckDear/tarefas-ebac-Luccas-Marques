import java.util.ArrayList;
import java.util.List;

public class FabricaCarros<T> {
    List<T> galpao = new ArrayList<>();

    public void printar(){
        if (galpao.isEmpty()){
            throw new IllegalStateException("Galpão vazio.");
        }else {
            for (int i = 0; i < galpao.size(); i++){
                System.out.println(galpao.get(i));
            }
        }
    }
}
