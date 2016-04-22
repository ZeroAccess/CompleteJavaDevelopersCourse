package InterfacesChallenge;

import java.util.List;

/**
 * Created by robertsg on 4/21/2016.
 */
public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);
}
