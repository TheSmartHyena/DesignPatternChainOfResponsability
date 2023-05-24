// ConcreteHandler
public class ManagerSupport implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ETypeRequest.LEVEL_THREE) {
            request.setConclusion("Manager solved level three request !!");
        } else {
            if (next != null){
                next.handleRequest(request);
            } else {
                request.setConclusion("Your request could not be handled at this time.");
            }
        }
    }
}
