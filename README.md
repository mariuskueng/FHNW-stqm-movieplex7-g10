# movieplex 7 Hands-on labs

## Run app

    # Maven
    mvn wildfly:run

## Sonarqube

### Setup

    # Install sonar
    brew install sonar

    # Start mysql server
    mysql.server start

    # Start sonar
    sonar start

    # Go to movieplex directory
    mvn sonar:sonar

    # Maybe check sonar settings when having issues (enable localhost:9000)
    /usr/local/Cellar/sonar-runner/2.4/libexec/conf/sonar-runner.properties

### Analyze code metrics

Open `http://localhost:9000/`
