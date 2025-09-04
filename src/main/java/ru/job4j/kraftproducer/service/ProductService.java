package ru.job4j.kraftproducer.service;

import ru.job4j.kraftproducer.dto.CreateProductDto;
import java.util.concurrent.ExecutionException;

public interface ProductService {

    String createProduct(CreateProductDto createProductDto) throws ExecutionException, InterruptedException;
}
