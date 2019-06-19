package cn.itcast.controller;

import cn.itcast.domain.Product;
import cn.itcast.service.IProductService;
import cn.itcast.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    /**
     * 将查询出来的数据防盗ModelAndView
      */
    @Autowired
    private IProductService service;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        List<Product> ps = service.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("productList",ps);
        mv.setViewName("product-list1");
        return mv;
    }
}
