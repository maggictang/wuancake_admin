package org.wuancake.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wuancake.dao.AdminMapper;
import org.wuancake.entity.AdminBean;
import org.wuancake.entity.TutorBean;
import org.wuancake.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public AdminBean findAdminByEmailAndPassword(String email, String password) {
        return adminMapper.findAdminByEmailAndPassword(email, password);
    }

    @Override
    public void addTutor(TutorBean tutor) {

        adminMapper.addTutor(tutor);
    }

    @Override
    public TutorBean findTutorByEmail(String email) {
        return adminMapper.findTutorByEmail(email);
    }

    @Override
    public void addAdmin(AdminBean adminBean) {
        adminMapper.addAdmin(adminBean);
    }
}
