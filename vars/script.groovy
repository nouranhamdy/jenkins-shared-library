#!/usr/bin/env groovy

def call(java.lang.String username, java.lang.String password){
    sh """
        docker build  -t nodeapp:v1 .
        docker login -u $username -p $password
        docker image tag nodeapp:v1 nouranhamdy1998/nodeapp:v1 
        docker image push nouranhamdy1998/nodeapp:v1 
    """
}