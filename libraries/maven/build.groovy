void call(){
    stage("Maven: Build"){
        println "build from the maven library"
        withMaven(){
            echo $POM_DISPLAYNAME
            mvn package -DskipTests
        }
    }
}
