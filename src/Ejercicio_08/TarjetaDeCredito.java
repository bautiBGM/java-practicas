package Ejercicio_08;

public class TarjetaDeCredito {

	private String numero; 
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual = 0;
	
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
	}


	public String getNumero() {
		return this.numero;
	}
	
	private void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return this.titular;
	}
	
	private void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}
	
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	

	public double getAcumuladoActual() {
		return this.acumuladoActual;
	}

	public double montoDisponible() {
		double diferencia = 0;
		diferencia = this.limiteDeCompra - this.acumuladoActual ;
		if (diferencia <= 0 ) {
			diferencia = 0; 
		}
		return diferencia;
	}

	private boolean compraPosible(double monto) {
		boolean control = false;
		double calculo = 0;
		if ( this.montoDisponible() != 0) {
			calculo = this.montoDisponible() - monto;
		}
		if(calculo > 0 ) {
			control = true;
		}
		return control;
	}
	
	public void actualizarLimite(double monto) {
		this.setLimiteDeCompra(monto);
	}
	
	private void acumularGastoActual(double monto) {
		this.acumuladoActual += monto;
	}
	
	public boolean realizarCompra(double monto) {
		boolean realizar = false;
		if (this.compraPosible(monto)) {
			this.acumularGastoActual(monto);
			realizar = true;
		}
		return realizar;
	}

	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible=" + montoDisponible() + "]";
	}


}
