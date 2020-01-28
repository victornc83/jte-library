void call(){
    stage("Maven: Build"){
        println "build from the maven library"
        sh "mvn package -DskipTests"
    }
}
