package pl.orderservice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.orderservice.Entity.Consumer;
import pl.orderservice.Model.ConsumerDto;
import pl.orderservice.service.ConsumerService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;

    @GetMapping("/{id}")
    public ConsumerDto findConsumerById(@PathVariable("id") Long id) {
        return consumerService.findById(id);
    }

    @PostMapping("/addorder")
    public Consumer saveConsumer(@RequestBody ConsumerDto consumerDto) {
        return consumerService.addConsumerToOrder(consumerDto);
    }

}