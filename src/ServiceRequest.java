public class ServiceRequest {
    private ETypeRequest type;
    private String request = "";
    private String conclusion = "";

    public ServiceRequest(ETypeRequest type, String request) {
        this.type = type;
        this.request = request;
    }

    public ETypeRequest getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
