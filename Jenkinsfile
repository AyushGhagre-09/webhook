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

        stage('Push changes')
         {
            // Use PAT for Git operations
        withCredentials([string(credentialsId: 'git-pat', variable: 'GITHUB_TOKEN')]) {
            
                // Configure Git with user email and name
                bat "git config user.email '${env.GIT_EMAIL}'"
                bat "git config user.name '${env.GIT_NAME}'"

                

// Set the remote URL securely without exposing the token in the script
    bat(script: "git remote set-url origin https://${env.GITHUB_TOKEN}@github.com/%GIT_USERNAME%/webhook.git", returnStdout: true).trim()

    // Now push changes using the securely set remote URL
    bat "git push origin main"
        }
           
         } 
    }catch (e) {
        // If there are any exceptions, mark the build as failed
        currentBuild.result = 'FAILED'
        throw e
    }
}
