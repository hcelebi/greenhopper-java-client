package io.github.hcelebi.greenhopper.client;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import io.github.hcelebi.greenhopper.domain.dto.SprintReportDto;
import io.github.hcelebi.greenhopper.domain.dto.VelocityDto;
import io.github.hcelebi.greenhopper.exception.GreenhopperRunTimeException;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class GreenhopperRestClient {
    private final String baseUri;
    private final String token;
    private final HttpClient client;


    public GreenhopperRestClient(String baseUri, String token) {
        this.baseUri = baseUri;
        this.token = token;
        client = HttpClient.newHttpClient();
    }

    public VelocityDto getVelocityBySquad(Integer squadId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/rapid/charts/velocity?rapidViewId=" + squadId))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), VelocityDto.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new GreenhopperRunTimeException(e.getMessage());
        }
    }

    public SprintReportDto getSprintReport(Integer squadId, Integer sprintId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JodaModule());
            objectMapper.configOverride(String.class).setSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));

            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/rapid/charts/sprintreport?rapidViewId=" + squadId + "&sprintId=" + sprintId))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), SprintReportDto.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new GreenhopperRunTimeException(e.getMessage());
        }
    }
}
