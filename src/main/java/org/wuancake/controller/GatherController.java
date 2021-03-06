package org.wuancake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wuancake.entity.AdminBean;
import org.wuancake.entity.PageBean;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Ericheel
 * @Description: 周报汇总相关
 * @date 2018/5/2323:19
 */
@Controller
public class GatherController extends SuperController {

    @RequestMapping(value = "queryGatherList/**")
    String queryGatherList(HttpServletRequest request, Integer currPage) {

        String queryString = request.getQueryString().replace("%20", "").substring(9);

        AdminBean isAdmin = (AdminBean) request.getSession().getAttribute("isAdmin");
        
        PageBean pageBean = pageQuery(Integer.parseInt(queryString), request, isAdmin);

        //pageBean放入会话
        request.getSession().setAttribute("pageBean", pageBean);
        return "main";
    }
}
