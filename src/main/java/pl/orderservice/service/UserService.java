package pl.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.orderservice.Entity.User;
import pl.orderservice.Exception.ObjectNotFoundException;
import pl.orderservice.Model.UserDto;
import pl.orderservice.Repository.UserRepo;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;

    private final UserRepo userRepo;

    public UserDto findById(Long id) {
        Optional<User> user = userRepo.findById(id);
        return user.map(o -> modelMapper.map(o, UserDto.class)).orElseThrow(() -> new ObjectNotFoundException("User with id " + id + " not found"));
    }
}