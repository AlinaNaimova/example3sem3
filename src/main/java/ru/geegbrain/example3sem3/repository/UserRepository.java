package ru.geegbrain.example3sem3.repository;


import org.springframework.stereotype.Component;
import ru.geegbrain.example3sem3.domain.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users = new ArrayList<>();

}