package com.example.demo.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.FizzBuzzService;

//javaプログラムがControllerの役割する定義
@Controller
public class FizzBuzzController {
	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	
	//以下のURLにアクセスがあった際にこのプログラムが呼ばれる
	@GetMapping("fizzBuzz")
	public String add(Model model) {

		List<String> list = fizzBuzzService.getList();
		//System.out.println(result + "l24");
		model.addAttribute("list", list);
		return "fizzBuzz.html";
	}

	
}
