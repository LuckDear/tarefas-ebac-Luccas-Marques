import java.util.HashMap;
import java.util.Map;

public class CarroMapDAO extends GenericDAO<Carros> implements ICarroDAO {

    public CarroMapDAO(){
        super();
        Map<Long, Carros> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Carros> getTipoClasse() {
        return Carros.class;
    }

    @Override
    public void atualizarDados(Carros entity, Carros objetoCadastrado) {

    }

}
