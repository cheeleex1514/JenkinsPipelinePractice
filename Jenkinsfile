pipeline {
    agent any
    triggers {
        githubPush()
    }

stages {
        stage('Build') {
            steps {
                echo '[INFO] Building..'
            }
        }
        stage('Test') {
            steps {
                echo '[INFO] Testing..'
                sh ./Utilities/sample.sh
            }
        }
        stage('Deploy') {
            steps {
                echo '[INFO] Deploying....'
            }
        }
    }
}