package com.skilldistillery.megafauna.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.megafauna.data.MegafaunaDAO;
import com.skilldistillery.megafauna.entities.Megafauna;

@Controller
public class MegafaunaMVCController {

	@Autowired
	private MegafaunaDAO megafaunaDAO;

	// find by ID
	@RequestMapping(path = "getmega.do", method = RequestMethod.GET)
	public ModelAndView findById(int id) {
		ModelAndView mv = new ModelAndView();

		Megafauna mega = megafaunaDAO.findById(id);

		mv.addObject("mega", mega);
		mv.setViewName("WEB-INF/views/show.jsp");

		return mv;

	}
	// Create a new Megafauna
	@RequestMapping(path = "createmega.do", method = RequestMethod.POST)
	public ModelAndView createMega(Megafauna newMega) {
		ModelAndView mv = new ModelAndView();

		megafaunaDAO.create(newMega);
		mv.setViewName("redirect:created.do");

		return mv;

	}

	@RequestMapping(path = "created.do", method = RequestMethod.GET)
	public ModelAndView createdMega() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/views/confirmation.jsp");

		return mv;

	}
	//Delete Megafauna
	@RequestMapping(path = "deletemega.do", method = RequestMethod.POST)
	public ModelAndView deleteMega(int id) {
		ModelAndView mv = new ModelAndView();

		megafaunaDAO.delete(id);
		mv.setViewName("redirect:deleted.do");

		return mv;

	}

	@RequestMapping(path = "deleted.do", method = RequestMethod.GET)
	public ModelAndView deletedMega() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("WEB-INF/views/confirmation.jsp");

		return mv;
	}
	
	// Update Megafauna
	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView update(int id, Megafauna updateMega) {
		ModelAndView mv = new ModelAndView();
		
		megafaunaDAO.update(id, updateMega);
		mv.setViewName("redirect:updated.do");
		
		return mv;
		
	}
	
	@RequestMapping(path = "updated.do", method = RequestMethod.GET)
	public ModelAndView updated() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("WEB-INF/views/update.jsp");
		
		
		return mv;
		
		
	}
	
	
	
	
	

	@RequestMapping(path = "home.do", method = RequestMethod.GET)
	public String index() {
		return "WEB-INF/views/index.jsp";

	}
	


}
