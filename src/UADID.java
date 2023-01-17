import java.util.ArrayList;

public class UADID {
    public String getMESSAGEID() {
        return MESSAGEID;
    }

    public void setMESSAGEID(String MESSAGEID) {
        this.MESSAGEID = MESSAGEID;
    }

    public String getMESSAGENAME() {
        return MESSAGENAME;
    }

    public void setMESSAGENAME(String MESSAGENAME) {
        this.MESSAGENAME = MESSAGENAME;
    }

    public ArrayList getCONTEXT() {
        return CONTEXT;
    }

    public void setCONTEXT(ArrayList CONTEXT) {
        this.CONTEXT = CONTEXT;

    }

    private String MESSAGEID;
    private String MESSAGENAME;
    private ArrayList CONTEXT;
}
