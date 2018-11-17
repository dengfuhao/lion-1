#!/usr/bin/env bash

# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This script should be sourced into other lion
# scripts to setup the env variables

# We use LION_CFG_DIR if defined,
# otherwise we use /etc/mp
# or the conf directory that is
# a sibling of this script's directory

LION_BIN_DIR="${LION_BIN_DIR:-/usr/bin}"
LION_PREFIX="${LION_BIN_DIR}/.."
LION_HOME=$LION_PREFIX

if [ "x$LION_CFG_DIR" = "x" ]
then
  if [ -e "${LION_PREFIX}/conf" ]; then
    LION_CFG_DIR="$LION_BIN_DIR/../conf"
  else
    LION_CFG_DIR="$LION_BIN_DIR/../etc/lion"
  fi
fi

if [ "x${LION_DATA_DIR}" = "x" ]
then
    LION_DATA_DIR="${LION_PREFIX}/tmp"
fi

if [ "x${LION_LOG_DIR}" = "x" ]
then
    LION_LOG_DIR="${LION_PREFIX}/logs"
fi

if [ -f "${LION_BIN_DIR}/set-env.sh" ]; then
  . "${LION_BIN_DIR}/set-env.sh"
fi

if [ "x$LION_CFG" = "x" ]
then
    LION_CFG="lion.conf"
fi

LION_CFG="$LION_CFG_DIR/$LION_CFG"

if [ -f "$LION_BIN_DIR/java.env" ]
then
    . "$LION_BIN_DIR/java.env"
fi

if [ "x${LION_LOG4J_PROP}" = "x" ]
then
    LION_LOG4J_PROP="INFO,CONSOLE"
fi

if [ "$JAVA_HOME" != "" ]; then
  JAVA="$JAVA_HOME/bin/java"
else
  JAVA=java
fi


#add the conf dir to classpath
CLASSPATH="$LION_CFG_DIR:$LION_BIN_DIR/bootstrap.jar:$CLASSPATH"

#make it work in the binary package

for i in "${LION_PREFIX}"/lib/*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done

if [ -e "${LION_PREFIX}"/lib/plugins/*.jar ]; then
    for j in "${LION_PREFIX}"/lib/plugins/*.jar
    do
        CLASSPATH="$j:$CLASSPATH"
    done
fi

case "`uname`" in
    CYGWIN*) cygwin=true ;;
    *) cygwin=false ;;
esac

if $cygwin
then
    CLASSPATH=`cygpath -wp "$CLASSPATH"`
fi
