package willian.br;


public class ContaCorrente extends Conta{
    private final double CPMF = 0.0038;
    private double acumulador;
    
    public ContaCorrente(int numero, int agencia, double saldo) {
        super (numero, agencia, saldo);
        
    }
    
        
    
    public boolean sacar(double valor){
        if(getSaldo()>=valor){
        setSaldo(getSaldo() - valor);
        setAcumulador(getAcumulador() + (valor*CPMF));
        return true;
        }
        else{
            return false;
        }
          
    }
    
    public String toString(){
        return("Esse é o toString da conta corrente!");
    }



	public double getAcumulador() {
		return acumulador;
	}



	public void setAcumulador(double acumulador) {
		this.acumulador = acumulador;
	}

    
   
    
}
