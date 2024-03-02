package com.shivendra.code.spaces.workspacewebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.shivendra.code.spaces.workspacewebapp.models.Workspace;
import com.shivendra.code.spaces.workspacewebapp.service.WorkspaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workspaces")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    public WorkspaceController(WorkspaceService workspaceService){
        this.workspaceService = workspaceService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("workspaces", workspaceService.getAllWorkspaces());
        return "workspaces";
    }
}
