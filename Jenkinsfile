pipeline {
    agent any

    tools{
        maven "3.6.3"
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
                sh 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo '[INFO] Deploying....'
            }
        }
    }
}