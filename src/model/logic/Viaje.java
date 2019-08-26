package model.logic;

public class Viaje {
	//Identificador único de la zona de origen de los viajes relacionados
	public int sourceid;
	
	// Identificador único de la zona de destino de los viajes relacionados
	public int dstid;
	
	//(hour of day): hora (entera) del día del servicio relacionado
	public int hod;
	
	//tiempo promedio en segundos de los viajes relacionados
	public double mean_travel_time;
	
	//desviación estándar de los viajes relacionados
	public double standard_deviation_travel_time;
	
	//tiempo promedio geométrico en segundos de los viaje relacionados
	public double geometric_mean_travel_time;
	
	//desviación estándar geométrica de los viajes relacionados
	public double geometric_standard_deviation_travel_time;
	
	public Viaje(int pSourceid, int pDstid, int pHod, double pMean_travel_time, double pStandard_deviation_travel_time, double pGeometric_mean_travel_time, double pGeometric_standard_deviation_travel_time )
	{
		sourceid = pSourceid;
		dstid = pDstid;
		hod = pHod;
		mean_travel_time = pMean_travel_time;
		standard_deviation_travel_time = pStandard_deviation_travel_time;
		geometric_mean_travel_time = pGeometric_mean_travel_time;
		geometric_standard_deviation_travel_time = pGeometric_standard_deviation_travel_time;
	}
	
}
