package Services;

import Repository.ProductRepository;
import Repository.ProductRepositoryImplementation;
import dto.ProductDto;

public class ProductServiceImplementaion implements ProductService {

    ProductRepository productRepository = new ProductRepositoryImplementation(); // ✅ Use repository

    @Override
    public boolean save(ProductDto productDto) {
        return productRepository.save(productDto);
    }
}
