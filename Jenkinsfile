stage 'Checkout'
    node('master'){
        deleteDir()
        checkout scm
    }

stage 'Build & Archive'
    node('master'){
        sh 'export testando; ./build.sh'
        step([$class: 'ArtifactArchiver', artifacts: 'meu_aplicativo/build/outputs/war/meu_aplicativo.war'])
    }