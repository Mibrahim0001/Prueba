package cajaNegra;

public class Caja {
	public static void main(String[] args) {
		//System.out.println(app("retirar", 100, 2000));
	}
	public static String app(String operaciones, int cantidad, int saldoInicial) {
		operaciones = operaciones.toLowerCase();
		if ((!operaciones.equals("ingresar")) && (!operaciones.equals("retirar"))) return "Operacion no valida";
		
		
		if (saldoInicial <= 0)
			return "El saldo inicial indicado no es posible";
		if (operaciones.equals("retirar")) {
			if (cantidad <= 0 || (cantidad % 50 != 0)) {
				return "La cantidad ha de ser multiplo de 50 y mayor que 0";
				}
			saldoInicial -= cantidad;
			return "Ya tiene disponible su dinero. Su saldo es de "+saldoInicial+"�";
		}else {
			if(cantidad <= 0) {
				return "La cantidad ha de ser mayor que 0";
			}
			saldoInicial = saldoInicial +cantidad;
			return "El saldo actual es de " + saldoInicial + "�";
		}
	}
}
