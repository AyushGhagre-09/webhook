node {
    
    

    try {
        stage('Clone repository') {
            // This will use the credentials you've specified in the job configuration
            git branch: 'main', url: 'https://github.com/AyushGhagre-09/webhook.git'
        }

        stage('Add file and commit') {
            // Add a file to the repo
            writeFile file: 'example.txt', text: 'This is an example file'
            
            
            
            // Git add and commit
            bat 'git add example.txt'
            bat 'git commit -m "Add example file"'
        }

        stage('Push changes') {
           withCredentials([gitUsernamePassword(credentialsId: '9a1cc700-c524-44ff-b78c-cddc92a4785e', gitToolName: 'Git')]) {
          bat "git push"
      }
        }
    } catch (e) {
        // If there are any exceptions, mark the build as failed
        currentBuild.result = 'FAILED'
        throw e
    }
}
