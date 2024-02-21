node {
    // Define variables for repository
    def repoUrl = 'https://github.com/AyushGhagre-09/webhook.git'
    

    try {
        stage('Clone repository') {
            // This will use the credentials you've specified in the job configuration
            git url: repoUrl
        }

        stage('Add file and commit') {
            // Add a file to the repo
            writeFile file: 'example.txt', text: 'This is an example file'
            
            
            
            // Git add and commit
            bat 'git add example.txt'
            bat 'git commit -m "Add example file"'
        }

        stage('Push changes') {
            // This assumes that your credentials are correctly set up for Git to use them automatically
            bat 'git push'
        }
    } catch (e) {
        // If there are any exceptions, mark the build as failed
        currentBuild.result = 'FAILED'
        throw e
    }
}
