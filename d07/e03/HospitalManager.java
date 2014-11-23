class HospitalManager {
    private Patient patientListStart = null;
    public static void launch() {
        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        patientListStart = firstPatient;
        Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
        patientListStart.addPatient(yetAnotherPatient);
    }
    

    public static void main(String[] args) {
       HospitalManager hm = new HospitalManager();
    }
}