package controller;

import dao.UserDaoImpl;
import service.UserServiceImpl;

public class UserControllerImplStatic {
    public static void main(String[] args) {
        UserDaoImpl dao = new UserDaoImpl();
        UserServiceImpl service = new UserServiceImpl();
        service.setDao(dao);
        System.out.println("Résultat (instanciation statique) = " + service.calcul());
    }
}
