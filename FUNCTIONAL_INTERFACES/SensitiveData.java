public interface SensitiveData {} // Marker interface

class CustomerData implements SensitiveData {
    String ssn;
}