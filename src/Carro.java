
public class Carro extends Veiculo {
    String quantPortas;
    String acessorios;
    
    
    public String getQuantPortas() {
    return quantPortas;
    }
    public void setQuantPortas(String quantPortas) {
    this.quantPortas = quantPortas;
    }
    
    
    @Override
    public String toString() {
        return "Veículo: [Placa: " + placa +", Modelo: " + modelo + ", Ano: " +ano+", Quantidade de Portas"+quantPortas+", Acessorios:"+acessorios+"]";
    }
}
