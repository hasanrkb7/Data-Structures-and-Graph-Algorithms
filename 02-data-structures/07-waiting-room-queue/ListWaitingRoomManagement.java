public class ListWaitingRoomManagement implements Queue{
    int size;
    Node front;
    Node rear;

    public ListWaitingRoomManagement(){
        size = 0;
        front = null;
        rear = null;
    }


    @Override
    public boolean canDoctorGoHome() {
        if (size == 0){
            System.out.println("Yes Doctor Can Go Home");
            return true;
        }
        else {
            System.out.println("No, There are Some patient in the Waiting room. Please Serve all the Patient then you can free to go.");
            return false;
        }
    }

    @Override
    public void registerPatient(Patient p) throws QueueOverflowException {
        if (front == null){
            front = new Node(p, null);
            size++;
            rear = front;
        }
        else{
            Node temp = rear;
            rear = new Node(p, null);
            size++;
            temp.next = rear;
            temp = rear;
        }
    }

    @Override
    public Patient servePatient() throws QueueUnderflowException{
        if (size == 0){
            throw new QueueUnderflowException();
        }
        else{
            Patient patient = (Patient) front.value;
            Node temp = front.next;
            front = null;
            front = temp;
            size--;
            return patient;
        }
    }
    public void cancelAll(){
        for (Node i = front; i != null; i = i.next) {
            Node temp = front.next;
            front = null;
            front = temp;
            size--;
        }
    }

    public void showAllPatient (){
        for (Node i = front; i != null; i = i.next) {
            System.out.println(i.value);
        }
    }
}
