package pilarespoo.polimorfismo.notificaciones;

public class GestorNotificaciones {

  public static void main(String[] args) {
    // Crear instancias de los notificadores
    Notificador email = new EmailNotificador();
    Notificador sms = new SMSNotificador();
    Notificador push = new PushNotificador();

    String mensaje = "Tu pedido ha sido enviado!";
    String destinatarioEmail = "destinatario@gmail.com";
    String destinatario = "300786987";

    email.enviarNotificacion(mensaje, destinatarioEmail);
    sms.enviarNotificacion(mensaje, destinatario);
    push.enviarNotificacion(mensaje, destinatario);
  }
}
