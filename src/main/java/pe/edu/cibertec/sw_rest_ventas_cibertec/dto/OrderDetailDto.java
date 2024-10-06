package pe.edu.cibertec.sw_rest_ventas_cibertec.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderDetailDto {
    private Integer orderid;
    private Integer productid;
    private Integer quantity;
}
