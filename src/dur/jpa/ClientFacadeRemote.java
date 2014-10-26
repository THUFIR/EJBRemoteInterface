package dur.jpa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ClientFacadeRemote {

    void create(Client client);

    void edit(Client client);

    void remove(Client client);

    Client find(Object id);

    List<Client> findAll();

    List<Client> findRange(int[] range);

    int count();
    
}
