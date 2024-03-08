package ru.geegbrain.example3sem3.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geegbrain.example3sem3.domain.User;

@Service
public class RegistrationService {


    @Autowired
    private DataProcessingService dataProcessingService;

    //Поля UserService, NotificationService
    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    //Метод processRegistration
    public void processRegistration(String name, int age, String email){
        // creating user
        User user = userService.createUser(name, age, email);

        // adding user to repository
        dataProcessingService.addUserToList(user);


        // output a message
        notificationService.notifyUser(user);
    }
}