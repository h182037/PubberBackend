package backend;

import model.Bar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.Origin;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@SpringBootApplication
public class CalculatorController {
    private final Calculator cal = new Calculator();

    public static void main(String[] args){
        SpringApplication.run(CalculatorController.class, args);
    }

    @RequestMapping(value = "/calculate",method =   RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Bar> calculate(@RequestBody CallObject call){
        if(cal.getBarlist().isEmpty())
            cal.addDummies();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");
        ArrayList<Bar> bars = new ArrayList<Bar>();
        bars = cal.calculate(call.isGivenMoney(), call.getAmount(), call.getDrinkType(), call.isClub());
        return ResponseEntity.ok().headers(responseHeaders).body(bars.get(0));
    }

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello.";
    }
}
