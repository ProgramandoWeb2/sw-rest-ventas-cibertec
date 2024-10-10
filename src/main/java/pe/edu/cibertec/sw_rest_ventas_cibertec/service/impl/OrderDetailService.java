package pe.edu.cibertec.sw_rest_ventas_cibertec.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.sw_rest_ventas_cibertec.dto.OrderDetailDto;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Order;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.OrderDetail;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Product;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.pk.ProductOrderId;
import pe.edu.cibertec.sw_rest_ventas_cibertec.repository.OrderDetailRepository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.repository.OrderRepository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.repository.ProductRepository;
import pe.edu.cibertec.sw_rest_ventas_cibertec.service.IOrderDetailService;
@RequiredArgsConstructor
@Service
public class OrderDetailService implements IOrderDetailService {
    private final OrderDetailRepository orderDetailRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public OrderDetail registrarOrderDetail(OrderDetailDto orderDetailDto) {
        //Construyo el ID
        ProductOrderId productOrderId = new ProductOrderId();
        productOrderId.setProductid(orderDetailDto.getProductid());
        productOrderId.setOrderid(orderDetailDto.getOrderid());
        Product product = productRepository.findById(
                orderDetailDto.getProductid()).get();
        Order order = orderRepository.findById(
                orderDetailDto.getOrderid()).get();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(productOrderId);
        orderDetail.setQuantity(orderDetailDto.getQuantity());
        orderDetail.setDiscount(0.0);
        orderDetail.setUnitprice(product.getUnitprice());
        orderDetail.setOrder(order);
        orderDetail.setProduct(product);
        return orderDetailRepository.save(orderDetail);
    }
}
