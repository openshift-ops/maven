job("First-Maven-Project-Via-DSL") {
    description("First Maven job generated by DSL on ${new Date()}, the project is a samll springboot maven project hosted on git hub")
    scm {
        git("https://github.com/openshift-ops/maven.git","main")

    }
    triggers {
        scm("* * * * *")
    }
    steps {
        maven('clean package','hello-jenkins-maven/pom.xml')
    }
    publishers {
        archiveArtifacts('hello-jenkins-maven/target/*.jar')
    }
}