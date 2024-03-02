package com.shivendra.code.spaces.workspacewebapp.service;

import com.shivendra.code.spaces.workspacewebapp.models.Position;
import com.shivendra.code.spaces.workspacewebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> staffs = new ArrayList<>();

    static {
        staffs.add(new StaffMember(UUID.randomUUID().toString(), "John", "K", Position.CONCIERGE));
        staffs.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "L", Position.SECURITY));
        staffs.add(new StaffMember(UUID.randomUUID().toString(), "Honda", "M", Position.HOUSEKEEPING));
        staffs.add(new StaffMember(UUID.randomUUID().toString(), "Takeshi", "N", Position.RECEPTION));
    }

    public List<StaffMember> getAllStaff() {
        return staffs;
    }
}
