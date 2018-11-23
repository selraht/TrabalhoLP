public class Motocicleta extends Veiculo {
    
    String tipoPainel;
    
    
    public String getTipoPainel() {
	return tipoPainel;
    }

    public void setTipoPainel(String tipoPainel) {
	this.tipoPainel = tipoPainel;
    }
    
    @Override
    public String toString() {
        return "Veículo: [Placa: " + placa +", Modelo: " + modelo + ", Ano: " +ano+",+ Tipo painel: "+tipoPainel+"]";
    }
}
