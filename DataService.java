package com.durga.springframework1.game.sample.enterprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
	public class DataService{
		public List<Integer> retrieveData(){
			return Arrays.asList(12,48);
		}
	}