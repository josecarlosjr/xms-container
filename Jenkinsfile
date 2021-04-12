pipeline {
    agent {
        label('master')
    }
    
    stages {
        stage('Checkout SCM'){
            steps {
                script {
                    sh 'echo "Repo test"'  
                }
            }
            
        }
        
        stage('build fake'){
            steps {
                script {
                    sh 'echo "docker build -t <>:<> | tee /tmp/logs"'
                }
            }
        }
        
        stage('Load Lib'){
            steps {
                script {
                    echo "test"
                    lib = load("common-container.groovy")
                    //lib.buildXcipioXms()
                }
            }
        }
        
        stage('build Xcipio - XMS - Help'){
            steps {
                script {
                    lib.buildXcipioXms()
                }
            }
        }
        
        stage('cleaning up'){
            steps {
                script {
                    sh 'echo "rm -rf"'
                }
            }
        }
        
        
    }
    
}
