package src.Polimorfismo.test;

import src.Polimorfismo.classes.ArquivoDAOImpl;
import src.Polimorfismo.classes.DatabaseDAOImpl;
import src.Polimorfismo.classes.GenericDAO;

public class DAOTest {

    public static void main(String[] args) {

        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();
    }
}
