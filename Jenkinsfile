

node {
    stage('Hello') {
        // Use the global variable from the shared library
        sayHello 'Jenkins'
    }
    stage('Use Utils Class') {
        script {
            // Use the Utils class from the shared library
            def utils = new org.settings.HelperFunctions()
            int a=10,b=20,c=30;
            int sum =a+b+c;
            print("sum is : "+sum)
           
        }
    }
}
