// Handler
public interface ISupportService {
    void setNext(ISupportService next);
    void handleRequest(ServiceRequest request);
}