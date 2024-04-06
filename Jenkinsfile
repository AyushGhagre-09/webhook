node {

    def buildProj = new org.win.BuildSteps()
    def postBuild = new org.win.PostBuildSteps()
    def helpers = new org.settings.HelperFunctions()
    def gitVersion = new org.tools.GitVersion()
    def branchName = env.BRANCH_NAME 
    def projectName = 'CatchPoint.Hawk.FrontEnd.HawkUI' //this will be your sln name minus the sln
    currentBuild.result="SUCCESS"
    
    def workspace = helpers.getWorkspaceDirectory()
    def configEnvironment = helpers.getConfigEnvironment()
    def msiLocation = helpers.getMSIDepositLocation()
    def versionInfo;
    def isPR = env.BRANCH_NAME.toLowerCase().startsWith("pr")
    def projectShortName = 'hawkui'
    def workspace_sso = "S:\\JenkinsWorkArea\\" + branchName +"\\apps\\Hawk\\FrontEnd"
    def workspace_SinglesignOn = "S:\\JenkinsWorkArea"

    if(isPR) {
        echo 'PR Builds are not implemented for HawkUI at this time'
        return;
    }

}
