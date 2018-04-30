package idv.mission.example.SpringBootReactJS_Example;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "index.html";
	}
	
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello";
	}
	
	@RequestMapping("/hello/{name}")
	public @ResponseBody String hello(@PathVariable String name) {
		return "Hello, " + name;
	}
	
	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, String> json() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("key", "value");
		return result;
	}
	
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public @ResponseBody String post(HttpServletRequest request) {
		String data = request.getParameter("data");
		return "Hello By post: " + data;
	}
}