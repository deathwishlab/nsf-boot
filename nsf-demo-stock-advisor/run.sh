#!/usr/bin/env bash
java $JAVA_OPTS -Dstock_provider_url=http://pf-provider -Dstock_viewer_url=http://pf-viewer -jar /opt/nsf/nsf-demo-stock-advisor-1.0-SNAPSHOT.jar
