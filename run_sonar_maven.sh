#!/bin/bash

SCRIPT_NAME="run_sonar_analysis.sh"

# MONTA SCRIPT DE EXECUÇÃO DO SONARQUBE VIA MAVEN
MAVEN_COMMAND="mvn clean verify sonar:sonar \
    -Dsonar.projectKey=gestao_vagas \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login=sqp_2ea04a2a1adbb775d4795d119e9cf9c8f5dd4505"

# Executar o comando Maven
echo "Executando análise SonarQube..."
$MAVEN_COMMAND

# Verificar se a execução foi bem-sucedida
if [ $? -eq 0 ]; then
  echo "Análise SonarQube concluída com sucesso!"
else
  echo "Ocorreu um erro durante a análise SonarQube."
fi
