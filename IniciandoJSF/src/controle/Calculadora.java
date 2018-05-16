package controle;

public class Calculadora {

	private double valor1;
	private double valor2;
	private double resultado;

	public void somar() {

		resultado = valor1 + valor2;

	}

	public Double getValor1() {

		return valor1;

	}
	public void setValor1(Double valor1) {
		this.valor1 = valor1;
		
		
	}
	public double getValor2(){
		
		return valor2;
		
	}
	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}
	public Double getResultado() {
		return resultado;
		
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
		
	}
}

