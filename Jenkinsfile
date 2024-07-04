pipeline {
    agent any
    tools {
        maven 'Apache Maven 3.6.3'
    }
    stages {
        stage('Build Maven'){
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/dickanirwansyah/demo-apps']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps {
                script {
                    sh 'docker build -t dickanirwansyah1996/demo-apps-jenkins:latest .'
                }
            }
        }
        stage('Push image to hub'){
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u dickanirwansyah1996 -p ${dockerhubpwd}'
                    }
                        sh 'docker push dickanirwansyah1996/demo-apps-jenkins:latest'
                }
            }
        }
    }
}