package com.niit.EComFront.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.EComBack.dao.CategoryDAO;
import com.niit.EComBack.model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping("/category")
	public String categoryPage(Model m) {
		m.addAttribute("category", new Category());
		m.addAttribute("catlist", categoryDAO.listCategories());

		m.addAttribute("categoryPage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("editMode",false);

		return "index";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("category") Category category, BindingResult br, Model m) {

		if (br.hasErrors()) {
			m.addAttribute("editMode",false);

			m.addAttribute("category", category);
			m.addAttribute("catlist", categoryDAO.listCategories());
			m.addAttribute("categoryPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		} else {

			try {
				categoryDAO.add(category);
				return "redirect:/category";
			} catch (Exception e) {
				m.addAttribute("editMode",false);

				m.addAttribute("category", category);
				m.addAttribute("catlist", categoryDAO.listCategories());
				m.addAttribute("categoryPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", "Data already present");
				return "index";
			}
		} }
	@RequestMapping("/deletecategory")
	public String deletecategory(@RequestParam("categoryName")String categoryName,Model m)
	{
		Category c=categoryDAO.getCategory(categoryName);
		categoryDAO.delete(c);
		return "redirect:/category";
	}
	@RequestMapping("/editCategory")
	public String editCategory(@RequestParam("categoryName")String categoryName,Model m) {
		m.addAttribute("editMode",true);
		m.addAttribute("category",categoryDAO.getCategory(categoryName));
		m.addAttribute("catlist", categoryDAO.listCategories());
		m.addAttribute("categoryPage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("error", "");

		return "index";

	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("category") Category category, BindingResult br, Model m) {

		if (br.hasErrors()) {
			m.addAttribute("editMode",false);
			m.addAttribute("category", category);
			m.addAttribute("catlist", categoryDAO.listCategories());
			m.addAttribute("categoryPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		} else {

			try {
				categoryDAO.update(category);
				return "redirect:/category";
			} catch (Exception e) {
				m.addAttribute("editMode",false);
				m.addAttribute("category", category);
				m.addAttribute("catlist", categoryDAO.listCategories());
				m.addAttribute("categoryPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", "Data already present");
				return "index";
			}
		} }

}
