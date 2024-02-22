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

                // Stage changes
                bat "git add ."

                def changesMade = bat(script: "git status --porcelain", returnStdout: true).trim()
                echo changesMade

               if(changesMade) {
                // There are changes to commit
                bat "git commit -m \"Triggered Build: ${env.BUILD_NUMBER}\""
             } else {
            // No changes to commit, set the build result to success and exit gracefully
            echo "No changes to commit. Exiting gracefully."
            currentBuild.result = 'SUCCESS'
            return // This exits the current stage/node but marks the build as successful
        }


                // Push changes using the PAT for authentication
                bat "git push https://${env.GITHUB_TOKEN}@github.com/${env.GIT_USERNAME}/webhook.git"
        }
           
         } 
    }catch (e) {
        // If there are any exceptions, mark the build as failed
        currentBuild.result = 'FAILED'
        throw e
    }
}
