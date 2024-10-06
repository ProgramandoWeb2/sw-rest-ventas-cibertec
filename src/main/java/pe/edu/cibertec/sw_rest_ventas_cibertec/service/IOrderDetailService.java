package pe.edu.cibertec.sw_rest_ventas_cibertec.service;

import pe.edu.cibertec.sw_rest_ventas_cibertec.dto.OrderDetailDto;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.OrderDetail;

public interface IOrderDetailService {

    OrderDetail registrarOrderDetail(OrderDetailDto orderDetailDto);
}
