package pe.edu.cibertec.sw_rest_ventas_cibertec.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenericResponseDto<T> {
    private boolean correcto;
    private String mensaje;
    private T respuesta;
    private String codigoError;
}
