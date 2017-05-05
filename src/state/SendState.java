package state;

/**
 * Created by Di on 05.05.2017.
 */
public class SendState implements State
{


    @Override
    public void setNextState(Document document) {
        System.out.println("Send state.");
        document.setState(new SendState());

        if (document.isDocumentOk())
        {
            document.setState(new NewState());
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
