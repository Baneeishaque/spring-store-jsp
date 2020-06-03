package ndk.banee.spring_jstore.service;

import ndk.banee.spring_jstore.domain.ShoppingCart;
import ndk.banee.spring_jstore.domain.ShoppingCartExample;
import ndk.banee.spring_jstore.domain.product;
import ndk.banee.spring_jstore.mapper.ShoppingCartMapper;
import ndk.banee.spring_jstore.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShoppingCartService {

    private final Map<product, Integer> products = new HashMap<>();

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private productMapper prdMapper;


    public List<ShoppingCart> findAllProducts() {
        return shoppingCartMapper.selectByExample(new ShoppingCartExample());
    }

    public void removeProduct(Long id) {
        shoppingCartMapper.deleteByPrimaryKey(id);
    }

    public void addToCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.insert(shoppingCart);
    }

    public List<product> productInfo(Integer id) {
        List<product> prods = prdMapper.getProductsByCustomerId(id);
        return prods;
    }

    public BigDecimal totalPrice(Integer id) {
        return shoppingCartMapper.totalPrice(id);
    }
}
