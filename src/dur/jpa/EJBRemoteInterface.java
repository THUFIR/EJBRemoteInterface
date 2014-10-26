
package dur.jpa;

import javax.ejb.Remote;

@Remote
public interface EJBRemoteInterface {

    String getResult();
    
    public int getNext();
}
