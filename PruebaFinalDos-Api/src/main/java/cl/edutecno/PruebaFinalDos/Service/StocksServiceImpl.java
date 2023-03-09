package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edutecno.PruebaFinalDos.Model.StocksModel;
import cl.edutecno.PruebaFinalDos.Repository.StocksRepository;

@Service

public class StocksServiceImpl implements StocksService {

	@Autowired 
	StocksRepository stocksRepository;
	
	@Override
	public List<StocksModel> findAll() {
		return stocksRepository.findAll();
	}

	@Override
	public List<StocksModel> findByProductId(Integer productId) {
		return stocksRepository.findByProductId(productId);
	}

}
