#!/usr/bin/env bash
java $JAVA_OPTS -Dstock_provider_url=http://pf-provider -Dstock_advisor_url=http://pf-advisor -Dstock_middleware_url=http://pf-middleware -jar /opt/nsf/nsf-demo-stock-viewer-1.0-SNAPSHOT.jar
