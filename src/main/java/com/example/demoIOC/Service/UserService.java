package com.example.demoIOC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final NotificationService notificationService;

    // Inyección de dependencias a través del constructor
    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {
        System.out.println("Registrando usuario: " + username);
        notificationService.sendNotification("Usuario " + username + " registrado con éxito.");
    }
}
