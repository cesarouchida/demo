stage 'Checkout'
    node('master'){
        deleteDir()
        checkout scm
    }

stage 'Build & Archive'
    node('master'){
        deleteDir()
        checkout scm
//        sh 'gradle -m clean compile'
//        step([$class: 'ArtifactArchiver', artifacts: 'meu_aplicativo/build/outputs/war/meu_aplicativo.war'])
    }