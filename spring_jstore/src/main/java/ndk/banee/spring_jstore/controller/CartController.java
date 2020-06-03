package ndk.banee.spring_jstore.controller;

import ndk.banee.spring_jstore.domain.ShoppingCart;
import ndk.banee.spring_jstore.domain.customer;
import ndk.banee.spring_jstore.domain.product;
import ndk.banee.spring_jstore.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/")
public class CartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("cart")
    public String cart(Model model, HttpSession session) {
        customer user = (customer) session.getAttribute("user");
        List<product> prods = shoppingCartService.productInfo(user.getCustomeriid());
        model.addAttribute("prods", prods);
        model.addAttribute("totalPrice", shoppingCartService.totalPrice(user.getCustomeriid()));
        return "cart";
    }

    @GetMapping("addToCart")
    public String addToCart(@RequestParam("prodId") Integer prodId, HttpSession session,
                            @RequestParam("price") BigDecimal price) {
        ShoppingCart Product = new ShoppingCart();
        Product.setProductid(prodId);
        Product.setPrice(price);
        customer user = (customer) session.getAttribute("user");
        Product.setCustomeriid(user.getCustomeriid());
        shoppingCartService.addToCart(Product);
        return "redirect:/shop";
    }

    @GetMapping("removeProduct")
    public String removePage(@RequestParam("id") Long id) {
        shoppingCartService.removeProduct(id);
        return "redirect:/cart";
    }
}
