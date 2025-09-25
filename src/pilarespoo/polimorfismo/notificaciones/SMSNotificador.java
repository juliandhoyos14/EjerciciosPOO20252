package pilarespoo.polimorfismo.notificaciones;

public class SMSNotificador implements Notificador {

  @Override
  public void enviarNotificacion(String mensaje, String destinatario) {
    System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
  }
}
