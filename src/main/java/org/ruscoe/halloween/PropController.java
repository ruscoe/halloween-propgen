package org.ruscoe.halloween;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for providing random Halloween prop ideas.
 */
@RestController
public class PropController {

    /**
     * Handles HTTP GET requests to /api/prop and returns a random prop idea.
     *
     * @return A randomly generated Prop
     */
    @GetMapping("/api/prop")
    public Prop getRandomProp() {
        return PropGenerator.generate();
    }
}
