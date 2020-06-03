package ndk.banee.spring_jstore.service;


import ndk.banee.spring_jstore.domain.admin;
import ndk.banee.spring_jstore.domain.customer;
import ndk.banee.spring_jstore.mapper.adminMapper;
import ndk.banee.spring_jstore.mapper.customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Autowired
    private customerMapper customermapper;
    private final adminMapper adminmapper;

    public CustomerService(adminMapper adminmapper) {
        this.adminmapper = adminmapper;
    }

    public customer getById(Integer id) {
        return customermapper.selectByPrimaryKey(id);
    }

    public void save(customer Customer) {
        if (Customer.getUsername() != null) {
            customermapper.insert(Customer);
        }
    }

    public customer accessCustomer(String username, String password) {

        return customermapper.findCustomer(username, password);
    }

    public admin adminLogin(String adminname, String adminpassword) {

        return adminmapper.findAdmin(adminname, adminpassword);
    }
}
