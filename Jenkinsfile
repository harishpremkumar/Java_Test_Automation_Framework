pipeline {
    agent any
    stages {

        stage('Build & Tests') {
            steps {
                // Run Maven clean and test commands (ensure Maven is installed on the Jenkins agent)
                bat 'mvn clean test'
            }
        }


    }
}         
