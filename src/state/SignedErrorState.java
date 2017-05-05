package state;

/**
 * Created by Di on 05.05.2017.
 */
public class SignedErrorState implements State
{

    @Override
    public void setNextState(Document document) {

    }

    @Override
    public void errorState(Document document) {
        if (document.getState() instanceof SignedState && document.isDocumentOk() == false)
        {
            System.out.println("Erorr of signing");
        }
    }

    @Override
    public void setPreviousState(Document document) {

    }
}
