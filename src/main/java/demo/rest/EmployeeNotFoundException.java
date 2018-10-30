package demo.rest;

public class EmployeeNotFoundException extends Exception {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
