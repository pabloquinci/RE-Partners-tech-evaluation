package problema7;

public class EntradaCantidadVentas {
	
	private int cantidadVendida;
	private int cantEntradasVendedor;
	
	public EntradaCantidadVentas(int cantidadVendida, int canEntradasVendedor){
		this.cantidadVendida=cantidadVendida;
		this.cantEntradasVendedor=canEntradasVendedor;
	}
	public int getCantidadVendida() {
		return cantidadVendida;
	}
	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	public int getCantEntradasVendedor() {
		return cantEntradasVendedor;
	}
	public void setCantEntradasVendedor(int cantEntradasVendedor) {
		this.cantEntradasVendedor = cantEntradasVendedor;
	}
	
	

}
