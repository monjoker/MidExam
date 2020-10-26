package ptithcm.controllers;

import java.util.ArrayList;
import java.util.Collection;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ptithcm.entity.Sach;

@Controller
@Transactional
public class BookController {
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("book")
	public String bookShow() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "From Sach";
		Query query = session.createQuery(hql);
		sach = query.list();
		return "book";
	}
	
	@RequestMapping(value= "insert" ,params = "insert")
	private String insertSach() {
		System.out.println("insert");
		return "insert";
	}
	
	@RequestMapping("delete/{maSach}")
	private String deleteSach(@PathVariable("maSach")String maSach,ModelMap model) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			System.out.println(getSach(maSach));
			session.delete(getSach(maSach));
			t.commit();
			model.addAttribute("message","xóa thành công");
		}catch (Exception e) {
			model.addAttribute("message","xóa thất bại");
		}
		return "redirect:/book.htm";
	}
	
	@RequestMapping("update/{maSach}")
	private String updateSach(@PathVariable("maSach")String maSach) {
		System.out.println(maSach);
		return "redirect:/book.htm";
	}
	
	private Collection<Sach> sach = null;
	@ModelAttribute("sach")
	Collection<Sach> getSach(){
		if(sach == null) {
			sach = new ArrayList<Sach>();
		}
		return sach;
	}
	
	private Sach getSach(String maSach) throws NullPointerException {
		for(Sach s: sach) {
			if(s.getMaSach().toLowerCase().trim().equals(maSach)) {
				return s;
			}
		}
		throw new NullPointerException();
	}
}
