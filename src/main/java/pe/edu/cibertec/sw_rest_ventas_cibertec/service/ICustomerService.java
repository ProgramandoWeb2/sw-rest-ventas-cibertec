package pe.edu.cibertec.sw_rest_ventas_cibertec.service;

import pe.edu.cibertec.sw_rest_ventas_cibertec.dto.CustomerDto;
import pe.edu.cibertec.sw_rest_ventas_cibertec.model.Customer;
import pe.edu.cibertec.sw_rest_ventas_cibertec.repository.projection.CustomerCountCountryProjection;

import java.util.List;

public interface ICustomerService {

    List<CustomerDto> findByCity(String city);
    List<CustomerDto> findByCountryAndCity(String country, String city);
    List<CustomerDto> findByContactnameContaining(String contactname);
    List<CustomerDto> findByPostalcodeBetween(String postalCodeInicial,
                                           String postalCodeFinal);
    List<CustomerDto> findByCompanynameContainingOrderByCompanynameAsc(
            String companyname);
    List<CustomerDto> buscarClientesXCityCountry(String city, String country);
    List<CustomerCountCountryProjection> listaPaisesConCantidadClientes();

    void registrarCustomer(CustomerDto customerDto);
}
