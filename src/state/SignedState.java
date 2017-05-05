package state;

/**
 * Created by Di on 05.05.2017.
 */
public class SignedState implements State
{

    @Override
    public void setNextState(Document document) {
        if (document.getState() instanceof NewState && document.isDocumentOk())
        {
            System.out.println("Signed state.");
            document.setState(this);
        }
    }

    @Override
    public void errorState(Document document) {

    }

    @Override
    public void setPreviousState(Document document) {

    }
}
