package com.kosarev.goitspring.logger;

import com.kosarev.goitspring.domain.Event;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
@Component
public class FileEventLogger implements EventLogger {

    private final String fileName;
    private File file;

    private void init() throws IOException{
        this.file = new File(fileName);
        if (file.exists() && !file.canWrite()){
            throw new IllegalArgumentException("Can't write to file " + fileName);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
