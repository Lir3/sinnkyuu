package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//ルート検索画面
@Controller
public class RoutesearchController {
	@RequestMapping(value = "/routesearch")
	public String routesearch() {
		return "routesearch";
	}

	//会社ログイン画面
	@Controller
	public class CampanyloginController {
		@RequestMapping(value = "/campanylogin")
		public String campanylogin() {
			return "campanylogin";
		}
	}

	//管理者ログイン画面
	@Controller
	public class AdminloginController {
		@RequestMapping(value = "/adminlogin")
		public String campanylogin() {
			return "adminlogin";
		}
	}

	//会社管理者ログイン画面
	@Controller
	public class AdmincampanyController {
		@RequestMapping(value = "/admincampany")
		public String campanycampany() {
			return "admincampany";
		}
	}
	
	//IDpass作成画面・
	@Controller
	public class CampanyidpassController {
		@RequestMapping(value = "/campanyidpass")
		public String campanyidpass() {
			return "campanyidpass";
		}
	}

	//定期代申請書画面
	@Controller
	public class CPAFController {
		@RequestMapping(value = "/cpaf")
		public String cpaf() {
			return "cpaf";
		}
	}
	
	///自転車通勤申請書画面
	@Controller
	public class BCAFController {
	    @RequestMapping(value = "/bcaf")
	    public String bcaf() {
	        return "bcaf";
	    }
	}
	
	//自転車保険加入証明書
	@Controller
	public class BicController {
	    @RequestMapping(value = "/bic")
	    public String bic() {
	        return "bic";
	    }
	}

	//返信確認ページ（yes）
	@Controller
	public class CrpageYController {
		@RequestMapping(value = "/crpagey")
		public String crpagey() {
			return "crpagey";
		}
	}

	//返信確認ページ（no）
	@Controller
	public class CrpageNController {
		@RequestMapping(value = "/crpagen")
		public String crpagen() {
			return "crpagen";
		}
	}

	//メール承認フォームページ
	@Controller
	public class MailformController {
		@RequestMapping(value = "/mailform")
		public String mailform() {
			return "mailform";
		}
	}
	
	//承認選択ページ
	@Controller
	public class ApprovalController {
		@RequestMapping(value = "/approval")
		public String approval() {
			return "approval";
		}
	}

	//住居・身上確認
	@Controller
	public class RicpageController {
		@RequestMapping(value = "/ricpage")
		public String ricpage() {
			return "ricpage";
		}
	}

	//定期券代申請書一覧
	@Controller
	public class CRdataController {
		@RequestMapping(value = "/crdata")
		public String routesearch() {
			return "crdata";
		}
	}

	//返信確認一覧
	@Controller
	public class ReplyController {
		@RequestMapping(value = "/reply")
		public String routesearch() {
			return "reply";
		}

	}

}
