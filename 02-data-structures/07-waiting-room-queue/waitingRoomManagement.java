public class waitingRoomManagement implements Queue{
    Object [] data;
    int front;
    int rear;
    int size;
    int id;

    public waitingRoomManagement () {
        data = new Object[5];
        front = 0;
        rear = 0;
        size = 0;
        id = 1000;
    }

    public boolean canDoctorGoHome(){
        if (size == 0){
            System.out.println("Yes Doctor Can Go Home");
            return true;
        }
        else {
            System.err.println("No, There are Some patient in the Waiting room. Please Serve all the Patient then you can free to go.");
            return false;
        }
    }

    public void registerPatient (Patient p) throws QueueOverflowException{
        if (size == data.length){
            throw new QueueOverflowException();
        }

        p.id = id;
        data [rear] = p;
        rear = (rear+1) % data.length;
        id++;
        size++;
    }

    public void cancelAll(){
        for (int i = front; i < rear; i = (i+1) % data.length) {
            data [i] = null;
            size--;
        }
    }

    public Patient servePatient() throws QueueUnderflowException{
        if (size == 0){
            throw new QueueUnderflowException();
        }
        Patient patient = (Patient) data [front];
        data [front] = null;
        front = (front+1) % data.length;
        size--;
        return patient;
    }
    
    public String [] sort(){
        String [] sortName = new String[data.length];
        for (int i = front, j = 0; j < size; i = (i+1) % data.length, j++) {
            Patient patient = (Patient) data [i];
            sortName [j] = patient.name;
        }

        int maxIdx;
        for (int i = 0; i < sortName.length-1; i++) {
            maxIdx = i;
            for (int j = i+1; j < sortName.length; j++) {
                if (sortName[maxIdx].compareTo(sortName[j]) > 0) {
                    maxIdx = j;
                }
            }
                String t = sortName[i];
                sortName[i] = sortName[maxIdx];
                sortName[maxIdx] = t;
        }
        return sortName;
    }

    public void showAllPatient(){
        //String [] s = sort();
        for (int i = front, j = 0; j < size; i = (i+1) % data.length, j++) {
            Patient patient = (Patient) data [i];

            System.out.println("ID# "+patient.id + ", Name:" + patient.name);
        }
        System.out.println();
        System.out.println();
    }
}
