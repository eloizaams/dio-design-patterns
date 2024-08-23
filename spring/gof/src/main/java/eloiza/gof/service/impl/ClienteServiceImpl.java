package eloiza.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eloiza.gof.model.Cliente;
import eloiza.gof.model.ClienteRepository;
import eloiza.gof.model.Endereco;
import eloiza.gof.model.EnderecoRepository;
import eloiza.gof.service.ClienteService;
import eloiza.gof.service.ViaCepService;


/**
 * Implementação de <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo String (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>
 */
@Service
public class ClienteServiceImpl implements ClienteService{
	
	// TODO Singleton: Injetar os componentes do Spring com @Autowired
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	// TODO Strategy: Implementar os métodos definidos na interface.
	// TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		//Buscar cliente por ID, caso exista
		Optional<Cliente> clienteBD = clienteRepository.findById(id);
		if (clienteBD.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		//Deletar o cliente por ID
		clienteRepository.deleteById(id);
		
	}

	private void salvarClienteComCep(Cliente cliente) {
		//Verificar se o endereço do cliente já existe  (pelo CEP).
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
			//Caso não exista, integrar com o ViaCEP e persistir o retorno
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		//inserir cliente, vinculando o endereço (novo ou persistente)
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}
}
