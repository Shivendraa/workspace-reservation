package com.shivendra.code.spaces.workspacewebapp.service;

import com.shivendra.code.spaces.workspacewebapp.models.Workspace;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkspaceService {
    private static final List<Workspace> workspaces = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            workspaces.add(new Workspace(i, "Workspace "+ i, "W"+i, "Q"));
        }
    }

    public List<Workspace> getAllWorkspaces() {
        return workspaces;
    }
}
