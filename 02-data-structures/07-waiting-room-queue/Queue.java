public interface Queue {
    public boolean canDoctorGoHome();
    public void registerPatient(Patient p) throws QueueOverflowException;
    public Patient servePatient () throws QueueUnderflowException;
}
