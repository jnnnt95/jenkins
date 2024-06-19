pipeline {
    agent any
    options {
        timeout([time: 5, unit: 'MINUTES'])
    }
    stages {
        stage('echoing hello world.') {
            steps {
                sh 'echo "Hello World from Jenkins pipeline!"'
            }
        }
    }
}