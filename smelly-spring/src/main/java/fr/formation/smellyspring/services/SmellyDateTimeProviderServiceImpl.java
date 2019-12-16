package fr.formation.smellyspring.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

@Service
public class SmellyDateTimeProviderServiceImpl implements SmellyDateProviderService {

    @Override
    public LocalDate getLocalDate() {
	return null;
    }

    @Override
    public LocalDateTime getLocalDateTime() {
	return LocalDateTime.now();
    }
}
