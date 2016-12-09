package com.dingjinjin.demo.manager.impl;

import com.dingjinjin.demo.bean.Dog;
import com.dingjinjin.demo.manager.IDogManager;
import org.springframework.stereotype.Service;

@Service
public class DogManager implements IDogManager {
    @Override
    public Dog getDog() {
        return new Dog("旺财");
    }
}
