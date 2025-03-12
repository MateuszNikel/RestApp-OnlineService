package pl.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.orderservice.Entity.Order;
import pl.orderservice.Exception.ObjectNotFoundException;
import pl.orderservice.Model.OrderDto;
import pl.orderservice.Repository.OrderRepo;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ModelMapper modelMapper;

    private final OrderRepo orderRepo;

    public OrderDto findById(Long id) {
        Optional<Order> order = orderRepo.findById(id);
        return order.map(o -> modelMapper.map(o, OrderDto.class)).orElseThrow(() -> new ObjectNotFoundException("Order with id " + id + " not found"));
    }

}