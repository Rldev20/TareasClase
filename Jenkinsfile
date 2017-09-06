pipeline {
  agent any
  stages {
    stage('sonarQ') {
      steps {
        waitForQualityGate()
      }
    }
  }
}