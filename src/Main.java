// Client
public class Main {
    public static void main(String[] args) {
        ISupportService frontDesk = new FrontDeskSupport();
        ISupportService supervisor = new SupervisorSupport();
        ISupportService manager = new ManagerSupport();

        frontDesk.setNext(supervisor);
        supervisor.setNext(manager);

        ServiceRequest requestA = new ServiceRequest(ETypeRequest.LEVEL_ONE, "ça marche pas");
        ServiceRequest requestB = new ServiceRequest(ETypeRequest.LEVEL_TWO, "ça marche pas, et j'ai déjà reboot");
        ServiceRequest requestC = new ServiceRequest(ETypeRequest.LEVEL_THREE, "Demande de remboursement");
        ServiceRequest requestD = new ServiceRequest(ETypeRequest.OTHER, "???????");

        frontDesk.handleRequest(requestA);
        frontDesk.handleRequest(requestB);
        frontDesk.handleRequest(requestC);
        frontDesk.handleRequest(requestD);

        System.out.println(requestA.getConclusion());
        System.out.println(requestB.getConclusion());
        System.out.println(requestC.getConclusion());
        System.out.println(requestD.getConclusion());

    }
}