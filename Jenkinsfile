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
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\javac.exe" game.java'
            }
        }

        stage('Run') {
            steps {
                echo "🔹 Running the game..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\java.exe" game'
            }
        }

        stage('Package') {
            steps {
                echo "🔹 Packaging into JAR..."
                bat '"C:\\Program Files\\Java\\jdk-21\\bin\\jar.exe" cfe game.jar game game.class input.txt'
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Deploying..."
                echo "✅ Deployment successful (simulation)."
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




