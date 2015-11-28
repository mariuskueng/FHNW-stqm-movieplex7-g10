# movieplex 7 Hands-on labs

[![Build Status](https://travis-ci.org/mariuskueng/FHNW-stqm-movieplex7-g10.svg?branch=master)](https://travis-ci.org/mariuskueng/FHNW-stqm-movieplex7-g10)

## Setup

    brew install wildfly-as

## Usage

    # Maven
    mvn wildfly:run

    # Intellij Ultimate
    Set `wildfly-as` path in JBoss application server config of **Intellij** (Run configurations).

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
