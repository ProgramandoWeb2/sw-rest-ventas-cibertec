package pe.edu.cibertec.sw_rest_ventas_cibertec.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.sw_rest_ventas_cibertec.dto.OrderDto;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Order;
import pe.edu.cibertec.sw_rest_ventas_cibertec.service.IOrderService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    private final IOrderService orderService;

    @PostMapping
    public ResponseEntity<Order> registrarOrden(
            @RequestBody OrderDto orderDto){
        return new ResponseEntity<>(orderService.registrarOrden(orderDto),
                HttpStatus.CREATED);
    }

}
