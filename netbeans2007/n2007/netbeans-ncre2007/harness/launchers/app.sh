#!/bin/sh

#
# resolve symlinks
#

PRG=$0

while [ -h "$PRG" ]; do
    ls=`ls -ld "$PRG"`
    link=`expr "$ls" : '^.*-> \(.*\)$' 2>/dev/null`
    if expr "$link" : '^/' 2> /dev/null >/dev/null; then
	PRG="$link"
    else
	PRG="`dirname "$PRG"`/$link"
    fi
done

progdir=`dirname "$PRG"`
APPNAME=`basename "$0"`

if [ -f "$progdir/../etc/$APPNAME".conf ] ; then
    . "$progdir/../etc/$APPNAME".conf
fi

# XXX does not correctly deal with spaces in non-userdir params
args=""

case "`uname`" in
    Darwin*)
        userdir="${default_mac_userdir}"
        ;;
    *)
        userdir="${default_userdir}"
        ;;
esac
while [ $# -gt 0 ] ; do
    case "$1" in
        --userdir) shift; if [ $# -gt 0 ] ; then userdir="$1"; fi
            ;;
        *) args="$args $1"
            ;;
    esac
    shift
done

if [ -f "${userdir}/etc/$APPNAME".conf ] ; then
    . "${userdir}/etc/$APPNAME".conf
fi

readClusters() {
  if [ -x /usr/ucb/echo ]; then
    echo=/usr/ucb/echo
  else
    echo=echo
  fi
  sep=""
  while read X; do 
    $echo -n $sep
    $echo -n "$progdir/../$X"
    sep=":"
  done
}
clusters=`cat "$progdir/../etc/$APPNAME".clusters | readClusters`

if [ ! -z "$extraclusters" ] ; then
    clusters="$clusters:$extraclusters"
fi

nbexec="$progdir/../platform6/lib/nbexec"

case "`uname`" in
    Darwin*)
        sh "$nbexec" \
            --jdkhome "$jdkhome" \
            -J-Dcom.apple.mrj.application.apple.menu.about.name="$APPNAME" \
            -J-Xdock:name="$APPNAME" \
            --branding "$APPNAME" \
            --clusters "$clusters" \
            --userdir "${userdir}" \
            ${default_options} \
            $args
        ;;
    *)
        sh "$nbexec" \
            --jdkhome "$jdkhome" \
            --branding "$APPNAME" \
            --clusters "$clusters" \
            --userdir "${userdir}" \
            ${default_options} \
            $args
        ;;
esac
