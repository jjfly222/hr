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

import fly.entity.Order;
import fly.service.OrderService;



	@Controller
public class OrderColltroller {
	
		private OrderService orderService;
		@ResponseBody
		@RequestMapping("Order.action")
		public String  addOrder(Order order, HttpSession session) {
			orderService.addOrder(order);
			Integer  odrCustmoerId=order.getOdrCustmoerId();
			orderService.queryOrderById(odrCustmoerId);
			session.setAttribute("order",order);
			return "Line";
		}
}
