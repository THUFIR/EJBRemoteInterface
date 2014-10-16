package ejb;

import javax.ejb.Remote;

@Remote
public interface SingletonSessionBeanRemoteInterface {

    public int next();
}
