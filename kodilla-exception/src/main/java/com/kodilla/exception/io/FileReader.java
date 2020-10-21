package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileReader {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        Path path = Paths.get(file.getPath());
        System.out.println(file.getPath());
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException ioException) {
            throw new FileReaderException();
        } finally {
            System.out.println("Always");
        }

    }

    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}

