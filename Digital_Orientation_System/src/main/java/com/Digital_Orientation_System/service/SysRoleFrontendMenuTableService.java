package com.Digital_Orientation_System.service;

import com.Digital_Orientation_System.vo.SysRoleAndPermissionVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.Digital_Orientation_System.entity.SysRoleFrontendMenuTable;

/**
 * (SysRoleFrontendMenuTable)表服务接口
 * 该类由EasyCode工具生成
 * @author 小明哥
 * @since 2020-03-09 11:44:33
 */
public interface SysRoleFrontendMenuTableService extends IService<SysRoleFrontendMenuTable> {

    /**
     * 批量保存角色-菜单表
     * 该方法内有两个操作，先删除、后批量新增，因此存在事务控制
     * @param roleId
     * @param sysRoleAndPermissionVos
     * @return
     */
    boolean saveRoleMenu(String roleId, SysRoleAndPermissionVo... sysRoleAndPermissionVos);
}