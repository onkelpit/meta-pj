DESCRIPTION = "Area51 Test App"
SECTION = "examples"
LICENSE = "CLOSED"
PR = "r0"

inherit cmake

SRCREV = "fec1fff2d8de5f8b271d3fa1c2bb0956bd626035"
SRC_URI = "git://github.com/onkelpit/Area51.git;protocol=https;branch=master;"
SRC_URI[sha256sum] = "eada7cfad100e9b03f01fdd805e1358ef619292deb919148a94996f81d1a36d4"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 bin/main ${D}${bindir}
    install -m 0755 bin/tests ${D}${bindir}
}

