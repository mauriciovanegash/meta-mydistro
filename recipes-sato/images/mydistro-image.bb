SUMMARY = "MyDistro development image"

DESCRIPTION = "Image with Sato, a mobile environment and visual style for \
mobile devices. The image supports X11 with a Sato theme, Pimlico \
applications, and contains terminal, editor, and file manager."

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image

TOOLCHAIN_HOST_TASK_append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK_remove_task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

#Base packages
IMAGE_INSTALL_append = " cuda-compiler cuda-cufft cuda-toolkit cuda-samples tensorrt cudnn libvisionworks gstreamer1.0-plugins-nvvideo4linux2"

#Support packages for docker support
IMAGE_INSTALL_append = " nvidia-docker nvidia-container-runtime cudnn-container-csv tensorrt-container-csv libvisionworks-container-csv"

#Support for Intel drivers
IMAGE_INSTALL_append = " networkmanager wireless-regdb-static backport-iwlwifi"

#OpenCV packages for user development
IMAGE_INSTALL_append = " libopencv-core-dev libopencv-highgui-dev libopencv-imgproc-dev libopencv-objdetect-dev libopencv-ml-dev"
IMAGE_INSTALL_append = " opencv-apps opencv-dev python3-opencv python3-modules"
