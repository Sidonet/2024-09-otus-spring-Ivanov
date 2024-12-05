package ru.otus.hw.services;

import ru.otus.hw.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll();

    Optional<Author> findById(String id);

    Optional<Author> findByFullName(String fullName);

    void deleteByFullName(String fullName);
}
