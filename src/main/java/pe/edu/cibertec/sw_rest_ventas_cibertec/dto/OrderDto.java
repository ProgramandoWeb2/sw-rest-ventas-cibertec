package pe.edu.cibertec.sw_rest_ventas_cibertec.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class OrderDto {
    private String customerid;
    private Integer employeeid;
    private List<OrderDetailDto> orderDetailDto;
}
