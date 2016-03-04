package com.canis.rest.controller;

/**
 * Created by Gonzalo on 3/3/2016.
 */
import com.canis.RestTestApplication;
import com.canis.domain.DogBreed;
import com.canis.service.DogBreedsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestTestApplication.class)
@WebAppConfiguration
public class DogBreedsUTest {

    @Mock
    DogBreedsService todoServiceMock;

    @InjectMocks
    private DogBreedsController dogBreedsController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(dogBreedsController).build();
    }

    @Test
    public void list() throws Exception {
        DogBreed akita = new DogBreed();
        akita.setId(1L);
        akita.setName("Akita");

        DogBreed bulldog = new DogBreed();
        bulldog.setId(2L);
        bulldog.setName("Bulldog");

        Page<DogBreed> page = new PageImpl<DogBreed>(Arrays.asList(akita, bulldog));

        when(todoServiceMock.list(anyInt(), anyInt())).thenReturn(page);

        mockMvc.perform(get("/DogBreed/list/0/100"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].name", is("Akita")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].name", is("Bulldog")));

        verify(todoServiceMock, times(1)).list(0, 100);
        verifyNoMoreInteractions(todoServiceMock);
    }
}
