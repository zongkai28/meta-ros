SUMMARY = "A package containing some diagnostics related message and service definitions."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rosidl-typesupport-cpp \
    ros2-geometry-msgs \
    ros2-std-msgs \
"

ROS_BPN = "diagnostic_msgs"

include common-interfaces.inc
