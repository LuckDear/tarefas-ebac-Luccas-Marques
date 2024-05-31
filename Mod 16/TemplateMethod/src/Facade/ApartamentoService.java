package Facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos =  validaCampos(apartamento);
        if (isCadastrado && !isCamposValidos){
            return false;
        }
        return null;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        return false;
    }

    private Boolean validaCampos(Apartamento apartamento){
        return false;
    }
}
