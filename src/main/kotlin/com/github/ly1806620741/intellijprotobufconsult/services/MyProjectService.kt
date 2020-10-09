package com.github.ly1806620741.intellijprotobufconsult.services

import com.intellij.openapi.project.Project
import com.github.ly1806620741.intellijprotobufconsult.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
