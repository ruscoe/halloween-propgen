package org.ruscoe.halloween;

import org.springframework.web.bind.annotation.*;

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
    @CrossOrigin(origins = "http://localhost:3000") // Allow React frontend
    public Prop getRandomProp() {
        return PropGenerator.generate();
    }
}
