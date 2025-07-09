package com.app.management.repo;

import com.app.management.dto.AppDto;

import java.util.List;

public interface AppRepo {
    List<AppDto> findall();
};
