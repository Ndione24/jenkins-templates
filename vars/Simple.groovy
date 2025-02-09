
def call(Map args = [:]){

    pipeline{
        agent any
        stages{
            stage('Build'){
                steps{
                    echo "Building"
                    echo "Converted to uppercase: ${Utils.toUpperCase(name)}"
                }
            }
            stage('Test'){
                steps{
                    echo "Testing"
                }
            }
            stage('Deploy'){
                steps{
                    echo "Deploying"
                }
            }
        }
    }
}

