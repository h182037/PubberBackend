package controller;

import model.Bar;
import org.junit.Before;
import backend.CalculatorController;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @InjectMocks
    CalculatorController calculatorController;

    //    @Mock
//    CalculatorDAO calculatorDAO;
    @Test
    public void getBestBar() throws Exception {
        String uri = "/calculate";

        Parametere parametere = new Parametere(2, 100);
        String input = super.mapToJson(parametere);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE).content(input)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Bar bar = mapFromJson(content, Bar.class);
        assertEquals(bar.getName(), "Kronbar");

    }
}

