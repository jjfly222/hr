package fly.Servlet;




import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.jmx.snmp.Timestamp;

import fly.entity.User;
import fly.service.UserService;



	@Controller
public class UserController {
	
		
		@ResponseBody
		@RequestMapping("checkUserName.action")
		public String  checkUserName(String username) {
			String msg="";
			Integer flag=userService.queryUserByName(username);
			if(flag==1) {
				msg="1";//1���ǲ鵽�û���
			}else {
				msg="0";//0  ����û�в鵽�û����߱����
			}
			return msg;
		}
		
		
}
