public class Tester {
    public static void main(String[] args) {

        // For Circular Array based Queue
        waitingRoomManagement wrm = new waitingRoomManagement();
        Patient p1 = new Patient("Bob", 25, "b+ve");
        Patient p2 = new Patient("VMZ", 26, "b+ve");
        Patient p3 = new Patient("CBE", 27, "b+ve");
        Patient p4 = new Patient("ASD", 28, "b+ve");
        Patient p5 = new Patient("GCA", 28, "b+ve");
        Patient p6 = new Patient("AFE", 28, "b+ve");
        try {
            wrm.registerPatient(p1);
            wrm.registerPatient(p2);
            wrm.registerPatient(p3);
            wrm.registerPatient(p4);
            //wrm.registerPatient(p5);
        } catch (QueueOverflowException e) {
            System.err.println("There is No space in the Emergency Word. Please go another Hospital ASAP. A Big Sorry for inconvenience");
        }
        System.out.println("Registered Patients are: ");
        wrm.showAllPatient();

        try {
            wrm.servePatient();
        } catch (QueueUnderflowException e) {
            System.err.println("There is no Patient to serve");
        }

        System.out.println("Registered Patients are: ");
        wrm.showAllPatient();

        wrm.canDoctorGoHome();

        wrm.cancelAll();

        wrm.canDoctorGoHome();

/*
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("For Linked List based Queue");

        ListWaitingRoomManagement lwrm = new ListWaitingRoomManagement();

        Patient lp1 = new Patient("xyz", 35, "0+ve");
        Patient lp2 = new Patient("mnb", 36, "0-ve");
        Patient lp3 = new Patient("gfd", 37, "A+ve");
        Patient lp4 = new Patient("ert", 38, "B+ve");

        try {
            lwrm.registerPatient(lp1);
            lwrm.registerPatient(lp2);
            lwrm.registerPatient(lp3);
            lwrm.registerPatient(lp4);
        } catch (QueueOverflowException e) {
            System.err.println("There is No space in the Emergency Word. Please go another Hospital ASAP. A Big Sorry for inconvenience");
        }
        lwrm.showAllPatient();

        try {
            lwrm.servePatient();
        } catch (QueueUnderflowException e) {
            System.err.println("There is no Patient to serve");
        }

        lwrm.canDoctorGoHome();

        lwrm.cancelAll();

        lwrm.canDoctorGoHome();
    */
    }
}
