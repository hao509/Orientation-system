package com.Digital_Orientation_System.controller;



import com.Digital_Orientation_System.log.MyLog;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.Digital_Orientation_System.entity.SysFrontendMenuTable;
import com.Digital_Orientation_System.service.SysFrontendMenuTableService;
import com.Digital_Orientation_System.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SysFrontendMenuTable)表控制层
 * 该类由EasyCode工具生成
 * @author 小明哥
 * @since 2020-03-07 13:42:36
 */
@RestController
@RequestMapping("sysFrontendMenuTable")
public class SysFrontendMenuTableController extends ApiController {
    @Autowired
    SysUserService sysUserService;
    /**
     * 服务对象
     */
    @Resource
    private SysFrontendMenuTableService sysFrontendMenuTableService;

    /**
     * 分页查询所有数据
     *
     * @return 所有数据
     */
    @MyLog(operation = "获取菜单")
    @GetMapping
    public R selectAll() {
        return success(this.sysFrontendMenuTableService.getAllMenuList());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @MyLog(operation = "通过id获取权限")
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.sysFrontendMenuTableService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param sysFrontendMenuTable 实体对象
     * @return 新增结果
     */
    @MyLog(operation = "新增权限")
    @PostMapping
    public R insert(@RequestBody SysFrontendMenuTable sysFrontendMenuTable) {
        return success(this.sysFrontendMenuTableService.save(sysFrontendMenuTable));
    }

    /**
     * 修改数据
     *
     * @param sysFrontendMenuTable 实体对象
     * @return 修改结果
     */
    @MyLog(operation = "修改权限")
    @PutMapping
    public R update(@RequestBody SysFrontendMenuTable sysFrontendMenuTable) {
        return success(this.sysFrontendMenuTableService.updateById(sysFrontendMenuTable));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @MyLog(operation = "删除权限")
    @DeleteMapping
    public R delete(@RequestParam("idList") List<String> idList) {
        return success(this.sysFrontendMenuTableService.removeByIds(idList));
    }


}