package pilarespoo.encapsulamiento.vehiculos;

public class Vehiculo {

  private String marca;
  private String linea;
  private Integer annio;
  private Double kilometraje;

  public Vehiculo(String marca, String linea, Integer annio, Double kilometraje) {
    this.marca = marca;
    this.linea = linea;
    setAnnio(annio);
    this.kilometraje = kilometraje;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getLinea() {
    return linea;
  }

  public void setLinea(String linea) {
    this.linea = linea;
  }

  public Integer getAnnio() {
    return annio;
  }

  public void setAnnio(Integer annio) {
    if (annio < 2000) {
      System.out.println("Año no válido para un vehículo.");
      return;
    }
    this.annio = annio;
  }

  public Double getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(Double kilometraje) {
    if (kilometraje < 0) {
      System.out.println("Kilometraje no puede ser negativo.");
      return;
    }
    this.kilometraje = kilometraje;
  }

  public void actualizarKilometraje(Double nuevoKilometraje) {
    if (nuevoKilometraje < 0 || nuevoKilometraje < this.kilometraje) {
      System.out.println("Nuevo kilometraje no puede ser negativo o menor que el actual.");
      return;
    }
    this.kilometraje = nuevoKilometraje;
  }

  @Override
  public String toString() {
    return "Vehiculo{" +
        "marca='" + marca + '\'' +
        ", linea='" + linea + '\'' +
        ", annio=" + annio +
        ", kilometraje=" + kilometraje +
        '}';
  }
}
