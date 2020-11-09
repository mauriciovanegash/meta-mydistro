SUMMARY = "OpenCV example for video capture"
DESCRIPTION = "The command will capture frames from any available camera in the system"
AUTHOR = "Mauricio Vanegas <mauriciovanegash@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "opencv"
PV = "0.1"

SRCREV = "${AUTOREV}"

#SRC_URI = "git:///home/mauricio/MyProjects/git_repos/myapp-jetson-nano/;protocol=file;branch=main"
SRC_URI = "git://github.com/mauriciovanegash/myapp-jetson-nano.git;branch=main;protocol=https"

inherit pkgconfig cmake cuda

S = "${WORKDIR}/git"
