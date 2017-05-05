package state;

/**
 * Created by Di on 05.05.2017.
 */
public class NewState implements State
{

    @Override
    public void setNextState(Document document) {
        if (document.getState() instanceof NewState)
        {
            System.out.println("New document state.");
            document.setState(new SignedState());
            document.getState().setNextState(document);
        }

    }

    @Override
    public void errorState(Document document) {

    }

    @Override
    public void setPreviousState(Document document) {

    }
}
