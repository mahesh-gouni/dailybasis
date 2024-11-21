FROM Jenkins/Jenkins:lts-jdk17

USER root

RUN curl -sSL https://get.docker.com/ | sh

USER jenkins