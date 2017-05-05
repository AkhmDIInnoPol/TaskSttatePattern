package state;

/**
 * Created by Di on 05.05.2017.
 */
public interface State
{


    void setNextState(Document document);

    void errorState(Document document);

    void setPreviousState(Document document);
}
