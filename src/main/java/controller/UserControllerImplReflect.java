package controller;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.io.File;

import dao.UserDao;
import service.UserService;

public class UserControllerImplReflect {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
            String daoClassname = scanner.next();
            String serviceClassname = scanner.next();
            scanner.close();

            Class<?> cdao = Class.forName(daoClassname);
            UserDao dao = (UserDao) cdao.getDeclaredConstructor().newInstance();

            Class<?> cservice = Class.forName(serviceClassname);
            UserService service = (UserService) cservice.getDeclaredConstructor().newInstance();

            Method meth = cservice.getMethod("setDao", UserDao.class);
            meth.invoke(service, dao);

            System.out.println("Résultat (réflexion) = " + service.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
