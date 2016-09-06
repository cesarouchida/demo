stage 'Checkout'
    node('master'){
        deleteDir()
        checkout scm
    }

stage 'Build & Archive'
    node('master'){
        sh 'mvn clean package'
        step([$class: 'ArtifactArchiver', artifacts: 'meu_aplicativo/build/outputs/war/meu_aplicativo.war'])
    }