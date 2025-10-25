package dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class UserDaoImpl implements UserDao {
    @Override
    public double getValue() {
        // valeur simulée ; remplacez par une vraie source de données selon vos besoins
        return 10.0;
    }
}
