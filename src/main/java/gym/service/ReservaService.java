package gym.service;

import gym.domain.Reserva;
import java.util.List;
import java.util.Optional;

public interface ReservaService {

    List<Reserva> listarTodas();

    Optional<Reserva> buscarPorId(Integer id);

    Reserva guardar(Reserva reserva);

    void eliminar(Integer id);
}
