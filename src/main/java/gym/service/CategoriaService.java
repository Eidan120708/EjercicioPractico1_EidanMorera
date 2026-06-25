package gym.service;

import gym.domain.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> listarTodas();

    Optional<Categoria> buscarPorId(Integer id);

    Categoria guardar(Categoria categoria);

    void eliminar(Integer id);
}
