package com.mx.application.marvel.api.business.service;

import com.mx.application.marvel.service.model.MarvelCharacteresResponse;

/**
 * @author jahernandezg
 */
public interface MarvelExctractService {

	public MarvelCharacteresResponse extractData(String name);
}
