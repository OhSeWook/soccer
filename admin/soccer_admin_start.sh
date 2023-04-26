#!/bin/sh

APP_PORT={7070}
nohup java -jar -Dserver.port=$APP_PORT /var/lib/jenkins/workspace/soccer_all/admin/target/admin-0.0.1.admin-SNAPSHOT.jar > /dev/null 2>&1 