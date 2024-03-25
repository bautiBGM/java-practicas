package Ejercicio_09;

public class CuentaBancaria {

	private String cbu;
	private TipoCuenta tipo;
	private double saldo = 0;
	private Persona titular;
	
	
	
	
	public CuentaBancaria(String cbu, String tipoCuenta, double saldo) {
		this.cbu = cbu;
		this.tipo = tipo;
		this.saldo = saldo;
		
	}
	public String getCbu() {
		return cbu;
	}
	private void setCbu(String cbu) {
		this.cbu = cbu;
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {

		this.titular = titular;
	}
	
	
	public String generarCbu(String nuevoCbu) {
		
		return "" + tipo.ordinal();
	}
	
	public double obtenerSaldo(double nuevoSaldo) {
		return saldo;
	}
	
	public void depositar(double montoEnviado) {
		this.saldo += montoEnviado;
	}
	
	public boolean extraer(double montoExtraido) {
		boolean pudoExtraer = false;
		
		if (this.obtenerSaldo(saldo)> montoExtraido) {
			pudoExtraer = true;
			this.saldo -= montoExtraido ;
			
		}
		return pudoExtraer;
	}
	
	
	public String toString() {
		return "CuentaBancaria: CBU:" + cbu + ", tipoCuenta: " + tipo + ", saldo: " + saldo + ".";
	}
	
}
