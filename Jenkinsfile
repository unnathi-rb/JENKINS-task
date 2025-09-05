pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo '🔹 Checking out code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo '🔹 Compiling RockPaperScissors.java...'
                sh 'mkdir -p build'
                sh 'javac -d build RockPaperScissors.java'
            }
        }

        stage('Test') {
            steps {
                echo '🔹 Running Rock, Paper, Scissors (auto input)...'
                // Feeds "Rock" as input to avoid pipeline hang
                sh 'echo "Rock" | java -cp build RockPaperScissors'
            }
        }

        stage('Package') {
            steps {
                echo '🔹 Creating JAR...'
                sh 'jar cfe build/RockPaperScissors.jar RockPaperScissors -C build .'
            }
        }

        stage('Deploy') {
            steps {
                echo '🔹 Deploying JAR to /tmp/deploy...'
                sh 'mkdir -p /tmp/deploy && cp build/RockPaperScissors.jar /tmp/deploy/'
            }
        }
    }

    post {
        success {
            echo '✅ Rock, Paper, Scissors pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
