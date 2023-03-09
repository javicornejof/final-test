package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edutecno.PruebaFinalDos.Model.StoresModel;
import cl.edutecno.PruebaFinalDos.Repository.StoresRepository;

@Service

public class StoresServiceImpl implements StoresService {

	@Autowired
	StoresRepository storesRepository;
	
	@Override
	public List<StoresModel> findAll() {
		return storesRepository.findAll();
	}

	@Override
	public List<StoresModel> findByStoreId(Integer storeId) {
		return storesRepository.findByStoreId(storeId);
	}

}
