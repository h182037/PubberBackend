package controller;

import backend.BarController;
import model.Bar;
import model.Prices;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ExtendWith(MockitoExtension.class)
public class BarControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @InjectMocks
    BarController barController;

    @Test
    public void getBar() throws Exception {
        String uri = "/bar/1";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Bar bar = mapFromJson(content, Bar.class);
        assertEquals(bar.getName(), "Kronbar");
    }

    @Test
    public void getBars() throws Exception {
        String uri = "/bars";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Bar[] bars = super.mapFromJson(content, Bar[].class);
        assertTrue(bars.length > 0);
    }

    @Test
    public void updateBar() throws Exception {
        String uri = "/bar/1";

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Bar bar = mapFromJson(content, Bar.class);
        bar.setDescription("TestDescription");
        String inputJson = super.mapToJson(bar);

        MvcResult mvcResult1 = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();
        int status1 = mvcResult1.getResponse().getStatus();
        assertEquals(200, status1);
        String content1 = mvcResult1.getResponse().getContentAsString();
        assertEquals(content1, "Product is updated successsfully");

        MvcResult mvcResult2 = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status2 = mvcResult.getResponse().getStatus();
        assertEquals(200, status2);
        String content2 = mvcResult2.getResponse().getContentAsString();
        Bar bar1 = mapFromJson(content, Bar.class);
        assertEquals(bar.getDescription(), bar1.getDescription());

    }

    @Test
    public void createBar() throws Exception {
        Prices dayprices = new Prices(45, 55, 59, 20);
        Bar bar = new Bar("TestName", "TestAddress", "TestDescription", false, "/oskar/nudes/nakenbilde.png", dayprices, (new Prices()), 18);
        String uri = "/bar";
        String inputJson = super.mapToJson(bar);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Product is created successfully");
    }

    @Test
    public void deleteBar() throws Exception {
        String uri = "/bar/2";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Product is deleted successsfully");
    }
}
