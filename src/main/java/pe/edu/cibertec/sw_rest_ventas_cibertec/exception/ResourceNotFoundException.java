package pe.edu.cibertec.sw_rest_ventas_cibertec.exception;

public class ResourceNotFoundException
    extends RuntimeException {

    public ResourceNotFoundException(String message){
        super(message);
    }
}
