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
                echo "🔹 Compiling RockPaperScissors.java..."
                bat 'javac game.java'
            }
        }

        stage('Test') {
            steps {
                echo "🔹 Running RockPaperScissors..."
                bat 'java game'
            }
        }

        stage('Package') {
            steps {
                echo "🔹 Creating JAR file..."
                bat 'jar cfe game.jar game game.class'
            }
        }

        stage('Deploy') {
            steps {
                echo "🔹 Deploy step (simulation)..."
                echo "✅ Game packaged successfully. Ready for deployment!"
            }
        }
    }

    post {
        success {
            echo "🎉 Pipeline executed successfully!"
        }
        failure {
            echo "❌ Pipeline failed."
        }
    }
}

