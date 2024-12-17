package com.example.demoIOC.Service;

import org.springframework.stereotype.Service;

@Service // Anotamos esta clase como un bean manejado por Spring
public class NotificationService {

    public void sendNotification(String message) {
        System.out.println("Enviando notificación: " + message);
    }

    // Método de inicialización personalizado
    public void init() {
        System.out.println("NotificationService inicializado.");
    }

    // Método de destrucción personalizado
    public void destroy() {
        System.out.println("NotificationService destruido.");
    }
}
