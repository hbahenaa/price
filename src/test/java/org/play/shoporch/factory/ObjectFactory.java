package org.play.shoporch.factory;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@Slf4j
@NoArgsConstructor
public class ObjectFactory {

    static <T> T createMock(Class<T> clazz, String resourceName) {
        log.info("entrada Factory");
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new JavaTimeModule());

        try (InputStream stream = Objects.requireNonNull
                (ObjectFactory.class.getClassLoader().getResourceAsStream(resourceName))) {
            return mapper.readValue(stream, clazz);
        } catch (IOException e) {
            return null;
        }
    }

}
