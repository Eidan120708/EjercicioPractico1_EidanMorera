package gym.service;

import gym.domain.Servicio;
import java.util.List;
import java.util.Optional;

public interface ServicioService {

    List<Servicio> listarTodos();

    Optional<Servicio> buscarPorId(Integer id);

    Servicio guardar(Servicio servicio);

    void eliminar(Integer id);
}
