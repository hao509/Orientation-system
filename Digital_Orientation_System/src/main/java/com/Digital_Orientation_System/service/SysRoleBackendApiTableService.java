package com.Digital_Orientation_System.service;

import com.Digital_Orientation_System.vo.SysRoleAndPermissionVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.Digital_Orientation_System.entity.SysRoleBackendApiTable;

/**
 * (SysRoleBackendApiTable)表服务接口
 * 该类由EasyCode工具生成
 * @author 小明哥
 * @since 2020-03-09 12:11:56
 */
public interface SysRoleBackendApiTableService extends IService<SysRoleBackendApiTable> {

    /**
     * 批量保存角色-API表
     * 该方法内有两个操作，先删除、后批量新增，因此存在事务控制
     * @param roleId
     * @param sysRoleAndPermissionVos
     * @return
     */
    boolean saveRoleAip(String roleId, SysRoleAndPermissionVo... sysRoleAndPermissionVos);
    void saveRoleApi(String roleId);//新建角色 插入角色id 到 role_api表中

}