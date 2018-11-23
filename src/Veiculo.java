
public abstract class Veiculo {
    protected int tipo;
    protected String placa;
    protected String modelo;
    protected String ano;
    
    
    public void setTipo(int tipo) {
	this.tipo = tipo;
    }
    public int getTipo() {
	return tipo;
    }
    
    
    public String getPlaca() {
	return placa;
    }
    public void setPlaca(String placa) {
	this.placa = placa;
    }
    
    
    public String getModelo() {
	return modelo;
    }
    public void setModelo(String modelo) {
	this.modelo = modelo;
    }
    
    public String getAno() {
	return ano;
    }
    public void setAno(String ano) {
	this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "Veículo: [Placa: " + placa +", Modelo: " + modelo + ", Ano: " +ano+"]";
    }
}