package com.huihe.eg.authorization.service.web;

import com.cy.framework.service.web.BaseFrameworkController;
import com.cy.framework.util.result.ResultParam;
import com.cy.framework.util.result.ResultUtil;
import com.huihe.eg.authorization.model.ManagerUserEntity;
import com.huihe.eg.authorization.service.dao.ManagerUserService;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="后台管理的用户商户可用接口说明",description="后台管理的用户商户可用接口说明",tags = {"后台管理的用户/商户"})
@RestController
@RequestMapping("managerUser")
public class ManagerUserController extends BaseFrameworkController<ManagerUserEntity, Long> {

    @Resource
    private ManagerUserService service;
    @Override
    public void init() {
        setBaseService(service);
    }

    @RequestMapping("queryManager")
    @ResponseBody
    public String queryManager(@RequestBody Long id) {
        return service.queryManager(id);
    }
    /**
     * 查询总条数
     *
     * @param param
     * @param request
     * @param response
     * @return
     */
    @ApiOperation(value = "查询总条数", httpMethod = "GET", notes = "查询总条数")
    @GetMapping("queryListPageCount")
    public ResultParam queryListPageCount(ManagerUserEntity param, HttpServletRequest request, HttpServletResponse response) {
        init();
        return ResultUtil.success(service.queryListPageCount(param,request,response));
    }

}