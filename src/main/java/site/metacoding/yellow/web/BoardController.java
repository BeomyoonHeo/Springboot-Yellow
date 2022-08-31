package site.metacoding.yellow.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow.domain.Board;

@Controller
public class BoardController {
	
	//board table에 있는 데이터를 view에 담아 반환
	@GetMapping("/board")
	public String getBoard(Model model) {
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1, "스프링1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링2강", "템플릿 엔진 배우기"));
		boardList.add(new Board(3, "스프링3강", "데이터베이스 연결 하기"));
		model.addAttribute("boards", boardList); // key value
		return "board/list";
	}
	
	@GetMapping("board/{id}")
	public String getBoardOne(@PathVariable Integer id, Model model) {
		//더미 데이터
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1, "스프링1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링2강", "템플릿 엔진 배우기"));
		boardList.add(new Board(3, "스프링3강", "데이터베이스 연결 하기"));
		if(id == 1) {
			model.addAttribute("board", boardList.get(0));
			String hello = "OK";
			model.addAttribute("hello", hello);
		}
		if(id == 2) {
			String hello = "NO";
			model.addAttribute("board", boardList.get(1));
			model.addAttribute("hello", hello);
		}
		if(id == 3) {
			model.addAttribute("board", boardList.get(2));
			String hello = "NO";
			model.addAttribute("hello", hello);
		}
		return "board/detail";
	}

}
