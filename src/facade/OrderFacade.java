package facade;

import facade.complexSystem.Invoice;
import facade.complexSystem.Notification;
import facade.complexSystem.PaymentService;
import facade.complexSystem.ProductDao;

/**
 * Facade layer
 */
public class OrderFacade {
    ProductDao productDao;
    PaymentService paymentService;
    Invoice invoice;
    Notification notification;

    public OrderFacade() {
        productDao = new ProductDao();
        paymentService = new PaymentService();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void createOrder() {
        productDao.getProduct();
        paymentService.doPayment();
        invoice.generateInvoice();
        notification.sendEmail();
    }

}
