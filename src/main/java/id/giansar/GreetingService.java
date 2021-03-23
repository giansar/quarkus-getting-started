package id.giansar;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return name + ", piye kabarmu ?";
    }
}
