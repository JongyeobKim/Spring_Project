package kr.ac.kopo.board.web.gongji;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.board.domain.Gongji;
import kr.ac.kopo.board.service.GongjiService;
import kr.ac.kopo.board.vo.PaginationVO;

@Controller
public class GongjiController {
	
	@Autowired
	private GongjiService gongjiService;
	
	@RequestMapping(value = "/gongji_list", method = RequestMethod.GET)
	public String gongji(Locale locale, @RequestParam Map<String, String> param, Model model) {
//		logger.info("user index");
		
		int page;
		int itemSizePerPage;
		
		if (param.get("page") == null) {
			page = 1;
		} else {
			page = Integer.parseInt(param.get("page"));
		}
		
		if (param.get("itemSizePerPage") == null) {
			itemSizePerPage = 2;
		} else {
			itemSizePerPage = Integer.parseInt(param.get("itemSizePerPage"));
		}
		
		List<Gongji> gongjis = gongjiService.selectAllByPagination(page, itemSizePerPage);
		PaginationVO paginationVo = gongjiService.calcPaging(page,  itemSizePerPage);
		 
		model.addAttribute("gongjis", gongjis );
		model.addAttribute("pagination", paginationVo);
			
		return "gongji/list";
	}
}
