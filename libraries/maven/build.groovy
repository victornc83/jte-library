void call(){
    stage("Maven: Build"){
        unstash name: "workspace"
        println "build from the maven library"
        sh "mvn package -DskipTests"
    }
}
