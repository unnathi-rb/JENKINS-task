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
                bat 'echo rock > input.txt'  // You can change "rock" to any default choice
            }
        }

        stage('Build') {
            steps {
                echo "🔹 Compiling Game.java..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\javac.exe" game.java'
            }
        }

        stage('Run') {
            steps {
                echo "🔹 Running the game..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\java.exe" game'
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




