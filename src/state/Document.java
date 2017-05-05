package state;

/**
 * Created by Di on 05.05.2017.
 */
public class Document
{
    private State state;

    private boolean isDocumentOk = true;


    public boolean isDocumentOk() {
        return isDocumentOk;
    }

    public void setDocumentOk(boolean documentOk) {
        isDocumentOk = documentOk;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
