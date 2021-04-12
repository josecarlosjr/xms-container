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
        
        stage('cleaning up'){
            steps {
                script {
                    echo "test" 
                    //lib.buildXcipioXms()
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
