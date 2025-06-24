package fridge.repository;

import fridge.dto.FridgeDto;

import java.util.Collection;

public interface FridgeRepository {
    Collection<FridgeDto> findAll();
}
