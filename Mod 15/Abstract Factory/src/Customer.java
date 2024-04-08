public class Customer {
    private String solicitaGrade;
    private boolean possuiContrato;

    public Customer (String solicitaGrade, boolean possuiContrato){
        this.solicitaGrade = solicitaGrade;
        this.possuiContrato = possuiContrato;
    }
    public boolean possuiContrato(){
        return possuiContrato;
    }
    public String solicitaGrade(){
        return solicitaGrade;
    }
}
