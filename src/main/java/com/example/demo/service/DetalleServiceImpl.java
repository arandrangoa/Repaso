package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Detalle;
import com.example.demo.repository.IDetalleRepo;

@Service
public class DetalleServiceImpl implements IDetalleService{

	@Autowired
	private IDetalleRepo detalleRepo;
	
	@Override
	public void agregar(Detalle detalle) {
		// TODO Auto-generated method stub
		this.detalleRepo.insertar(detalle);
	}

}
