package laurenIsCool.mileage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageApplicationController {

	@RequestMapping("/")
	public ModelAndView showHome() {

		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/mileage-form")
	public ModelAndView showMileage() {

		ModelAndView mav = new ModelAndView("mileage-form");
		return mav;
	}

	@RequestMapping("/mileage-result)")
	public ModelAndView showStory(@RequestParam("mgp") int mpg, @RequestParam("gallons") int gallons) {

		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		return mav;
	}

}
