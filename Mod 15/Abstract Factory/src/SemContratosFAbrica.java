public class SemContratosFAbrica extends Fabrica {
    @Override
    Carro recuperaCarro(String solicitaGrade) {
        if ("A".equals(solicitaGrade)){
            return new Brasilia(60,"meio tanque","verde");
        } else if ("B".equals(solicitaGrade)) {
            return new Opala(50,"vazio","preto");
        }else {
            return null;
        }
    }
}
