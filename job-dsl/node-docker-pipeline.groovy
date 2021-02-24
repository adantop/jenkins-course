pipelineJob('node-docker-pipeline') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/node-docker.groovy'))
            sandbox()
        }
    }
}
