public class CEspecial extends CCorrente {
    private int limite;
    
    public CEspecial (int num, float sal, int lim){
        super(num, sal);
        this.limite = lim;
                
    }
    
    @Override
    public void debitar(float valor){
        if (valor <= (super.getSaldo() + this.limite))
            super.setSaldo(super.getSaldo()-valor);
        
        else
            System.out.println("Saldo Insuficiente");
    }
    
    public String toString(){
        return(super.toString() + " Limite: " + this.limite);
    }
}
