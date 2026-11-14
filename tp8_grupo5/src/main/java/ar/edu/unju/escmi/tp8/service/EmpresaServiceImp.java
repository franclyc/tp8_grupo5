package ar.edu.unju.escmi.tp8.service.imp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.edu.unju.escmi.tp8.model.Empresa;
import ar.edu.unju.escmi.tp8.service.IEmpresaService;

@Service
public class EmpresaServiceImp implements IEmpresaService {
    private final Map<Long, Empresa> empresas = new LinkedHashMap<>();
    private long siguienteId = 1;

    @Override
    public synchronized Empresa agregarEmpresa(Empresa empresa) {
        Objects.requireNonNull(empresa, "La empresa es obligatoria");
        long id = siguienteId++;
        empresa.setId(id);
        empresas.put(id, empresa);
        return empresa;
    }

    @Override
    public synchronized List<Empresa> listarEmpresas() {
        return new ArrayList<>(empresas.values());
    }

    @Override
    public synchronized Optional<Empresa> buscarEmpresaPorId(Long id) {
        return Optional.ofNullable(empresas.get(id));
    }

    @Override
    public synchronized Optional<Empresa> modificarEmpresa(Long id, Empresa empresa) {
        Objects.requireNonNull(empresa, "La empresa es obligatoria");
        if (!empresas.containsKey(id)) {
            return Optional.empty();
        }
        empresa.setId(id);
        empresas.put(id, empresa);
        return Optional.of(empresa);
    }

    @Override
    public synchronized boolean eliminarEmpresa(Long id) {
        return empresas.remove(id) != null;
    }
}
