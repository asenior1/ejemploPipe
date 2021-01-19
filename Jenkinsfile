pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                //sh "/usr/local/opt/maven/bin/mvn clean"
                sh './mvnw clean -e'
            }
        }

        stage('test') {
            steps {
                //sh "/usr/local/opt/maven/bin/mvn compile"
                sh './mvnw clean compile -e'
            }
        }

        stage('test2') {
            steps {
                /*h '''
                    /usr/local/opt/maven/bin/mvn test
                '''*/
                sh './mvnw clean test -e'
            }
        }
    }
}
