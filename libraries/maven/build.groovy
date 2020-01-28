void call(){
    stage("Maven: Build"){
        unstash name: "workspace"
        println "build from the maven library"
        withMaven{
           sh "mvn package -DskipTests"
        }
    }
}
