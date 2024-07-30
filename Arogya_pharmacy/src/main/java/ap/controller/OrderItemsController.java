package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.OrderItemsEO;
import ap.services.OrderItems;

@RestController
@RequestMapping("/orderitems")
@CrossOrigin("http://localhost:3000")
public class OrderItemsController {
	
	@Autowired
	private OrderItems OrderItemsService;
	
	
	@RequestMapping(value="/getAllOrderDetails", method=RequestMethod.GET)
	public List<OrderItemsEO> getAllOrderitemsDetails()
	{
		return OrderItemsService.getAllOrderitemsDetails();
	}
	
	@RequestMapping(value="/findByOrderId/{order_Id}", method=RequestMethod.GET)
	public List<OrderItemsEO> findByOrderIDDetails(@PathVariable String order_Id)
	{
		return OrderItemsService.findByOrderIDDetails(order_Id);
	}
	
	@RequestMapping(value="/add-order_items", method=RequestMethod.POST)
	public void addOrderitemsDetails(@RequestBody OrderItemsEO oritEORef)
	{
		OrderItemsService.addOrderitemsDetails(oritEORef);
	}
	
	@RequestMapping(value="/update-order_items", method=RequestMethod.PUT)
	public void updateOrderitemsDetails(@RequestBody OrderItemsEO oritEORef)
	{
		OrderItemsService.updateOrderitemsDetails(oritEORef);
	}
	
	@RequestMapping(value="/findById-order_items/{order_items}", method=RequestMethod.PUT)
	public Optional<OrderItemsEO> findByOrderitemsDetails(@PathVariable String order_itemsId)
	{
		Optional<OrderItemsEO> orderitem = OrderItemsService.findByOrderitemsDetails(order_itemsId);
		return orderitem;
	}
	
	@RequestMapping(value="/delete-order_items/{order_items}", method=RequestMethod.DELETE)
	public void deleteOrderitemsDetails(@PathVariable String order_itemsId)
	{
		OrderItemsService.deleteOrderitemsDetails(order_itemsId);
	}


}
