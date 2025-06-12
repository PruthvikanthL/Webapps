package service;

import dto.AeroplaneDTO;
import repository.AeroplaneRepository;
import repository.AeroplaneRepositoryImplimentation;

import java.time.LocalDate;

public class AeroplaneServiceImplimentation implements AeroplaneService {

    @Override
    public boolean save(AeroplaneDTO aeroplaneDTO) {
        if (aeroplaneDTO != null) {

            String flightName = aeroplaneDTO.getFlightName();
            String flightNumber = aeroplaneDTO.getFlightNumber();
            String source = aeroplaneDTO.getSource();
            String destination = aeroplaneDTO.getDestination();
            String isDomestic = aeroplaneDTO.getIsDomestic();
            LocalDate departureDate = LocalDate.parse(aeroplaneDTO.getDepartureDate());
            String arrivalTime = aeroplaneDTO.getArrivalTime();

            if (flightName == null || flightName.trim().isEmpty()) {
                System.out.println("Invalid Flight Name");
                return false;
            }

            if (flightNumber == null || flightNumber.trim().isEmpty()) {
                System.out.println("Invalid Flight Number");
                return false;
            }

            if (source == null || source.trim().isEmpty() ||
                    destination == null || destination.trim().isEmpty()) {
                System.out.println("Source or Destination is empty");
                return false;
            }

            if (source.equalsIgnoreCase(destination)) {
                System.out.println("Source and Destination cannot be the same");
                return false;
            }

            if (isDomestic == null || !(isDomestic.equalsIgnoreCase("yes") || isDomestic.equalsIgnoreCase("no"))) {
                System.out.println("Invalid value for isDomestic");
                return false;
            }

            if (departureDate == null || departureDate.isBefore(LocalDate.now())) {
                System.out.println("Departure Date must be today or in future");
                return false;
            }

            if (arrivalTime == null || arrivalTime.trim().isEmpty()) {
                System.out.println("Invalid Arrival Time");
                return false;
            }

            System.out.println("All validations passed, data is valid.");
            AeroplaneRepository aeroplaneRepository=new AeroplaneRepositoryImplimentation();
            return aeroplaneRepository.save(aeroplaneDTO);
        }

        System.out.println("DTO is null");
        return false;
    }
}
