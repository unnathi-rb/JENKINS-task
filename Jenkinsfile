stage('Build') {
    steps {
        echo "🔹 Compiling RockPaperScissors.java..."
        bat 'javac RockPaperScissors.java'
    }
}

stage('Test') {
    steps {
        echo "🔹 Running RockPaperScissors..."
        bat 'java RockPaperScissors'
    }
}

stage('Package') {
    steps {
        echo "🔹 Creating JAR file..."
        bat 'jar cfe RockPaperScissors.jar RockPaperScissors RockPaperScissors.class'
    }
}



