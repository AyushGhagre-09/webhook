

node {
    stage('Hello') {
        // Use the global variable from the shared library
        sayHello 'Jenkins'
    }
    stage('Use Utils Class') {
        script {
            // Use the Utils class from the shared library
            def utils = new org.settings.HelperFunctions()
            def result = utils.add(5, 4)
            echo "The result is ${result}"
           
        }
    }
}
