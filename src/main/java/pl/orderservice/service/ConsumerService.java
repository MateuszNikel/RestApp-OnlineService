package pl.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.orderservice.Entity.Consumer;
import pl.orderservice.Exception.ObjectNotFoundException;
import pl.orderservice.Model.ConsumerDto;
import pl.orderservice.Repository.ConsumerRepo;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final ModelMapper modelMapper;

    private final ConsumerRepo consumerRepo;

    public ConsumerDto findById(Long id) {
        Optional<Consumer> consumer = consumerRepo.findById(id);
        return consumer.map(o -> modelMapper.map(o, ConsumerDto.class))
                .orElseThrow(() -> new ObjectNotFoundException("Consumer with id " + id + " not found"));
    }

    public Consumer addConsumerToOrder(ConsumerDto consumerDto){
       return consumerRepo.save(Optional.of(consumerDto).map(
               o -> modelMapper.map(o, Consumer.class))
               .orElseThrow(() -> new ObjectNotFoundException("Wrong data")));
    }

}
