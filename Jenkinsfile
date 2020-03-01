pipeline{
    agent any
    stages {
        stage('Clean'){
           steps{
                bat 'gradle clean'
           }
        }
        stage('Test'){
            steps{
                bat 'gradle test'
            }
        }
        stage('Build'){
            steps{
                bat 'gradle build'
            }
        }
    }
}