package ar.edu.unju.escmi.tp8.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.escmi.tp8.model.Empresa;

public interface IEmpresaService {
    Empresa agregarEmpresa(Empresa empresa);
    List<Empresa> listarEmpresas();
    Optional<Empresa> buscarEmpresaPorId(Long id);
    Optional<Empresa> modificarEmpresa(Long id, Empresa empresa);
    boolean eliminarEmpresa(Long id);
}
