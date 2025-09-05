pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "🔹 Checking out code..."
                checkout scm
            }
        }

        stage('Prepare Input') {
            steps {
                echo "🔹 Creating input.txt for Jenkins run..."
                bat 'echo rock>input.txt' // no spaces around > to avoid trailing space
            }
        }

        stage('Build') {
            steps {
                echo "🔹 Compiling Game.java..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\javac.exe" Game.java'
            }
        }

        stage('Run') {
            steps {
                echo "🔹 Running the game..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\java.exe" Game'
            }
        }
    }

    post {
        success {
            echo "🎉 Pipeline completed successfully!"
        }
        failure {
            echo "❌ Pipeline failed."
        }
    }
}





