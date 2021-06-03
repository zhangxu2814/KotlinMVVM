package com.github.zhangxu2814.kotlinmvvm.services

import com.github.zhangxu2814.kotlinmvvm.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
