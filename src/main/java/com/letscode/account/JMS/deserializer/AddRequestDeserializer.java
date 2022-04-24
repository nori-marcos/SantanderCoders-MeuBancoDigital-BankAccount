package com.letscode.account.JMS.deserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.letscode.account.payload.TransactionMessageRequest;
import com.letscode.account.payload.TransactionRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

@Slf4j
public class AddRequestDeserializer implements Deserializer<TransactionMessageRequest> {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public TransactionMessageRequest deserialize(String s, byte[] bytes) {
        try {
            if (Objects.nonNull(bytes)) {

                return mapper.readValue(new String(bytes, StandardCharsets.UTF_8), TransactionMessageRequest.class);

            }
        } catch (JsonProcessingException e) {
            log.error("Json procesing error on deserializing kafka object", e);
        }
        return null;
    }
}
