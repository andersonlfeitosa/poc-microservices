node {
  git 'http://github.com/andersonlfeitosa/poc-openshift-microservice1.git'

  env.PATH = "${tool 'Maven3'}/bin:${env.PATH}"
  env.PATH = "${tool 'jdk8u102'}/bin:${env.PATH}"
  env.DOCKER_HOST = "tcp://0.0.0.0:2375"
  env.JAVA_HOME = "${tool 'jdk8u102'}"

  sh 'mvn clean install docker:build docker:push'

}
