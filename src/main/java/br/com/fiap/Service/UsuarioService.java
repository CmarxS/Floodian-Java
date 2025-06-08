package br.com.fiap.Service;

import br.com.fiap.Model.UsuarioAplicacao;
import br.com.fiap.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public UsuarioAplicacao salvarUsuario(UsuarioAplicacao usuario) {
        return repository.save(usuario);
    }

    public List<UsuarioAplicacao> listarUsuarios() {
        return repository.findAll();
    }

    public UsuarioAplicacao buscarUsuarioPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public UsuarioAplicacao atualizarUsuario(Long id, UsuarioAplicacao dados) {
        UsuarioAplicacao usuarioExistente = repository.findById(id).orElse(null);
        if (usuarioExistente == null) {
            return null;
        }
        usuarioExistente.setNome(dados.getNome());
        usuarioExistente.setEmail(dados.getEmail());
        usuarioExistente.setTelefone(dados.getTelefone());
        usuarioExistente.setTipoUsuario(dados.getTipoUsuario());
        usuarioExistente.setSenha(dados.getSenha());

        return repository.save(usuarioExistente);
    }


    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }
}
