pipeline {
    agent any

stages {
        stage('Build') {
            steps {
                echo '[INFO] Building..'
            }
        }
        stage('Test') {
            steps {
                echo '[INFO] Testing..'
                sh 'pwd'
                sh 'whoami'
                sh 'ls -l ./Utilities/'
                sh './Utilities/sample.sh'
            }
        }
        stage('Deploy') {
            steps {
                echo '[INFO] Deploying....'
            }
        }
    }
}