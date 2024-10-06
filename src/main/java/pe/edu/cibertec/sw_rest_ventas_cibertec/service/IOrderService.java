package pe.edu.cibertec.sw_rest_ventas_cibertec.service;

import pe.edu.cibertec.sw_rest_ventas_cibertec.dto.OrderDto;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Order;

public interface IOrderService {

    Order registrarOrden(OrderDto orderDto);

}
