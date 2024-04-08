public class ContratosFabrica extends Fabrica {
    @Override
    Carro recuperaCarro(String solicitaGrade) {
        if ("A".equals(solicitaGrade)){
            return new Corola(100,"cheio","cinza");
        } else if ("B".equals(solicitaGrade)) {
            return new HB20(120,"cheio","Vermelho");
        }else {
            return null;
        }
    }
}
