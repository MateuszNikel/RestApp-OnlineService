package pl.orderservice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.orderservice.Model.OrderDto;
import pl.orderservice.service.OrderService;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/order/{id}")
    public OrderDto findOrderById(@PathVariable("id") Long id) {
        return orderService.findById(id);
    }
}