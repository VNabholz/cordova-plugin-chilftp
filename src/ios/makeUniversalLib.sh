#!/bin/bash -ev

cd libs

libtool -static x86_64/libchilkatIos-x86_64.a arm64/libchilkatIos-arm64.a -o libchilkatIos.a

cd ..
