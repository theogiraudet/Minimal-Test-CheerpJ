package fr.irisa.demobackend;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping(path="/server/goodbye", produces = MediaType.APPLICATION_JSON_VALUE)
    public Output get(@RequestBody Input input) {
        final var output = new Output();
        output.message = "Goodbye " + input.name + "!";
        return output;
    }

}
