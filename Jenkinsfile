pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "🔹 Checking out code..."
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "🔹 Compiling game.java..."
                bat 'javac game.java'
            }
        }

        stage('Run') {
            steps {
                echo "🔹 Running the game..."
                bat 'java game'
            }
        }

        stage('Package') {
            steps {
                echo "🔹 Packaging into JAR..."
                bat 'jar cfe game.jar game game.class input.txt'
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Deploy step (simulated)"
            }
        }
    }

    post {
        success {
            echo "✅ Pipeline finished successfully!"
        }
        failure {
            echo "❌ Pipeline failed."
        }
    }
}




