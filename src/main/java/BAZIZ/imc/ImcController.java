package BAZIZ.imc;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping(path = "imc", consumes = MediaType.APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class ImcController {

    private ImcService imcService;

    @PostMapping
    public @ResponseBody Map<String,String> calculate(@RequestBody ImcDTO data){
       return imcService.calulate(data);
    }

}
