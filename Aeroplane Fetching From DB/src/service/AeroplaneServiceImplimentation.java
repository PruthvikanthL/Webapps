package service;

import dto.AeroplaneDTO;
import repository.AeroplaneRepository;
import repository.AeroplaneRepositoryImplimentation;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AeroplaneServiceImplimentation implements AeroplaneService {

    @Override
    public boolean save(AeroplaneDTO aeroplaneDTO) {
        if (aeroplaneDTO == null) {
            System.out.println("DTO is null");
            return false;
        }

        String flightName = aeroplaneDTO.getFlightName();
        String flightNumber = aeroplaneDTO.getFlightNumber();
        String source = aeroplaneDTO.getSource();
        String destination = aeroplaneDTO.getDestination();
        String isDomestic = aeroplaneDTO.getIsDomestic();
        String departureDateStr = aeroplaneDTO.getDepartureDate();
        String arrivalTime = aeroplaneDTO.getArrivalTime();

        Map<String, String> errors = new HashMap<>();

        if (flightName == null || flightName.trim().isEmpty()) {
            System.out.println("Invalid Flight Name");
            errors.put("flightName", "Flight name is required.");
        }

        if (flightNumber == null || flightNumber.trim().isEmpty()) {
            System.out.println("Invalid Flight Number");
            errors.put("flightNumber", "Flight number is required.");
        }

        if (source == null || source.trim().isEmpty()) {
            System.out.println("Source is required.");
            errors.put("source", "Source is required.");
        }

        if (destination == null || destination.trim().isEmpty()) {
            System.out.println("Destination is required.");
            errors.put("destination", "Destination is required.");
        } else if (source != null && source.equalsIgnoreCase(destination)) {
            System.out.println("Source and Destination cannot be the same");
            errors.put("destination", "Source and Destination cannot be the same.");
        }

        if (isDomestic == null || !(isDomestic.equalsIgnoreCase("yes") || isDomestic.equalsIgnoreCase("no"))) {
            System.out.println("Invalid value for isDomestic");
            errors.put("isDomestic", "Please select Yes or No.");
        }

        if (departureDateStr == null || departureDateStr.trim().isEmpty()) {
            errors.put("departureDate", "Departure date is required.");
        } else {
            try {
                LocalDate departureDate = LocalDate.parse(departureDateStr);
                if (departureDate.isBefore(LocalDate.now())) {
                    errors.put("departureDate", "Departure date must be today or in future.");
                }
            } catch (Exception e) {
                errors.put("departureDate", "Invalid date format.");
            }
        }

        if (arrivalTime == null || arrivalTime.trim().isEmpty()) {
            System.out.println("Invalid Arrival Time");
            errors.put("arrivalTime", "Arrival time is required.");
        }

        if (!errors.isEmpty()) {
            aeroplaneDTO.setErrors(errors);
            System.out.println("Validation failed: " + errors);
            return false;
        }
        System.out.println("All validations passed. Saving data...");
        AeroplaneRepository aeroplaneRepository = new AeroplaneRepositoryImplimentation();
        return aeroplaneRepository.save(aeroplaneDTO);
    }

    @Override
    public Optional<AeroplaneDTO> findbyid(int id) {
        if(id>0){
            System.out.println("Running the findbyid method in AeroplaneServiceImplimentation");
            AeroplaneRepository aeroplaneRepository=new AeroplaneRepositoryImplimentation();
            return aeroplaneRepository.findbyid(id);

        }
        return AeroplaneService.super.findbyid(id);
    }
}
