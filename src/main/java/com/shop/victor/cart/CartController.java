package com.shop.victor.cart;
import com.shop.victor.products.Products;
import com.shop.victor.products.ProductsRepository;
import com.shop.victor.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@AllArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cart")
public class CartController {

    private CartRepository cartRepository;
    private UserRepository userRepository;
    private ProductsRepository productsRepository;


    //    @PostMapping("/addProduct")
//    public ResponseEntity<Products> addNewProduct(@RequestBody Products products) {
//        Products products1 = new Products();
//            products1.
//    }
    @GetMapping("/getProducts")
    public  ResponseEntity<?> getProducts(@RequestParam Long cart_id) {
        List<Long> productsIds =  cartRepository.findById(cart_id).get().getProduct_id();
        Map<Products, Integer> products = new HashMap<>();



        for(int i= 0; i < productsIds.size(); i++) {
            var count= 0;
            for (Long productsId : productsIds) {
                if (Objects.equals(productsIds.get(i), productsId)) {
                    count++;
                }
            }
            if(!products.containsKey(productsRepository.getProductsById(productsIds.get(i)))) {
                products.put(productsRepository.getProductsById(productsIds.get(i)),count);
            }
        }


        return ResponseEntity.ok(products);

    }



    @PostMapping("/addInCart")
    public  ResponseEntity<?> addInCart(@RequestParam( name = "userId",required = true) Long userId ,@RequestParam(name= "product_id", required = true) Long product_id ) {
            cartRepository.addInCart(userId,product_id);
        int numberOfProducts = cartRepository.findById(userId).get().getProduct_id().size();
        return new ResponseEntity<Integer>(numberOfProducts,HttpStatus.OK);

    }

}
