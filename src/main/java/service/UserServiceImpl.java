package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.UserDao;

@Service("service")
public class UserServiceImpl implements UserService {

    private UserDao dao;

    @Override
    public double calcul() {
        double data = dao.getValue();
        return data * 2;
    }

    public UserServiceImpl() {}

    // Injection par constructeur (annotations)
    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
 
    // Injection par setter (XML ou annotations)
    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
