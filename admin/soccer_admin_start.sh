#!/bin/sh

nohup java -jar -Dserver.port=7070 /var/lib/jenkins/workspace/soccer_all/admin/target/admin-0.0.1.admin-SNAPSHOT.jar >> /usr/osw/soccer/admin/logs/soccerAdminLog.log 2>&1 &

