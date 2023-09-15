#!/usr/bin/env bash
java $JAVA_OPTS -javaagent:/opt/apm/skywalking-napm-bin-8.10.0-latest/agent/skywalking-agent.jar -Dskywalking_config=/opt/apm/skywalking-napm-bin-8.10.0-latest/agent/config/agent.config -jar /opt/nsf/nsf-demo-stock-middleware-1.0-SNAPSHOT.jar
