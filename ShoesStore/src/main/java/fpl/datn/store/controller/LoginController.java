package fpl.datn.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpoly.datn.entity.Account;
import com.fpoly.datn.repository.AccountRepository;
import com.fpoly.datn.service.AccountService;

public class LoginController {
	@Autowired
	private AccountService userService;
	
	@Autowired
	private AccountRepository userRepository;
	
	public String login(Model model, @RequestParam("username") String username, 
						@RequestParam("password") String password ) {
		
			if("".equals(username.trim())){
				model.addAttribute("message","tên đăng nhập không được trống");
				return "user/login";
			} else if("".equals(password.trim())) {
				model.addAttribute("message","mật khẩu không được trống");
				return "user/login";
			}
			Account user = userService.findById(username);
			
			if(user == null || !password.equals(user.getPassword())) {
				model.addAttribute("message", "sai tên đăng nhập hoặc mật khẩu");
			} else {
				
			}
		return null;
	}
}
