package ndk.banee.spring_jstore.controller;

import ndk.banee.spring_jstore.domain.customer;
import ndk.banee.spring_jstore.domain.product;
import ndk.banee.spring_jstore.domain.wishlist;
import ndk.banee.spring_jstore.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @GetMapping("wishlist")
    public String wishlist(Model model, HttpSession session) {
        customer user = (customer) session.getAttribute("user");
        List<product> products = wishListService.wishListProduct(user.getCustomeriid());
        model.addAttribute("products", products);
        return "wishlist";
    }


    @GetMapping("/saveToWishlist")
    public String addToWishlist(@RequestParam("prodId") Integer prodId, HttpSession session) {
        wishlist wishList = new wishlist();
        wishList.setProductid(prodId);
        customer user = (customer) session.getAttribute("user");
        wishList.setCustomeriid(user.getCustomeriid());
        wishListService.addToWishList(wishList);
        return "redirect:/shop";
    }
}
