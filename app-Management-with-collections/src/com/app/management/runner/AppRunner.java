package com.app.management.runner;

import com.app.management.dto.AppDto;
import com.app.management.dto.AppType;
import com.app.management.repo.AppRepo;
import com.app.management.repo.AppRepoImplementation;

import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
        AppRepo appRepo=new AppRepoImplementation();
        List<AppDto> appDtos=appRepo.findall();
        appDtos.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++\n\n Free applications\n\n");
        appDtos.stream()
                .filter(app->!app.isFree())
                .forEach(System.out::println);
        System.out.println("=================\n\n owner name and mail\n");
        appDtos.stream()
                .flatMap(app->app.getOwner().stream())
                .map(owner->owner.getName()+" - "+owner.getEmail())
                .distinct()
                .forEach(System.out::println);
        System.out.println("\n\n================= Instagram app owner's name and email ==============");
        appDtos.stream()
                .filter(app->app.getName().equalsIgnoreCase("Instagram"))
                .flatMap(app->app.getOwner().stream())
                .map(owner->owner.getName()+" - "+owner.getEmail())
                .distinct()
                .forEach(System.out::println);
        System.out.println("\n\n================= Application of type STREAMING ==============");
       List<AppDto> streaming=appDtos.stream()
                .filter(app->app.getType()== AppType.STREAMING)
                .collect(Collectors.toList());
               streaming.forEach(System.out::println);

    }
}
