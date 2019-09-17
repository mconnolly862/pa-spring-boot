package uk.ac.belfastmet.ToyStory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
@GetMapping("/")
	public String home() {
		return "home page";

	}
@GetMapping("/woody")
	public String Woody() {
		return "Woody was played by Tom Hanks";

	}
@GetMapping("/buzz")
	public String Buzz() {
		return "Buzz was played by Tim Allen";

	}

@GetMapping("/rc")
public String RC() {
	return "RC waas the fastest Toy ever";

}


@GetMapping("/mrpotatoe")
public String mrpotatoe() {
	return "lets string him up by his pull string, get him outta here";

}

@GetMapping("/rex")
public String rex() {
	return "But what if Andy gets another dinosaur, a mean one. I just dont think I can handle that sort of rejection";

}
}
