package controllers;

import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.list;
import views.html.products.details;

import java.util.List;

/**
 * Created by Michal on 29/05/2014.
 */
public class Products extends Controller {
    private static final Form<Product> productForm = Form.form(Product.class);
    public static Result list(){
        List<Product> products = Product.findAll();
        return ok(list.render(products));
    }
    public static Result newProduct(){
        return ok(details.render(productForm));
    }ou
    public static Result details(String ean){
        return TODO;
    }
    public static Result save(){
        Form<Product> boundForm = productForm.bindFromRequest();
        Product product = boundForm.get();
        return TODO;
    }
}
