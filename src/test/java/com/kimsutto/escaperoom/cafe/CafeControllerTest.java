package com.kimsutto.escaperoom.cafe;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kimsutto.escaperoom.model.repository.CafeRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class CafeControllerTest {
  @Rule
  public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();

  private MockMvc mockMvc;

  @Autowired
  WebApplicationContext context;
  @Autowired
  CafeRepository cafeRepository;
  @Autowired
  ObjectMapper objectMapper;

  @Before
  public void setUp() { // (2)
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
        .apply(documentationConfiguration(this.restDocumentation))
        .build();
  }

  @Test
  public void Cafe조회_테스트() throws Exception {

    mockMvc.perform(get("/api/cafe/")
        .characterEncoding("utf-8")
        .contentType("application/json;charset=UTF-8")
        .accept("application/json"))
        .andExpect(status().isOk())
        .andDo(print());
  }
}