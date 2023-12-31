
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileRead {

    public List<String> readFile(String fileName) throws IOException {

        // Dosyadan tüm satırları okur
        List<String> lines = Files.readAllLines(Paths.get(fileName));

        // Her bir satırı işler 
        return lines.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
