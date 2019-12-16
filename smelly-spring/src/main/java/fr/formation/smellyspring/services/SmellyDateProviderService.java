package fr.formation.smellyspring.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public interface SmellyDateProviderService {

    LocalDate getLocalDate();

    LocalDateTime getLocalDateTime();
}
