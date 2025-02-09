
def call(Map params = [:]){

    pipeline{
        agent any
        stages{
            stage('Build'){
                steps{
                    echo "Building"
                    echo "Converted to uppercase: ${Utils.toUpperCase(params.name)}"
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

