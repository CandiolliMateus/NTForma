package src.Polimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando no banco de dados.");
    }
}
