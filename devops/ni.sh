#!/bin/bash -xe

docker build ./devops/docker-ni -t gsbt:202

docker run -ti --rm \
    -v `pwd`:/work/:z \
    --entrypoint /bin/bash gsbt:202 \
    -c "sbt graalvm-native-image:packageBin && ./target/graalvm-native-image/graalvm202-scala-fence-bug"
